package Stringcodes;
import java.util.Scanner;

public class Stringconcat {
	public static void concat(String a,String b)
	{
		
		StringBuffer n=new StringBuffer("");
		
		n=n.append(a).append(b);
		String s=n.toString();
		System.out.print(s);
		
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		String a=obj.next();
		String b=obj.next();
		
		concat(a,b);

	}

}
