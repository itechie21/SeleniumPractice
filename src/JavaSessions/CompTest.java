package JavaSessions;

public class CompTest {

	public static void main(String[] args) {

		
		Company c2 = new Company("HCL", 1900, "Noida", "HCL", "HR Policy");
		System.out.println(c2.name);
		
		System.out.println(c2.getPolicy()); // public method for private member
		
		//c2.getsalary(); private method for company.java so inaccessible
		
		c2.getEmpData(); // created a public layer on top of private method
		
	}

}
