// wap for below requirements
//create a class
//create non static method 
//inside non static method create a int variable
//print factorial of a variable 1 to 5 and perform method calling

class factorial_by_using_method
   
{
	public void m1()
	{
		 int n=5; int fact=1;
		 for (int i=1;i<=n ;i++ )
		 {
			 fact*=i;
		 }
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
	new factorial_by_using_method().m1();
	}
}
