class count_vowels_consonents_in_string 
{
	public static void main(String[] args) 
	{
		String str="nithinkumar ";
		int n=str.length()-1;
		String str1="";
		int vowel=0;
		int conso=0;
		for (int i=0;i<=n ;i++ )
		{
			char ch=str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowel++;
			}
			else
			{
				conso++;
			}
		}
		System.out.println("vowels="+vowel+"    consonent="+conso);
	}
}
