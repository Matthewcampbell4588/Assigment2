import java.util.Scanner;
public class Patient_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		 Patient p= new Patient();
		 String temp;
		 int tempnum;
		 double tempdouble;
		 System.out.println("Enter First Name");
		 temp=keyboard.nextLine();
		 p.setFname(temp);
		 System.out.println("Enter Middle Name");
		 temp=keyboard.nextLine();
		 p.setMname(temp);
		 System.out.println("Entet Last Name");
		 temp=keyboard.nextLine();
		 p.setLname(temp);
		 System.out.println("Enter Phone Number");
		 temp=keyboard.nextLine();
		 p.setPphone(temp);
		 System.out.println("Enter Address");
		 temp=keyboard.nextLine();
		 p.setadd(temp);
		 System.out.println("Enter city");
		 temp=keyboard.nextLine();
		 p.setcity(temp);
		 System.out.print("Enter State");
		 temp=keyboard.nextLine();
		 p.setstate(temp);
		 System.out.println("Enter zip");
		 tempnum=keyboard.nextInt();
		 p.setzip(tempnum);
		 System.out.println("enter emergancey contact name");
		 temp=keyboard.nextLine();
		 temp=keyboard.nextLine();
		 p.setEname(temp);
		 System.out.println("Enter emergancy contact phone number");
		 temp=keyboard.nextLine();
		 p.setEphone(temp);
		 
		 Procedure pro1=new Procedure();
		 System.out.println("Insert name of procedure : ");
		 temp=keyboard.nextLine();
		 pro1.setProcedure(temp);
		 System.out.println("Inset date  in MM/dd/year format:");
		 temp=keyboard.nextLine();
		 pro1.setDate(temp);
		 System.out.println("Insert practiciners name : ");
		 temp=keyboard.nextLine();
		 pro1.setDrName(temp);
		 System.out.println("Insert Cost of procedure : ");
		 tempdouble=keyboard.nextDouble();
		 pro1.setPrice(tempdouble);
		 
		 
		 Procedure pro2=new Procedure();
		 System.out.println("Insert name of procedure : ");
		 temp=keyboard.nextLine();
		 temp=keyboard.nextLine();
		 pro2.setProcedure(temp);
		 System.out.println("Inset date  in MM/dd/year format:");
		 temp=keyboard.nextLine();
		 pro2.setDate(temp);
		 System.out.println("Insert practiciners name : ");
		 temp=keyboard.nextLine();
		 pro2.setDrName(temp);
		 System.out.println("Insert Cost of procedure : ");
		 tempdouble=keyboard.nextDouble();
		 pro2.setPrice(tempdouble);
		 
		 
		 Procedure pro3=new Procedure();
		 System.out.println("Insert name of procedure : ");
		 temp=keyboard.nextLine();
		 temp=keyboard.nextLine();
		 pro3.setProcedure(temp);
		 System.out.println("Inset date  in MM/dd/year format:");
		 temp=keyboard.nextLine();
		 pro3.setDate(temp);
		 System.out.println("Insert practiciners name : ");
		 temp=keyboard.nextLine();
		 pro3.setDrName(temp);
		 System.out.println("Insert Cost of procedure : ");
		 tempdouble=keyboard.nextDouble();
		 pro3.setPrice(tempdouble);
		
		 displayPatient(p);
		 displayProcedure(pro1);
		 displayProcedure(pro2);
		 displayProcedure(pro3);
		 System.out.println("Total Charges : "+calculateTotalCharges(pro1,pro2,pro3));
		
	}
	public static void displayPatient(Patient p) {
		System.out.println(p.toString());
	}
	public static void displayProcedure(Procedure q) {
		System.out.println(q.toString());
	}
	public static double calculateTotalCharges(Procedure a,Procedure b,Procedure c) {
		double totalcharge=a.getPrice()+b.getPrice()+c.getPrice();
		return totalcharge;
	}

}
