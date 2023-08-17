package programs1;

class book
{
	String bookName;
	String author;
	int pages;
	double price;
	book(String name,String author, int pages, double price )
	{
		this.bookName=name;
		this.author=author;
		this.pages=pages;
		this.price=price;
		
	}
	 public boolean equals(Object o)
	 {
		 book b=(book)o;
		 boolean res=this.bookName==b.bookName&&this.author==b.author&&this.pages==b.pages&&this.price==b.price;
		return res;
		 
	 }
	 
	
}






public class equals_method {

	public static void main(String[] args) {
		book b1=new book("java","kkkk",1000,120);
		book b2=new book("java","kkkk",1000,120);
		System.out.println(b1.equals(b2));

	}

}
