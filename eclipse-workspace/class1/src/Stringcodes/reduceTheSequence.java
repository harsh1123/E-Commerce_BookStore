package Stringcodes;
import java.util.Scanner;

public class reduceTheSequence {
	public static void reduce(String a,String b)
	{
		
		char ch=b.charAt(0);
		
		char[] c=a.toCharArray();
		int s=c.length;
		
		for(int i=0;i<s-1;i++)
		{
			
			
				if(c[i]==ch && c[i+1]==ch)
				{
					for(int j=i;j<s-1;j++)
					{
						c[j]=c[j+1];
						
					}
						
					s--;
					
					i=i-1;
					
				}
				
				
			
			
		}
		String p=new String(c);
		System.out.print(p);
		
		
	}

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	
	String a=obj.next();
	String c=obj.next();
	
	reduce(a,c);

	}

}
