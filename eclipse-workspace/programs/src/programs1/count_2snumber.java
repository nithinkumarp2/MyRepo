package programs1;

public class count_2snumber {

	 
	
	
	
	
	
	

	public static void main(String[] args) {
		 
		 
		int []a= {2,12,20,21,222,33,23,24,25,26,27,28,29,32};
	//	int count1=0;
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			int count=0;
			while (n>0) {
				int digit=n%10;
				if (digit==2) {
					count++;
					
				}
				
				n/=10;
				
			}
//			if(count>0)
//			{
//			count1=count;
	System.out.println(count);
//		}
		}
	//	System.out.println(count1);
	}

}
