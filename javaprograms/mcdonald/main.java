import java.util.Scanner;
class menu
{
//	static String menu="menu";
//	String burger="berguer";
//	String pizza="pizza";
int a;
  public void menudetails()
	{
	 
	  System.out.println("1.burger");
	  System.out.println("2.pizza");
	//  System.out.println("3
	  System.out.println("3.cool drinks");
 System.out.println(" ===========================================");
	
}
}

class burger extends menu
{ 
	
	 
     public void one()
	{
		  Scanner sc=new Scanner(System.in);
	
		 System.out.println(" enter 1 for veg-burger  ");
		 System.out.println("enter 2 for non-veg-burger  ");
		  System.out.println(" enter 3 for  pizza");
		  System.out.println(" enter 4 for cooldreinks");
	  int b=sc.nextInt();
		 switch(b)
		 {
		
		 case 1:System.out.println("1.garlic veg burger");
		 System.out.println("2. chee s burger");
		 System.out.println("3. small burger");
		 System.out.println("4. large burger");
             break;
		 case 2:
		 System.out.println("these section for non-veg");
			 System.out.println("1. checken burger");
		 System.out.println("2. small checken-burger");
		 System.out.println("3. large checken-burger");
		  System.out.println("4. extra chees burger");
             break;

			 case 3:System.out.println("1. checken pizza");
		 System.out.println("2. small checken- pizza");
		 System.out.println("3. large checken- pizza");
		  System.out.println("4. extra chees  pizza");
             break;
			 case 4: System.out.println("1. coca-cola");
		 System.out.println("2. Fanta orange");
		  System.out.println("3. Sprite");
		   System.out.println("4. ThumsUP");
		   break;
            default:  System.out.println("-------------INVALID INPUT---------"); break;
		  }
		
	}
}
class selection extends burger
{
	public void option1()
	{
		 Scanner sc=new Scanner(System.in);
		System.out.println("select an option1");
		  int c=sc.nextInt();
        switch(c)
		{
	
			case 1: System.out.println("1.garlic burger---------------------------------RS.120");
			         
             break;

			 case 2: System.out.println("2. chees burger-------------------------------RS.200");break;
              case 3: System.out.println("3. small burger-------------------------------RS.100");break;

               case 4: System.out.println("4. large burger-------------------------------RS.300");break;

               default:  System.out.println("-------------invalid input---------------------");
    
		}
	}
		public void option2()
	{
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("select an option2");
		  int c=sc.nextInt();
        switch(c)
		{
	
			case 1: System.out.println("1.checken-burger---------------------------------RS.120");
			         
             break;

			 case 2: System.out.println("2. small-cheken-burger-------------------------------RS.200");break;
              case 3: System.out.println("3. large-chicekn-burger-------------------------------RS.100");break;

               case 4: System.out.println("4. extra-chees-chicken-burger-------------------------------RS.300");break;

               default:  System.out.println("-------------invalid input---------------------");
    
		}

	}

     		public void option3()
	{
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("select an option3");
		  int c=sc.nextInt();
        switch(c)
		{ 
	
			case 1: System.out.println("1.checken-pizza---------------------------------RS.120");
			         
             break;

			 case 2: System.out.println("2. small-cheken-pizza-------------------------------RS.200");break;
              case 3: System.out.println("3. large-chicekn-pizza--------------------------------RS.100");break;

               case 4: System.out.println("4. extra-chees-chicken-pizza-------------------------------RS.300");break;

               default:  System.out.println("-------------invalid input---------------------");
    
		}

	}


}

class quantity extends selection
{
	public  void itemprice()
	{
		 Scanner sc=new Scanner(System.in);
	
		//System.out.println("enter for option");
		//	int b =sc.nextInt();
		System.out.println("enter for quntity");
			int num=sc.nextInt();
			
		int price=0;
		int []a={120,200};
	 

		for ( int i=0;i<=a.length-1 ;i=i+3 )
		{
			for (int k=0;k<=a.length-1 ;k++ )
			{
			for (int j=i;j<num;j++ )
			{
				price= price+a[i];
			}
			}
		}
		System.out.println(price);
	}

}


class main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" menudetails");
        menu m=new menu();
		// String menudetails=sc.next(); 
		 m.menudetails();
        burger b=new burger();
		b.one();
          selection s=new selection();
		 // s.option1();
		//  s.option2();
		int se=sc.nextInt();
       quantity q=new quantity();
	   q.itemprice();





		System.out.println("Hello World!");
	}
}
