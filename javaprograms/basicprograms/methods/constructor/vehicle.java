class vehicle 
{
	static int ecb=1;
	static int fuelTank=1;
	         int wheels;
			 int seats;
			 int doors;
			 String color;
			 String typeoffuel;
  vehicle( int wheels, int seats,int doors,String color,String typeoffuel)
	{
         this.wheels=wheels;
            this.seats=seats;
			this.doors=doors;
			this.color=color;
			this.typeoffuel=typeoffuel;
	}
	public void print()
	{
		System.out.println(ecb);
		System.out.println(fuelTank);
		System.out.println(wheels);
		System.out.println(seats);
		System.out.println(doors);
		System.out.println(color);
		System.out.println(typeoffuel);
	}

	public static void main(String[] args) 
	{
		vehicle v1=new vehicle(2,2, 0,"black","pertrol");
		v1.print();
		System.out.println("Hello World!");
	}
}
