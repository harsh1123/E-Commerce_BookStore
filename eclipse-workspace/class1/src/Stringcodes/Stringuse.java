package Stringcodes;
import java.util.Scanner;

public class Stringuse {
	public static void compare(String a,String b)
	{
		char[] ch=a.toCharArray();
		char[] ch1=b.toCharArray();
		int i=0;
		
		while(i<ch.length && i<ch1.length)
		{
			
			if(ch[i]!= ch1[i])
			{
				System.out.print(ch[i]-ch1[i]);
				return;
			}
			i++;
			
		}
		System.out.print(0);
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		String a=obj.next();
		String b=obj.next();
		compare(a,b);

	}

}
