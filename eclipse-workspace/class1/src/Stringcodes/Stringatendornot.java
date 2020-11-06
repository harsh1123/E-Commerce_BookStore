package Stringcodes;
import java.util.Scanner;

public class Stringatendornot {

	public static int check(String a,String b)
	{
		char[] ch=a.toCharArray();
		char[] ch1=b.toCharArray();
		int c=2;
		
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]==ch1[0])
			{
				int j=1;
				int k=i+1;
				while(j<ch1.length)
				{
					if(ch1[j]!=ch[k])
					{
						c=-1;
						return 0;
					}
					k++;
					j++;
					
				}
				if(c>0)
				{
					break;
				}
				
			}
			
		}
		return 1;
		
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		String a=obj.next();
		String b=obj.next();
		int d=check(a,b);
		
		System.out.print(d);
	
		
		

	}

}
