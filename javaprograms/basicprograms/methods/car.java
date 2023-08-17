//create a class car
//create non static method those are the color, speed, type of fuel,price and each method accepts one method with respective its merhod
class  car
{
	public void color(String color)
	{
		System.out.println(color);
	}
	public void speed(String speed)
	{
		System.out.println(speed);
	}
	public void fuel(String fuel)
	{
		System.out.println(fuel);
	}
	public void price(String price)
	{
		System.out.println(price);
	}
	public static void main(String[] args) 
	{  
		new car().color("red color");
		new car().color("60perhr");
		new car().color("petrol");
		new car().color("10lakhs");
		System.out.println("Hello World!");
	}
}
