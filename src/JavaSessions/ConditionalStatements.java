package JavaSessions;

public class ConditionalStatements {
	
	public static void main(String[] args) {

		int a = 30;
		int b = 30;

		if (b >= a) {// boolean
			System.out.println("b is greater than or equal to a");
		} else {
			System.out.println("a is greater than or equal to b");
		}

		if (a == 30) {
			System.out.println("a is eq to 30");
		}

		//*****************************************************************
		
		// Dead Code Example
		
		if (true) {
			System.out.println("Hii");
		} else {
			System.out.println("Bye!!");   // dead code never execute this line
		}

		
		//*****************************************************************
		
		int num = 29;
		if (num < 100 && num > 30) {
			System.out.println("pass");
			if (num >= 80) {
				System.out.println("Grade A");
			}
			if (num >= 50 && num < 80) {
				System.out.println("Grade B");
			}
		} else {
			System.out.println("FAIL");
		}

		int total = 100;
		if (total >= 100) {
			System.out.println("hii");
			total = total + 300;   				// value is 400
		}
		if (total >= 200) {
			System.out.println("hello");
			total = total - 300;				// value is 100
		}
		if (total >= 300) {
			System.out.println("bye");
		}

		int number = 10;
		if (number == 10) {

			if (number < 15) {
				System.out.println("Hello Number");
			}
			if (number < 12) {
				System.out.println("Hi Number");
			} else {
				System.out.println("Bye Number");
			}

		} else {
			System.out.println("Bye!~~~");
		}

		//****************************String************************************
		
		 
		String name = "Nakul";
		int marks = -1;        // -1 will help to understand invalid value 
							   //if 0 person can have score 0 as well
		// if elseif elseif

		if (name.equals("Nakul")) {
			marks = 90;
		} 
		else if (name.equals("Vibha")) {
			marks = 95;
		} 
		else if (name.equals("Simran")) {
			marks = 100;
		} 
		else if (name.equals("Naveen")) {
			marks = 5;
		}

		else {
			System.out.println("student name : " + name + " is not found");
		}
		
		System.out.println(name + " : " + marks);

		
		

		
		
		String browser = "opera";
		
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		else if(browser.equals("ff")){
			System.out.println("launch ff");
		}
		else if(browser.equals("ie")){
			System.out.println("launch ie");
		}
		
		else{
			System.out.println(browser +" : broswer is not found, please pass the correct browser name");
		}
		
		//WAP to get the highest number out of three diff numbers:
		
		int x = 800;
		int y = 700;
		int z = 300;
		int sum = 1000;
		
		//   ** Important
		//   **    && --> AND short circuit operator
		//   **      || --> OR
		if(x>y && x>z && sum==1000){               //false && true && true
			System.out.println("x is the highest");
		}
		else if(y>z){//true
			System.out.println("y is the highest");
		}
		else{
			System.out.println("z is the highest");
		}
			

	}

}
