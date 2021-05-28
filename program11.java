
import java.util.Scanner;

public class program11 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		double pi=3.14,r,ar,pm;
		 
		System.out.println("Enter circle radius no:");
		r=s.nextDouble();
		ar=pi*r*r;
		pm=2*pi*r;
		System.out.println("Area of circle="+ar);
		System.out.println("Perimeter of Circle:"+pm);	
	}

}