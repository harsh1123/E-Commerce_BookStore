package Stringcodes;
import java.util.*;
interface AdvancedArithmetic
{
  void divisor_sum(int n);
}

public class Main implements AdvancedArithmetic{
	
	 public  void divisor_sum(int n)
	{
		 int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			 if(n%i==0)
			 {
				 sum=sum+i;
			 }
		 }
		 System.out.println(sum);
		
		
	}

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Main ob=new Main();
		
		int n=obj.nextInt();
		ob.divisor_sum(n);
		
		
		
		
	}
	
	

}
