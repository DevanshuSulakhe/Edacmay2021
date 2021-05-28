import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+no*i);
		}	
	}
}