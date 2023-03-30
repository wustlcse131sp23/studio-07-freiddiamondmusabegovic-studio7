package studio7;

public class Complex {
	private double A;
	private double b;
	
	public Complex(double A, double b) {
		this.A = A;
		this.b = b;
		
	}
	
	public Complex sum(Complex other) {
		double A_ = this.A + other.A;
		double b_ = this.b + other.b;
		Complex C = new Complex(A_, b_);
		return C;
		
	}
	public Complex prod(Complex other) {
		double A_ = (this.A * other.A) - (this.b * other.b);
		double b_ = (this.A * other.b) + (this.b * other.A);
		Complex P = new Complex(A_, b_);
		return P;
		
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return A + "+" + b + "i";	

}
	public static void main(String[]args) {
		System.out.println(new Complex(3, 4));
	}
	}
