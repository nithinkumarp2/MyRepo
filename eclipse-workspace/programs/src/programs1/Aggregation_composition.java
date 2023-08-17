package programs1;

class wheel
{
	double size;
	String color;
	String shape;
	double width;
	public wheel(double s,String c,String sh,double w) {
		 this.size=s;
		 this.color=c;
		 this.shape=sh;
		 this.width=w;
	}
	void display() {
		System.err.println(size);
		System.out.println(color);
		System.err.println(shape);
		System.out.println(width);
	}
}



public class Aggregation_composition {
static wheel w=new wheel(18,"silver","circular",20);
	public static void main(String[] args) {
		 Aggregation_composition.w.display();
System.err.println("---we can call directly----");
w.display();
	}

}
