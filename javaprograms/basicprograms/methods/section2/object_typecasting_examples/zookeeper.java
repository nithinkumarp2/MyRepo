class mammal
{
	String name="furry";
	String makenoise();
	{
		return "generic noise";

	}
}
class zebra extends mammal
{
	String name="stripes";
	public String makenoise()
	{
		return "bray";
	}
}



public class zookeeper
{
	public static void main(String[] args) 
	{
		new zookeeper().go();
	}
	public void go()
	{
		mammal m=new zebra();
		System.out.println(m.name + m.makenoise());
	}
}
