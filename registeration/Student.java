package registeration;

public class Student {

	private String studentName;
	private String studentRegisterationNumber;
	private String course;
	private String branch;



	public Student() {

	}

	public Student(String studentName, String studentRegisterationNumber, String course, String branch) {

		this.studentName = studentName;
		this.studentRegisterationNumber = studentRegisterationNumber;
		this.course = course;
		this.branch = branch;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public  String getStudentRegisterationNumber() {
		return studentRegisterationNumber;
	}
	public void setStudentRegisterationNumber(String studentRegisterationNumber) {
		this.studentRegisterationNumber = studentRegisterationNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	//	public static StudentDetails createStudent(String name, String r_number, String course, String branch) {
	//		return new StudentDetails(name, r_number, course, branch);
	//	}


}
