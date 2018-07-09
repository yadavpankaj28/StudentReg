package registeration;

import java.util.ArrayList;
import java.util.List;
/**
 * THis is at class level.
 * @author pankajy
 *
 */
public  class NewRegisteration {

	private  final static List<Student> newStudent = new ArrayList<Student>();

	public boolean addNewStudent(Student studentDetail) {
		if(findStudent(studentDetail.getStudentRegisterationNumber()) >= 0) {
			System.out.println("Student is already on file");
			return false;
		}

		newStudent.add(studentDetail);	
		return true;
	}

/**
 * This is doing something.
 * @param registerationNumber
 * @return
 */
	int findStudent(String registerationNumber) {


		for(int i=0 ; i<this.newStudent.size(); i++) {

			Student studentDetail = this.newStudent.get(i);
			if(studentDetail.getStudentRegisterationNumber().equals(registerationNumber)) {

				return i;

			}
		}

		return -1;		

	}

	public boolean deleteStudent(String regNumber) {
		int index = findStudent(regNumber);

		if(index >=0){			
			System.out.println("Deleted " +
					newStudent.get(index).getStudentName() +
					" with registeration number " +
					newStudent.get(index).getStudentRegisterationNumber());
			newStudent.remove(index);
			return true;			
		}

		System.out.println("Student with regiteration no: "+
				regNumber +
				"not found");
		return false;
	}

	public void printStudent() {
		int sn = 0;

		if(!newStudent.isEmpty()) {
			for(Student s: newStudent) {
				sn++;
				System.out.println( "Serial No-->" + sn +
						" Name--> "+
						s.getStudentName()+
						" Reg N0--> "+
						s.getStudentRegisterationNumber()+
						" Course--> " +
						s.getCourse() +
						" Branch--> " +
						s.getBranch());
				System.out.println();
			}
		}
		else {
			System.out.println("No student records.");
		}
	}


	public boolean printStudnet(String regNumber1) {
		int index = findStudent(regNumber1);
		if(index >= 0) {
			System.out.println( "Name--> "+
					newStudent.get(index).getStudentName()+
					" Reg N0--> "+
					newStudent.get(index).getStudentRegisterationNumber()+
					" Course--> " +
					newStudent.get(index).getCourse() +
					" Branch--> " +
					newStudent.get(index).getBranch());
			
			return true;
		}
		
			return false;
		
	}

}
