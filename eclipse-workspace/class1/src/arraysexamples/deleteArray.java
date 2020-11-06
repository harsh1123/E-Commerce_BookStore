package arraysexamples;

public class deleteArray {

	public static void main(String[] args) {
		
		int[] a= {3,4,5,6,7,8};
		int p=1;
	 
		int s=a.length;
		int[] c=new int[s-1]; 
		int j=0;
		for(int i=0;i<s;i++)
		{
			if(a[i]!=a[p-1])
			{
				c[j]=a[i];
				j++;
				
			}
			
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
		
		

	}

}
