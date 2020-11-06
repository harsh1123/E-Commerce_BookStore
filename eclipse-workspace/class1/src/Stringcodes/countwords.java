package Stringcodes;
import java.util.Scanner;

public class countwords {
	
	public static int count(String s)
	{
		int c=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				c++;
				
			}
			
			
		}
		
		return c;
	}

	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		String s=obj.nextLine();
		
		int d=count(s);
		System.out.print(d);
		
		
		
		
	}

}
