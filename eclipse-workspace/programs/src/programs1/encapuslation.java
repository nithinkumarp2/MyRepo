package programs1;


    class student
{
	private String sName;
	private int sId;
	private long phno;
	//public student(String sname,int sid,long phno)
	{
	//	this.sName=sname;
		//this.sId=sid;
	//	this.phno=phno;
	}
	public void getsname() {
		System.out.println(sName);
	}
	public void getsid() {
		System.out.println(sId);
	}
	public void getphno() {
		System.out.println(phno);
	}
	public void setname(String sname)
	{
		this.sName=sname;
		System.out.println("Name is changed to :"+sname);
	}
	public void setid(int sId)
	{
		this.sId=sId;
	}
	public void setphno(long phno)
	{
		this.phno=phno;
	}
	
}



public class encapuslation {

	public static void main(String[] args) {
		 student s=new student();//new student("nithin",143,9640369880l);
		 s.getsname();
		 s.setname("kumar");
           s.getsname();
	}

}
