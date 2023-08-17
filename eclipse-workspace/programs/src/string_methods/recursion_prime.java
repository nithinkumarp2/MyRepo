package string_methods;

public class recursion_prime {

	public static void main(String[] args) {
		 int[]a= {2,11,14,15,23,3,6,5 };
		 for (int i : a) {
			 if(primee(2,true,i)) {
			System.out.println(i+"is prime");
		}
		 }
	}

	public static boolean primee(int i,boolean s,int n)
	{
		if (i==n) {
			return s;
		}
		if (n%i==0) {
			s=false;
		}
		return primee(i+1,s,n);
	}
}
