package exceptionHandling;


public class ExampleException {
	public static void main(String args[]) 
    {
		int a[]=new int[5];
		int k=10;
		try
		{
			System.out.println(k/2);
			System.out.println( a[4] );
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("hello");
		}
		
		

		
		
    }
}
