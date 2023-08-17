class vehicle 
{
	static int Ecb=1;
	static int fuelTank=1;
	static int handle_stiring=1;
	static int sideindicaters=4;
	String color;
	String typeoffuel;
	String brand;
	int tyres;
	int seating;
	int lighting;
	vehicle(String color,String typeoffuel,String brand)
	{
		this.color=color;
		this.typeoffuel=typeoffuel;
		this.brand=brand;
	}
	vehicle(String color,String typeoffuel,String brand,int tyres)
	{
		this(color,typeoffuel,brand);
		this.tyres=tyres;
	}
	vehicle(String color,String typeoffuel,String brand,int tyres,int seating,int lighting)
	{
		this(color,typeoffuel,brand,tyres);
		this.seating=seating;
		this.lighting=lighting;
	}
	public void display()
	{
		System.out.println(color);
		System.out.println(typeoffuel);
		System.out.println(brand);
		System.out.println(tyres);
		System.out.println(seating);
		System.out.println(lighting);

	}
	public void display1()
	{
		System.out.println(Ecb);
		System.out.println(fuelTank);
		System.out.println(handle_stiring);
		System.out.println(sideindicaters);
         System.out.println(color);
		System.out.println(typeoffuel);
		System.out.println(brand);
		System.out.println(tyres);
		System.out.println(seating);
		System.out.println(lighting);
	}
	public static void main(String[] args) 
	{
		vehicle v1=new vehicle("black","petrol","THAR");
		v1.display();
		System.out.println("--------------------------------");
		vehicle v2=new vehicle("Red","petrol","skoda");
		v2.display();
		System.out.println("--------------------------------");
		vehicle v3=new vehicle("white","petrol","Verna");
		v3.display();
		System.out.println("--------------------------------");
		vehicle v4=new vehicle("black","petrol","THAR",4,4,2);
		v4.display1();
		System.out.println("--------------------------------");
		vehicle v5=new vehicle("red","disel","skoda",4,4,2);
		v5.display1();
		System.out.println("--------------------------------");
		vehicle v6=new vehicle("black","petrol","i20",4,4,2);
		v6.display1();
		System.out.println("--------------------------------");
		vehicle v7=new vehicle("black","petrol","KIA",4,4,2);
		v7.display1();
		System.out.println("--------------------------------");

		vehicle v8=new vehicle("black","petrol","THAR",4);
		v8.display();
		System.out.println("--------------------------------");
		vehicle v9=new vehicle("black","petrol","mahendra suv",4);
		v9.display();
		System.out.println("--------------------------------");
	}
}
