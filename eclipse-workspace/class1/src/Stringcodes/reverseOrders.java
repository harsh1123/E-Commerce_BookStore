package Stringcodes;
import java.util.Scanner;
public class reverseOrders {
	
	
	public static String reverse(String str)
	{
		
		char[] a=str.toCharArray();
		char ch;
		int n=a.length;
		for(int i=0;i<n/2;i++)
		{
			ch=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=ch;
		}
		
		return new String(a);
		
	}


	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		s=s+" ";
		
		char[] a=s.toCharArray();
		String word= "";
		String n="";
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				word=word+a[i];
				
				
			}
			else
			{
				n=n+reverse(word)+" ";
				word="";
				
				
			}
			
			
			
		}
		
		System.out.println(n);
	}

}
