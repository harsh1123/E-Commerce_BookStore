import java.util.*;
public class generics {

	public static void main(String[] args) {
		
		Stack<Integer> list=new Stack();
		
		Scanner obj=new Scanner(System.in);
		
		int n=obj.nextInt();
		int b;
	
		
		
		for(int i=0;i<n;i++)
		{
			list.push(obj.nextInt());
			
		
			
			
		}
		
		int l=list.size();
		
		for(int i=0;i<l+1;i++)
		{
			System.out.println(list.pop());
		}
	
	}

}
