class dog 
{
	static int legs=4;
	static int eyes=2;
	String color;
	String  bread;
    String gender;
	public void walk()
	{
		System.out.println("walking");
	}
	public static void main(String[] args) 
	{ 
		dog d=new dog();
		d.color="black";
		d.bread="rottwiler";
		d.gender="male";
		System.out.println("the color of the dog is "+d.color);
		System.out.println("dog bread is "+d.bread);
		System.out.println("dog gender is "+d.gender);
		System.out.println(" there are "+d.legs+" legs to dog");
		System.out.println("there are "+d.eyes+" eyes for dog");
		System.out.print("the dog is ");d.walk();
	}
}
