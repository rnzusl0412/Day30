package Channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ChatClient {
	public static void main(String[] args) throws IOException, InterruptedException {
		InetSocketAddress hostAddress = new InetSocketAddress("localhost", 0304);
		SocketChannel client = SocketChannel.open(hostAddress);

		System.out.println("서버로 메세지 보냄...");
		String[] messages = new String[] { "계절은 언제나 신기합니다.", "시간이 빠르게 지나가요.", "EOF" };

		for (int i = 0; i < messages.length; i++) {
			byte[] message = new String(messages[i]).getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(message);
			buffer.clear();
			Thread.sleep(3000);
		}
		client.close();
	}
}
