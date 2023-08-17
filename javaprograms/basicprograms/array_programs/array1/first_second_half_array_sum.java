class first_second_half_array_sum 
{

  public static void firsthalf()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	  int sum=0;
	  int b[]=new int[n+1];
	  for (int i=0;i<=n/2 ;i++ )
	  {
         b[i]=a[i];
		 sum+=b[i];
		
	  }
    System.out.println("1st half sum is "+sum);
	}


public static void secondhalf()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	  int sum=0;
	  int b[]=new int[n+1];
	  for (int i=n/2;i<=n ;i++ )
	  {
         b[i]=a[i];
		 sum+=b[i];
	//	System.out.println(b[i]);
	  }
    System.out.println("2st half sum is "+sum);
	}



 public static void firsthalfmax()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	 
	  int b[]=new int[n+1];
	   int max=b[0];
	  for (int i=0;i<=n/2 ;i++ )
	  {
         b[i]=a[i];
		 if (max<b[i])
		 {
			 max=b[i];
		 }
		
		System.out.println(b[i]);
	  }
    System.out.println("1st half max is "+max);
	}


public static void secondhalfmax()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	
	  int b[]=new int[n+1];
	    int max=b[0];
	  for (int i=n/2;i<=n ;i++ )
	  {
         b[i]=a[i];
		 if (max<b[i])
		 {
			 max=b[i];
		 }
		
		System.out.println(b[i]);
	  }
    System.out.println("2st half max is "+max);
	}


 public static void firsthalfmin()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	
	  int b[]=new int[n+1];
	    int min=a[0];
	  for (int i=0;i<=n/2 ;i++ )
	  {
         b[i]=a[i];
		 if (min>b[i])
		 {
			 min=b[i];
		 }
		
		System.out.println(b[i]);
	  }
    System.out.println("1st half min is "+min);
	}


	
	 public static void secondhalfmin()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	  
	  int b[]=new int[n+1];
	  int min=6;
	  for (int i=n/2;i<=n ;i++ )
	  {
         b[i]=a[i];
		 if (min>b[i])
		 {
			 min=b[i];
		 }
		
		System.out.println(b[i]);
	  }
    System.out.println("2st half min is "+min);
	}




		 public static void firsthalfavg()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	  
	  int b[]=new int[n+1];
	  int avg=0;
	  int sum=0;
	  for (int i=0;i<=n/2 ;i++ )
	  {
         b[i]=a[i];
		 sum=sum+b[i];
		 avg=sum/b.length;
			 
		 
		
		System.out.println(b[i]);
	  }
    System.out.println("2st half min is "+avg+"    "+sum);
	}



	
		 public static void secondhalfavg()
	{
	  int a[]={1,2,3,4,5,6,7,8};
	  int n=a.length-1;
	  
	  int b[]=new int[n+1];
	  int avg=0;
	  int sum=0;
	  for (int i=n/2;i<=n ;i++ )
	  {
         b[i]=a[i];
		 sum=sum+b[i];
		 avg=sum/b.length;
			 
		 
		
		System.out.println(b[i]);
	  }
    System.out.println("2st half min is "+avg+"    "+sum);
	}

	
	
	public static void main(String[] args) 
	{
		firsthalf();
		secondhalf();
		System.out.println("-----max values of 1st and 2nd half");
		firsthalfmax();
		secondhalfmax();
        System.out.println("-----min values of 1st and 2nd half");
		firsthalfmin();
		secondhalfmin();

		 System.out.println("-----avg values of 1st and 2nd half");
		 firsthalfavg();
		 secondhalfavg();
	}
}
