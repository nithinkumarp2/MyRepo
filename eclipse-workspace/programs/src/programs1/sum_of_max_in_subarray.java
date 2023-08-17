package programs1;

public class sum_of_max_in_subarray {

	public static void main(String[] args) {


		
		 
		 
		 int []b= {10,20,30,40};
		 int sum1=0;
		 for (int i = 0; i < b.length; i++) {
			 int n=b[i];
			while (b[i]<0) {
				int digit=n%10;
				sum1=sum1+digit;
				n/=10;
				
			}
			System.out.println(sum1+"  "+b[i]);
		}
	}

}
 