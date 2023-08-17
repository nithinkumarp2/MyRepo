class car  
{
	static int wheels=4;
	static int lights=2;
	static int string=1;

	String color;
	String brand;
	int airbags;
	int seating;
	public void movement()
	{
		System.out.println("movement");
	}
	public void stop()
	{
		System.out.println("stoped");
	}
	public static void main(String[] args) 
	{
		car c=new car();
	       c.color="red";
		   c.brand="skoda";
		   c.airbags=4;
		   c.seating=4;
		   c.movement();
		System.out.println(c.color);
	}
}
