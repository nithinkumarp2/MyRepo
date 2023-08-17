 class amstrongnumber_using_array
 {
	 public static void main(String[]args)
	 {
		 int a[]={9,143,77,153};
		 for (int i=0;i<a.length ;i++ )
		 {
			 int n=a[i];
			 int n1=n;
			 int n2=n;
			 int sum=0;
			 int c=0;
			 while (n>0)
			 {
				 n/=10;
				 c++;
			 }
			 while (n1>0)
			 {
				 int digit=n1%10;
				 int power=1;
				 for (int j=1;j<=c ;j++ )
				 {
					 power*=digit;
				 }
				 sum+=power;
				 n1/=10;
			 }
              if (sum==n2)
              {
				  System.out.println("amstrong"+n2);
              }
				  else
			 {
					  System.out.println("not amstrong");
				  }
		 }
	 }
 }