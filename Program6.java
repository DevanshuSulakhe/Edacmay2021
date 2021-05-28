import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1,n2,add,sub,mul,div,mod;
		System.out.println("Enter two no:");
		n1=s.nextInt();
		n2=s.nextInt();
		
		add=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		div=n1/n2;
		mod=n1%n2;
		
		System.out.println("Addition="+add);
		System.out.println("Subtration="+sub);
		System.out.println("Multiplication="+mul);
		System.out.println("Divide="+div);
		System.out.println("Remender="+mod);
	}
}