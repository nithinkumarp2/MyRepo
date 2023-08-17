package programs1;

public class sub_3number_max {

	public static void main(String[] args) {


		 
			int[]a= {6,3,2,0,10};
			int max=0;
		 int product=1;
			for (int i = 0; i < a.length; i++) {
				
				for (int j = 0; j < a.length-1; j++) {
				 
					if (a[j]<a[j+1]) {
						int ele=a[j];
						a[j]=a[j+1];
						a[j+1]=ele;
					}
					
				
			}
				
			}
			for (int j = 0; j < 3; j++) {
				product=product*a[j];
			}
			
			System.out.println(product);
			System.err.println("sorded array===========");
			for (int i = 0; i < a.length; i++) {
				 System.out.println(a[i]);
			}
	}

}
