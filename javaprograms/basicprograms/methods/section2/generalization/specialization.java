class bottle
{
	String height;
	String color;
	String shape;
	String capacity;
	bottle(String height,String color,String shape,String capacity)
	{
       this.height=height;
	   this.color=color;
	   this.shape=shape;
	   this.capacity=capacity;
	}
	   public void displayheight()
		{
		   System.out.println(height);
		}
		 public void displaycolor()
		{
		   System.out.println(color);
		}
		 public void displayshape()
		{
		   System.out.println(shape);
		}
		 public void displaycapacity()
		{
		   System.out.println(capacity);
		}
	
}



class  specialization
{
	 public static void display(bottle b1)
		{
		   b1.displayheight();
		   b1.displaycolor();
		   b1.displayshape();
		   b1.displaycapacity();
		}
	public static void main(String[] args) 
	{
		bottle b1=new bottle("6 INCHES","black","cylinder","1.2litr");
		display(b1);
		//new bottle("6 INCHES","black","cylinder","1.2litr").displayheight();
		System.out.println("Hello World!");
	}
}
