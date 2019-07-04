
public class MainClass {
	public static void main(String args[])
	{
		Employe emp=new Employe(150,"pavan","Associate",15000,new Address(325,"MGR Street","aretamma temple","bangarupalyam","chittoor",51744));

System.out.println("employee id= "+emp.getEid());
System.out.println("Designation= "+emp.getDesignation());
System.out.println("Salary = "+emp.getSalary());
System.out.println("Address= "+emp.getAddress().getDrno());
System.out.println("Address= "+emp.getAddress().getStreetname());
System.out.println("Address= "+emp.getAddress().getLandmark());
System.out.println("Address= "+emp.getAddress().getMandal());
System.out.println("Address= "+emp.getAddress().getDistrict());
System.out.println("Address= "+emp.getAddress().getPincode());
	}

}
