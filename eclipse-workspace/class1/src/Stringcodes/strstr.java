package Stringcodes;
import java.util.Scanner;

public class strstr {
	public static int strstr1(String a,String b)
	{
		char[] ch=a.toCharArray();
		char[] ch1=b.toCharArray();
		int c=0;
		int i=0;
		
	for( i=0;i<ch.length;i++)
	{
		if(ch[i]==ch1[0])
		{
		int j=1;
		int k=i+1;
			while(j<ch1.length)
			{
				c=2;
				if(ch1[j]!=ch[k])
				{
					c=-1;
					return -1;
				
				}
				k++;
				j++;
				
			}
			if(c>0)
			{
				c=i;
				break;
			}
			
		}
		
	
		
		
		
	}
	return c;
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		String a=obj.nextLine();
		String b=obj.nextLine();
		
		int d=strstr1(a,b);
		System.out.print(d);
		
	}

}
