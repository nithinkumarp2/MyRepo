class take_interger_number_sum_it_of_all_digit_and_repeat_it_until_sum_gets_single_digit  
{
	public static void main(String[] args) //_5643=5+6+4+3=18=1+4=9
	{
		int n=5643;
		int sum=0;
	//	int n1=sum
		while (n>0)
		{
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		System.out.println(sum);
		int sum1=0;
		while (sum>0)
		{
			int digit=sum%10;
			sum1+=digit;
			sum/=10;
		}
		System.out.println(sum1);
	}
}
