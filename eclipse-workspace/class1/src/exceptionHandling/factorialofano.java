package exceptionHandling;
import java.util.Scanner;
public class factorialofano {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sum=1;
		
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
		
		
		
	}

}
