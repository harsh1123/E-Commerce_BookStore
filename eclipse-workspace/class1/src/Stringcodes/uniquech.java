package Stringcodes;
import java.util.Scanner;

public class uniquech {
	public static void uniqueString(String a)
	{
		char[] ch=a.toCharArray();
		
		for(int i=0;i<ch.length;i++)
			for(int j=i+1;j<ch.length;j++)
				if(ch[i]==ch[j]) {
					System.out.print("No");
					return;
				}
		System.out.print("yes");
			
			
		
		
		
	}

	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		
		String b=obj.next();
		
		uniqueString(b);
		
		
		
	}

}
