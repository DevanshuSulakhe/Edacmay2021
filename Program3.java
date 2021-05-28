import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1,n2,div;
		
		System.out.println("Enter two no:");
		n1=s.nextInt();
		n2=s.nextInt();
		
		div=n1/n2;
		System.out.println("Divide="+div);
	}
}