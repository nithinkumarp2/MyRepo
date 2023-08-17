package programs1;

public class subarray_sum {

	public static void main(String[] args) {
		   int []a= {-10,20,-30,40};
		 //  int n=a.length;
		 int max=0;
		   for (int i = 0; i < a.length; i++) {
			 
			   for (int j = i; j < a.length; j++) {
				   int sum=0;
				   for (int j2 = i; j2 <=j; j2++) {
					 
					System.out.print(a[j2]+",");
					sum=sum+a[j2];
					if (sum>max) {
						max=sum;
					}
					 
				}
				   System.out.print(" sum"+sum);
				   System.out.println();
				//  System.out.print(a[j]+" ");
			}  
			  
		}
		   System.out.println("maximum sub array is"+max);
		   
		   ///////////////////////////////////////////////////
		   
		   int []a1= {-10,20,-30,40};
			int max1=0;
			int sum1=0;
			for (int i = 0; i < a1.length; i++) {
				
				sum1=sum1+a[i];
				if (sum1<max1) {
					max1=sum1;
				}
				else if(sum1<0) {
					sum1=0;
				}
				
			}
			 System.out.println(max1);
			 

	}

}
