package programs1;

public class bank {
        private String bname;
        private String ifc;
        private String address;
        public bank(String bname,String ifc,String address)
        {
        	this.bname=bname;
        	this.ifc=ifc;
        	this.address=address;
        }
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getIfc() {
			return ifc;
		}
		public void setIfc(String ifc) {
			this.ifc = ifc;
		} 
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public void displayall() {
			System.out.println(getBname()+" ,  "+getIfc()+" , "+getAddress()); 
		}
		
		public static void main(String[] args)
		 {
			 bank b=new bank("andhra bank","AND10001","bhagyanagar");
			 b.displayall();
			 System.out.println("------------updated the bank details-----------");
			 b.setBname("SBI");
			 b.displayall();
		 }
}
  
	 
