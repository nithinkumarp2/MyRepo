class lowercase 
{
	public static void main(String[] args) 
	{  
		int pos=26;
		for (char ch='z';ch>='a' ;ch-- )
		{
			//pos--;
			System.out.println(pos--+"-"+ch+"="+(int)ch);
			//System.out.print(+pos);
		}
		
	}
}
