package class1;
class min
{
static int 	m(int k,int l)
{
	if(k>l)
		return k;
	else
		return l;}
static double 	m(double p,double q)
{
	if(p>q)
		return p;
	else
		return q;}

}

public class minimum {

	public static void main(String[] args) {
		
		int a=3;
		int b=4;
		double i=2.3;
		double j=3.4;
		System.out.println(min.m(10, 11));
		System.out.println(min.m(10.1, 11.1));

	}

}
