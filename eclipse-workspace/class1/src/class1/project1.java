package class1;
class addr{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
}

public class project1 {
public static void main(String args[])
{
	System.out.println(addr.add(11,11));
	System.out.println(addr.add(11.1,11.1));
	}
}
