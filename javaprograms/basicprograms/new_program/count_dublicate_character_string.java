class count_dublicate_character_string 
{
	public static void main(String[] args) 
	{
	       String str="raa";
		   int count=0;
		   int n=str.length()-1;
		   String str1="";
		   for (int i=0;i<=n ;i++ )
		   {
			   char ch=str.charAt(i);
			  int n1=str1.length()-1;
			   boolean res=false;
			   for (int j=0;j<=n1 ;j++ )
			   {
				   char ch1=str1.charAt(j);
				   
				   if (ch==ch1)
				   {
					   res=true;
				   }
			   }
			   if (res!=true)
			   {
				   count++;
				   str1=str1+ch;

			   }
			    System.out.println(count+"="+ch+"="+str1+res);
		   }
		  
			}
}
