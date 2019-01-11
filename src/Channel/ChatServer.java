package Channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.*;

public class ChatServer {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Selector selector = Selector.open();
		System.out.println("Selector open : " + selector.isOpen());
		ServerSocketChannel serverSocket = ServerSocketChannel.open();
		InetSocketAddress hostAddress = new InetSocketAddress("localhost", 0304);
		serverSocket.bind(hostAddress);
		serverSocket.configureBlocking(false);
		int ops = serverSocket.validOps();
		SelectionKey selectKey = serverSocket.register(selector, ops, null);
		for (;;) {
			System.out.println("셀렉트 대기 ");
			int noOfKeys = selector.select();
			System.out.println("셀렉트 키 : " + noOfKeys);

			Set<SelectionKey> selectedKeys = selector.selectedKeys();
			Iterator<SelectionKey> iter = selectedKeys.iterator();

			while (iter.hasNext()) {
				SelectionKey key = iter.next();

				if (key.isAcceptable()) {
					SocketChannel client = serverSocket.accept();
					client.configureBlocking(false);

					client.register(selector, SelectionKey.OP_READ);
					System.out.println("새로운 클라이언트 접속 : " + client);
				} else if (key.isReadable()) {
					SocketChannel client = (SocketChannel) key.channel();
					ByteBuffer buffer = ByteBuffer.allocate(256);
					client.read(buffer);
					String output = new String(buffer.array()).trim();

					System.out.println("클라이언트로 부터 온 메세지 : " + output);
					if (output.equals("EOF")) {
						client.close();
						System.out.println("종료!");
					}
				}
				iter.remove();
			}
		}
	}
}
