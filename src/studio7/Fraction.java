package studio7;

public class Fraction {
private int denom; 
private int numer; 

public Fraction(int numer, int denom)
{
	this.numer = numer;
	this.denom = denom; 
}

public Fraction add(Fraction other) {
	int newnum = this.numer * other.denom + other.numer * this.denom ;
	int newdenom = this.denom * other.denom;
	Fraction y = new Fraction(newnum, newdenom);
	return y;
}
public Fraction product (Fraction other) {
	int newnum = this.numer * other.numer ;
	int newdenom = this.denom * other.denom;
	Fraction z = new Fraction(newnum, newdenom);
	return z;
}


public Fraction recip() {
	int newnum = this.denom ;
	int newdenom = this.numer;
	Fraction z = new Fraction(newnum, newdenom);
	return z;
}


}



