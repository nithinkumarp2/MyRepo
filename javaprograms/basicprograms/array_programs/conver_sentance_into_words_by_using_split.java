class conver_sentance_into_words_by_using_split 
{
	public static void main(String[] args) 
	{
		String str="raja how are you";
		String[]ch=str.split(" ");
		int n=ch.length-1;
		for (int i=0;i<=n ;i++ )
		{
			System.out.println(ch[i]);
		}
		System.out.println("Hello World!");
	}
}
