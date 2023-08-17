class students
{
	int sId;
	String sName;
	String address;
	students(int sId,String sName,String address)
	{
		this.sId=sId;
		this.sName=sName;
		this.address=address;
	}
	public void display()
	{
		System.out.println(sId);
		System.out.println(sName);
		System.out.println(address);
	}
}
class qspiders extends students
{
	static String role="testing";
	String language;
	String typeoftesting;
	qspiders(int sId,String sName,String address,String language,String typeoftesting)
	{
		super(sId,sName,address);
		this.language=language;
		this.typeoftesting=typeoftesting;	
	}
	public void display()
	{
          System.out.println(role);
		  super.display();
		  System.out.println(language);
		  System.out.println(typeoftesting);
	}

}
class jspiders extends students
{
	static String role="Development";
	String language;
	String typeoftesting;
	jspiders(int sId,String sName,String address,String language,String typeoftesting)
	{
		super(sId,sName,address);
		this.language=language;
		this.typeoftesting=typeoftesting;	
	}
	public void display()
	{
          System.out.println(role);
		  super.display();
		  System.out.println(language);
		  System.out.println(typeoftesting);
	}

}

class hierarchical_inheritance 
{
	public static void main(String[] args) 
	{
		students s1=new students(1423,"nithin","karmanghta");
		s1.display();
		System.out.println("-------------------------------------");
		jspiders j1=new jspiders(16666,"kumar","saroornagar","java","fullstack");
		j1.display();
	}
}
