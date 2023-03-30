package studio7;

public class Die {
private int sides; 

public Die(int sides)
{
this.sides = sides;
}

public int roll()
{
int x = (int)(Math.random() * sides);
return x; 
}

public int getSides() {
	return sides;
}

public void setSides(int sides) {
	this.sides = sides;
}

@Override
public String toString() {
	return "Die [sides=" + sides + "]";
}


public static void main(String [] args)
{
	Die dice = new Die(10);
	System.out.println(dice);
}
}