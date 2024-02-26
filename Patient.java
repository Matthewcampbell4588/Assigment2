
public class Patient {
// create all vars Fname Mname LName address city state zip phone ## Ename and E##
	private String Fname;
	private String	Mname;
	private String	Lname;
	private String address;
	private String city;
	private String state;
	private String Ename;
	private String PPhone;
	private String Ephone;
	private int zip;
	 public Patient() {
		 Fname=null;
		 Mname =null;
		Lname =null;
		PPhone=null;
		address= null;
		city=null;
		state=null;
		zip= 0;
		Ename=null;
		Ephone=null;
	 }
	public Patient(String Fname, String Mname, String Lname) {
		this.Fname =Fname;
		this.Mname =Mname;
		this.Lname =Lname;
	}
	public Patient(String Fname, String Mname, String Lname, String PPhone, String address,String city, String state, int zip, String Ename, String Ephone) {
		this.Fname =Fname;
		this.Mname =Mname;
		this.Lname =Lname;
		this.PPhone=PPhone;
		this.address= address;
		this.city=city;
		this.state=state;
		this.zip= zip;
		this.Ename=Ename;
		this.Ephone=Ephone;
	}
	//create 9 String get and sets
	public String getFname() {
		return Fname;
	}
	public String getMname() {
		return Mname;
	}
	public String getLname() {
		return Lname;
	}
	public String getEname() {
		return Ename;
	}
	public String getadd() {
		return address;
	}
	public String getcity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getzip() {
		return zip;
	}
	public String getPphone() {
		return PPhone;
	}
	public String getEphone() {
		return Ephone;
	}
	public void setEphone(String phone) {
		Ephone=phone;
	}
	public void setFname(String name) {
		Fname=name;
	}
	public void setMname(String name) {
		Mname=name;
	}
	public void setLname(String name) {
		Lname=name;
	}
	public void setadd(String add) {
		address=add;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public void setstate(String state) {
		this.state=state;
	}
	public void setPphone(String phone) {
		PPhone=phone;
	}
	public void setEname(String Ename) {
		this.Ename=Ename;
		
	}
	public void setzip (int zip) {
		this.zip=zip;
	}
	// build full name
	public String fullName() {
		return Fname+" "+Mname+" "+Lname+ " ";
	}
	// build address
	public String buildadd() {
		return address+" "+city+" "+state+" "+zip+" ";
	}
	
	// build emergo contact 
	public String Econtact() {
		return Ename +" "+ Ephone;
	}
	
	// to stright
	public  String toString() {
		return "Patient info\n" + "Name of Patient : "+fullName()+" \n"+ "Address of Patient :"+buildadd()+" \n"+ Econtact();
	}
	
	
	
}
