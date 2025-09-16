package init;

import static tools.NirajTools.*;

public class asig1 
{
	public static void main(String[] args) 
	{
		
	double pi = Math.PI;
		
	double R = getDoubleInput("give me radius");
	
	double P = (2*R*pi);
	
	double R2 = Math.pow(R, 2);
	 
	double A = (pi*R2);
	
	System.out.println("Area of circle is "+A);
	
	System.out.println("Perimeter of circle is "+P);
	
		
	}
}
