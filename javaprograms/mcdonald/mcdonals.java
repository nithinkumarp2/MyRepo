import java.util.Scanner;
class menu
{
	public static void list()
	{
		  System.out.println("**************WELCOME TO MC DONALD`S******************");
//		System.out.println("---MENU LIST---");
//		System.out.println("111.VEG-BURGER");
//		System.out.println("222.NON-VEG-BURGER");
//		System.out.println("333.PIZZA");
//		System.out.println("444.COOL-DRINKS");
		System.out.println("---------------------------------------------------");
       //  selection();
	}
	public static void selection()
	{
		int total=0;
		int total1=0;z
	//	int total2=total+total1;
		Scanner sc=new Scanner(System.in);
	//	menu l=new menu();
	//	l.list();
	list();
	
	//case 111:	
		System.out.println("1.1:VEG-BURGER");
			System.out.println("---------------------------------------------------");
			 System.out.println("1.VEG-garlic-burger ");
			         
            

			  System.out.println("2. VEG-chees-burger ");
               System.out.println("3. VEG-small-burger ");

               System.out.println("4. VEG-large-burger ");
           System.out.println("---------------------------------------------------");
	//	   break;
 //case 222:	
	 System.out.println("1.2:VON-VEG-BURGER");
		System.out.println("---------------------------------------------------");
			  System.out.println("5.checken-burger ");
			         
                System.out.println("6. small-cheken-burger "); 
                System.out.println("7. large-chicekn-burger "); 

              System.out.println("8. extra-chees-chicken-burger "); 

              // default:  System.out.println("-------------invalid input---------------------");
    System.out.println("---------------------------------------------------");
//	break;
	//case 333:	
		System.out.println("1.3:PIZZA");
		System.out.println("---------------------------------------------------");
		  System.out.println("9.checken-pizza ");
			         
              System.out.println("10. small-cheken-pizza ");
               System.out.println("11. large-chicekn-pizza "); 

               System.out.println("12. extra-chees-chicken-pizza "); 

		System.out.println("---------------------------------------------------");
	//	break;
//	case 444:	
		System.out.println("1.4:COOL-DRINK");
		System.out.println("---------------------------------------------------");
		System.out.println("13. coca-cola ");
		 System.out.println("14. Fanta orange ");
		  System.out.println("15. Sprite ");
		   System.out.println("16. ThumsUP ");
        //  break;
	//	pu
		
			System.out.println("select option");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: System.out.println(" YOU HAVE select option "+a);
				System.out.println("1.VEG-garlic burger---------------------------------RS.120");
				System.out.println("select QUANTITY");
				int quantity1=sc.nextInt();
                      total=total+(quantity1*120);
					  total1=total1+(quantity1*120);
				//	total2=total;
					   System.out.println("total amount is"+total); 
			          //System.out.println(" ***********THANK-YOU*************");
             break;

			 case 2:  System.out.println(" YOU HAVE select option "+a);
				 System.out.println("2. VEG-chees-burger-------------------------------RS.200");
				 System.out.println("select QUANTITY");
			 int quantity2=sc.nextInt();
                       total=total+(quantity2*200);
					   System.out.println("total amount is"+total); 
			         //System.out.println(" ***********THANK-YOU*************");
			 break;
              case 3:  System.out.println(" YOU HAVE select option "+a);
				  System.out.println("3. VEG-small-burger-------------------------------RS.100");
				  System.out.println("select QUANTITY");
			  int quantity3=sc.nextInt();
                       total=total+(quantity3*100);
					   System.out.println("total amount is"+total); 
					   //System.out.println(" ***********THANK-YOU*************");
			         break;

               case 4: System.out.println(" YOU HAVE select option "+a); 
				   System.out.println("4. VEG-large-burger-------------------------------RS.300");
				   System.out.println("select QUANTITY");
			   int quantity4=sc.nextInt();
                       total=total+(quantity4*300);
					   System.out.println("total amount is"+total); 
					   //System.out.println(" ***********THANK-YOU*************");
			         break;
					 
			case 5:   System.out.println(" YOU HAVE select option "+a); 
				System.out.println("1.checken-burger---------------------------------RS.120");
			         System.out.println("select QUANTITY");
			   int quantity5=sc.nextInt();
                       total=total+(quantity5*120);
					   System.out.println("total amount is"+total);    
					   //System.out.println(" ***********THANK-YOU*************");
             break;

			 case 6:  System.out.println(" YOU HAVE select option "+a); 
				 System.out.println("2. small-cheken-burger-------------------------------RS.200");
			    System.out.println("select QUANTITY");
			   int quantity6=sc.nextInt();
                       total=total+(quantity6*200);
					   System.out.println("total amount is"+total); 
                      //System.out.println(" ***********THANK-YOU*************");
					  break;
              case 7:  System.out.println(" YOU HAVE select option "+a); 
				  System.out.println("3. large-chicekn-burger-------------------------------RS.100");
			     System.out.println("select QUANTITY");
			   int quantity7=sc.nextInt();
                       total=total+(quantity7*120);
					   System.out.println("total amount is"+total); 
					   //System.out.println(" ***********THANK-YOU*************");
					   break;

               case 8:    System.out.println(" YOU HAVE select option "+a);  
				   System.out.println("4. extra-chees-chicken-burger-------------------------------RS.300");
			      System.out.println("select QUANTITY");
			   int quantity8=sc.nextInt();
                       total=total+(quantity8*120);
					   System.out.println("total amount is"+total);//System.out.println(" ***********THANK-YOU*************");
					   break;


					 case 9:System.out.println(" YOU HAVE select option "+a); 
						 System.out.println("1.checken-pizza---------------------------------RS.120");
			            System.out.println("select QUANTITY");
			   int quantity9=sc.nextInt();
                       total=total+(quantity9*120);
					   System.out.println("total amount is"+total); 
					   //System.out.println(" ***********THANK-YOU*************");
             break;

			 case 10:System.out.println(" YOU HAVE select option "+a);
				 System.out.println("2. small-cheken-pizza-------------------------------RS.200");
			    System.out.println("select QUANTITY");
			   int quantity10=sc.nextInt();
                       total=total+(quantity10*200);
					   System.out.println("total amount is"+total); 
					   //System.out.println(" ***********THANK-YOU*************");
					   break;

              case 11:System.out.println(" YOU HAVE select option "+a); 
				  System.out.println("3. large-chicekn-pizza--------------------------------RS.100");
			     System.out.println("select QUANTITY");
			   int quantity11=sc.nextInt();
                       total=total+(quantity11*100);
					   System.out.println("total amount is"+total);
					   //System.out.println(" ***********THANK-YOU*************");
					   break;

               case 12: System.out.println(" YOU HAVE select option "+a);
				   System.out.println("4. extra-chees-chicken-pizza-------------------------------RS.300");
			      System.out.println("select QUANTITY");
			   int quantity12=sc.nextInt();
                       total=total+(quantity12*300);
					   System.out.println("total amount is"+total);
					   //System.out.println(" ***********THANK-YOU*************");
					   break;
                
			case 13:	 System.out.println(" YOU HAVE select option "+a);
				System.out.println("13. coca-cola---------------------------------RS.25");
                        System.out.println("select QUANTITY");
			   int quantity13=sc.nextInt();
                       total=total+(quantity13*25);
					//   total1=total1+(quantity13*25);
				//	total2=total;
					   System.out.println("total amount is"+total);
					   //System.out.println(" ***********THANK-YOU*************");
					   break;

		    case 14:   System.out.println(" YOU HAVE select option"+a);
				System.out.println("14. Fanta orange-----------------------------RS.30");
			   System.out.println("select QUANTITY");
			   int quantity14=sc.nextInt();
                       total=total+(quantity14*30);
					   System.out.println("total amount is"+total);//System.out.println(" ***********THANK-YOU*************");
					   break;

		     case 15:  System.out.println(" YOU HAVE select option "+a);
				 System.out.println("15. Sprite------------------------------------RS.25");
			    System.out.println("select QUANTITY");
			   int quantity15=sc.nextInt();
                       total=total+(quantity15*25);
					   System.out.println("total amount is"+total); 
					   //System.out.println(" ***********THANK-YOU*************");
					   break;

		      case 16:  System.out.println(" YOU HAVE select option "+a);
				  System.out.println("16. ThumsUP--------------------------------------RS.30");

                         System.out.println("select QUANTITY");
			   int quantity16=sc.nextInt();
                       total=total+(quantity16*30);
					   System.out.println("total amount is "+total); 
					      //System.out.println(" ***********THANK-YOU*************");
						  break;
              default:  System.out.println("-------------invalid input---------------------");
    
		}
		
	 
	// public void Return()
	{
		// selection();
	            System.out.println("DO YOU WANT TO GOBACK");
				 System.out.println("PRESS Y FOR [YES] AND N FOR [NO]");
                    String back=sc.next();
				 if (back.equals("Y"))
				 {
					  System.out.println("your total ammount to pay "+total);
					 selection();
					 
					 
				 }
				 else
		         {
				//	 int[] pay={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
				//	 int[]amount={120,200,100,300,120,200,100,300,120,200,100,300,25,30,25,30};
				//	 int n=pay.length-1;
					
				
					// for (int i=0;i<=n ;i=i+17 )
					 {
                        //    for (int j=0;j<=n ;j=j+17 )
                             {
                     
              //          System.out.println("your chooice is"+a);
					//	 total=total+total1+(pay[i]*amount[i ]);
					//total1=total1+total;
					  System.out.println("enter your total amount");
						  int amount=sc.nextInt();
						  int  total2=total+total1;
					if (amount==total+total1)
					{
					
					
					 System.out.println("your total ammount to pay "+total);
						   System.out.println("your total ammount to pay "+total2);
				     
						      System.out.println(" ***********THANK-YOU*************");
							 }
						 else
								 {
								 System.out.println("-----YOU ENTER WRONG AMOUNT------");
								 }
							 }
					 }
					
		       }
	}
	
}
}
 
class mcdonals 
{
	public static void main(String[] args) 
	{  
		menu l=new menu();
		l.selection();
	//  l.list();
//	l.Return();	
		System.out.println("*******************THANK-YOU-FOR-VISITING-MC-DONALD`S********************");
	}
}
