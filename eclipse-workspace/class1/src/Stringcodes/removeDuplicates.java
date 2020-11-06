package Stringcodes;
import java.util.Scanner;

public class removeDuplicates {
	
	public static void remove(String a)
	{
		StringBuffer sb=new StringBuffer();
		
		char lastCh=a.charAt(0);
		sb.append(lastCh);
		
		
		for(int j=1;j<a.length();j++)
		{
			if(lastCh!=a.charAt(j))
			{
				lastCh=a.charAt(j);
				sb.append(lastCh);
			}
			
		}
		
		String g= sb.toString();
		System.out.print(g);
		
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		String a=obj.next();
		remove(a);
				
		
	}

}
