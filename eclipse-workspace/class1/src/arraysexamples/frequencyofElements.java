package arraysexamples;

public class frequencyofElements {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,1,3,4,2,3};
		
		int[] fr=new int[a.length];
		
		
		 for(int i=0; i<a.length; i++)
		    {
		       int  count = 1;
		        for(int j=i+1; j<a.length ; j++)
		        {

		            if(a[i]==a[j])
		            {
		                count++;

		                
		                fr[j] = 0;
		            }
		        }

		        if(fr[i] != 0)
		        {
		            fr[i] = count;
		        }
		    }
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(fr[i]!=0)
			 {
				 System.out.println("Frequency of "+a[i]+"is "+fr[i]);
			 }
			 
		 }

		
	}

}
