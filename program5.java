import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1,n2,mul;
		
		System.out.println("Enter two no:");
		n1=s.nextInt();
		n2=s.nextInt();
		
		mul=n1*n2;
		System.out.println("Multiply="+mul);
	}
}