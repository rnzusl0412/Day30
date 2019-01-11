package Quiz05;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {

		super.setHeight(super.getHeight() + size);
	}

	@Override
	public double getArea() {
		return getHeight() * getWidth() / 2.0;
	}

}
