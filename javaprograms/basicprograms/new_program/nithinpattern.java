class nithinpattern 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=30 ;j++ )
			{
				if ((i==1&&j==2)||(i==1&&j==3)||(i==1&&j==4)||(i==1&&j==17)||(i==1&&j==18)||(i==1&&j==19)||(i==1&&j==27)||(i==1&&j==28)||(i==1&&j==29)||(i==5&&j==2)||
					(i==5&&j==3)||(i==5&&j==4)||(i==5&&j==11)||(i==5&&j==12)||(i==5&&j==14)||(i==5&&j==15)||(i==5&&j==17)||(i==5&&j==18)||(i==5&&j==19)||(i==5&&j==27)||(i==5&&j==28)||(i==5&&j==29))
				{
					System.out.print("  ");
			}
				else if (i==1||j==1||i==5||j==30||i==5||j==5||i==8||j==8||i==13||j==13||i==16||j==16||i==20||j==20||i==23||j==23||i==26||j==26)
				{
					System.out.print("* ");
				}
				else if ((i==2&&j==2)||(i==2&&j==27)||(i==3&&j==3)||(i==3&&j==17)||(i==3&&j==18)||(i==3&&j==19)||(i==3&&j==28))
				{
					System.out.print("* ");
				}
				else if ((i==4&&j==4) ||(i==4&&j==29) )
				{
					System.out.print("* ");
				}
				 
			 else
				{
				 System.out.print("  ");
				
			}
			}
			System.out.println();
			}
			System.out.println("  ");


 

	}
}
