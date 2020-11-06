import java.util.*;
public class genericsAndColletcion {
	
public   static < E > void show( E[] input)
	{
	
	for(E temp:input)
	{
		System.out.println(temp);
	
		
		
	}

		
		
	}

	public static void main(String[] args) {
	
		
		int[] a= {10,20,30,40};
		char[] b= {'d','e','c'};
		
		show(a);
		
	}

}
