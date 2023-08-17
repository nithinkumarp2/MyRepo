class outer 
{
	public static void main(String[] args) 
	{
		computer mouse=new laptop();

		System.out.println(mouse.getvalue(100,200));
	}
}
class notebook
{
	int getvalue(int a,int b)
	{
		if (a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}
class computer extends notebook
{
	int getvalue(int a,int b)
	{
		return a*b;
	}
}

class laptop extends computer
{
	int getvalue(int a,int b)
	{
		return b-a;
	}
}