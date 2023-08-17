package programs1;

class add
{
	public static void m1()
	{
	int a[]= {1,2,3,4,5};
	int n=a.length;
	int sum=0;
	int sum1=0;
	 for(int i=0;i<n;i++) {
		 sum=sum+a[i];	
	 }
	 for(int j=0;j<a.length;j++)
	 {
	 sum1=sum+a[j];
	 System.out.println(sum1);
	 }
	}
}

class addtwostring_sorting
{
	public static void m2()
	{
	int a[]= {1,9,4,2};
	int b[]= {7,3,8,0};
	int c[]=new int[a.length+b.length];
	int k=0;
	for(int i=0;i<a.length;i++)
	{
		c[i]= a[i];
		k++;
		//System.out.println(c[i]);
	}
	for(int j = 0;j<b.length;j++)
	{
		c[k++]=b[j];
		
	}
	for(int i=0;i<c.length;i++)
	{
	//	System.out.println(c[i]);
	}
	
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c.length-1;j++)
		{
			if(c[j]>c[j+1])
			{
				int ele=c[j];
				c[j]=c[j+1];
				c[j+1]=ele;
			}
			
		}
		//System.out.println(c[i]);
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
}
}




class A1
{
	String name;
	A1(String name){
		this.name=name;
	}
	public String toString()
	{
		return  this.name;
	}
}



class b1
{
	public static void m()
	{
	int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
	int [][]b= {{9,8,7},{6,5,4},{3,2,1}};
	int[][]c=new int[3][3];
	int n=a.length;
	for (int i=0;i<n;i++)
	{
		System.out.println();
		for(int j=0;j<n;j++)
		{
			System.out.println(a[i][j]+" "+b[i][j]);
			c[i][j]=a[i][j]*b[i][j];
		}
		
	}
	
	for(int i=0;i<c.length;i++)
	{
		System.out.println(" ");
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[i][j]+" ");
		}
	}
	System.out.println();
	}
}

/////////////////////////////////////
class upcasting 
{
	int a=10;
	public void m1()
	{
		System.out.println("this is a class");
	}
}
class bag extends upcasting
{
	int b=39;
	int c=50;
	int d=b+c;
	public void m2()
	{
          System.out.println("this is b class");
		  System.out.println(d);
}
}
//class mainclass
//{
//	public static void main(String[] args) 
//	{
//		bag b=new bag();
//		upcasting u=new bag();
//
//	}
//}


public class tostringmethod {

	public static void main(String[] args) {
		  A1 a=new A1("nithin");
		  System.out.println(  a  );
		  
		  System.err.println("SUM OF THE ARRAY AND SUM WITH EACH ELEMENT");
		  add.m1();
		  
		  System.err.println("ADDING TWO STRINGS AND AFTER SORT IT");
		  addtwostring_sorting.m2();
		  
		  
		  System.err.println("matrix or 2dimenstional array");
		 b1.m();
		 
		 
		 
		 
		 System.err.println("--------------------------------------");
		 bag b2=new bag();
			upcasting u1=new bag();
			b2.m2();
			u1.m1();
			b2.m1();
		
	}

}
