package JavaSessions;

public class College {

	public String name; // initializing the value ;can be use anytime
	public int studentCount;
	private String grades;
	public String logo;
	public String course;

	// getter and setter: for class variables
	//  The sequence of set the data and get the data : setter n getter for class variables.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentCount() { 
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
		}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
