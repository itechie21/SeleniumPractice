package JavaSessions;

public class User {
	
	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public static void main(String[] args) {

		User u1 = new User("Tom", 25);
		User u2 = new User("Peter", 35);
		
		System.out.println(u1.name + " " + u1.age);
		u1 = null;
		u1 = u2;
		System.out.println(u1.name + " " + u1.age);//NullPointerException
		System.out.println(u2.name + " " + u2.age);


	}


}
