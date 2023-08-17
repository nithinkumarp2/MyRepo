class take_interger_number_sum_it_of_all_digit_and_repeat_it_until_sum_gets_single_digit_5643=5+6+4+3=18=1+4=9  
{
	public static void main(String[] args) 
	{
		int n=5643;
		int sum=0;
		while (n>0)
		{
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		System.out.println(sum);
	}
}
