
public class Procedure {
// creat vars 
	private String procedure;
	private String DrName;
	private double Price;
	private String date;
	public Procedure() {
		procedure=null;
		date=null;
		DrName=null;
		Price=0;
	}
	public Procedure(String Pname, String date) {
		procedure =Pname;
		this.date = date;
	}
	public Procedure(String PName,String date, String Dname,double price) {
		procedure=PName;
		this.date=date;
		DrName=Dname;
		Price=price;
	}
	// getters and setters
	
	public void setProcedure(String Pname) {
		procedure=Pname;
	}
	public void setDate(String Date) {
		date=Date;
	}
	public void setPrice(double price) {
		Price=price;
	}
	public void setDrName(String DrName) {
		this.DrName=DrName;
		
	}
	public String getProcedure() {
		return procedure;
		
	}
	public String getDate() {
		return date;
	}
	public String getDrName() {
		return DrName;
	}
	public double getPrice() {
		return Price;
	}
	// to string
	public String toString() {
		return "Procedure :"+ procedure
				+"\nDate of Procedure :" + date
				+"\nPractitioner: Dr. "+DrName
				+"\nCharge : "+Price;
	}
	
	
	
}
