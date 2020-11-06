package Stringcodes;
import java.util.Scanner;

public class reverseWords {
	public static void reverseit(String word)
	{
		char[] ch=word.toCharArray();
		int s=(ch.length);
		char temp;
		for(int i=0;i<s/2;i++)
		{
			
			temp=ch[i];
			ch[i]=ch[s-i-1];
			ch[s-i-1]=temp;
			
			
		} 
		System.out.print(new String(ch)+" ");
		
	}
	
	public static void reverse(String s)
	{
		
		char[] ch=s.toCharArray();
		String word= "";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				word=word+ch[i];
			}
			else
			{
				reverseit(word);
				word="";
			}
		
		}
		reverseit(word);
		
		
		
	}

	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		reverse(s);
	}

}
