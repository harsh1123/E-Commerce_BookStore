package Stringcodes;
import java.lang.*;
import java.util.Scanner;

public class Stingpalindrome {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	String s=obj.nextLine();
	
	int x=checkcount(s);
	System.out.println(x);
	

	}
	public static int checkcount(String str)
	{
		int count=0;
		
		String word="";
		char[] a=str.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				word=word+a[i];
			}
			else
			{
				int x=checkp(word);
				if(x==1)
				{
					count++;
				}
				word="";
			}
			
		}
		return count;
		
		
		
		
	}
	
	public static int checkp(String s)
	{
		int n=s.length();
		String m=s.toLowerCase();
		for(int j=0;j<n/2;j++)
		{
			if(m.charAt(j)!=m.charAt(n-j-1))
				return 0;
		}
		return 1;
		
	}

}
