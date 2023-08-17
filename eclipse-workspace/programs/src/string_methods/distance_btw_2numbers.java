package string_methods;

public class distance_btw_2numbers {

	public static void main(String[] args) {
		 int[] a= {3,9,50,15,99,7,98,65};
		int max=0;
		int min=a[0];
		int count=0;
		int count1=0;
		 for (int i = 0; i < a.length; i++) {
			//int n=a[i];
			
			
		 if (a[i]>max) {
			max=a[i];	
		}
		 if (a[i]<min) {
			min=a[i];
		}
		 }
		 for (int j = min; j < max; j++) {
				
		 if (max>min) {
				count++;
			//	System.out.println(count);
			 }
		 else {
			 count1++;
			 System.out.println(count1);
		 }
			}
		  
		// for (int i = 0; i < a.length; i++) {
		
		 
			 System.out.println("max value="+max+"  min value="+min+"  distance between two numbers="+count);
		}
		
	}


