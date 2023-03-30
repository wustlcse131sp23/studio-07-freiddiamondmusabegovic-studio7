package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return (2 * length) + (2* width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public boolean smaller(Rectangle other) {
		if (this.area() < other.area())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean square() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[]args) {
	Rectangle newRectangle = new Rectangle(7, 1);
	System.out.println(newRectangle.square());
}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}
