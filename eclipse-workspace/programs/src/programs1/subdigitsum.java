package programs1;

public class subdigitsum {

	public static void main(String[] args) {


		int n=5643;
		int sum=0;
		 while(n>0)
		 {
			 int digit=n%10;
			 sum=sum+digit;
			 n/=10;
		 }
    System.out.println(sum);
    int sum1=0;
    while(sum!=0)
	 {
		 int digit1=sum%10;
		 sum1=sum1+digit1;
		 sum/=10;
	 }
System.out.println(sum1);
}
	}


