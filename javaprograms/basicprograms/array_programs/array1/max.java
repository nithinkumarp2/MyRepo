class max 
{
	public static void main(String[] args) 
	{
		int[]a={3,8,21,51,32,41,89};
		int max=a[0];
		int min=a[0];
		int maxindex=0;
		int minindex=0;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			 
			
			int ele=a[i];
			if (max<ele)
			{
				max=ele;
				maxindex=i;
			}
            if (min>ele)
			{
				min=ele;
				minindex=i;
			}
		}
		}
		int ele=a[maxindex];
		a[maxindex]=a[minindex];
		a[minindex]=ele;
			for (int i=0;i<=a.length-1 ;i++ )
		{
			
		System.out.println(a[i]+"="+min);
		}
	}
}
