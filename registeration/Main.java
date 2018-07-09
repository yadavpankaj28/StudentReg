package registeration;

import java.util.Scanner;

public class Main {


	private static Scanner scanner  = new Scanner(System.in);
	private static NewRegisteration newStudentRegisteration = new NewRegisteration();	

	 NewRegisteration newStudentRegisteration1 = new NewRegisteration();
	public static void main (String args[]) {

		boolean quit= false;
		menuOption();



		while(!quit) {

			System.out.println("Enter your Choice");	
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Student student = scanStudentData();
				newStudentRegisteration.addNewStudent(student);

				break;

			case 2:
				System.out.println("Enter Registeration Number of student who you want to delete");
				String regNumber = scanner.next();
				newStudentRegisteration.deleteStudent(regNumber);

				break;	

			case 3:
				System.out.println("Enter Registeration Number of student who you want to Search");
				String regNumber1 = scanner.next();
				if(!newStudentRegisteration.printStudnet(regNumber1)) {
					System.out.println("Student not found with registeration no. " + regNumber1);
				}

				break;		

			case 4:
				newStudentRegisteration.printStudent();

				break;	

			case 5:
				Main.menuOption();

				break;		

			case 6:
				quit = true;
				break;

			default:
				System.out.println("Enter valid values");
			}			
		}

	}

	public static Student scanStudentData() {

		System.out.println("Enter new Student Name:");	
		String name =	scanner.next();
		System.out.println("Enter new Registeration Number:");
		String registerationNumber = scanner.next();
		System.out.println("Enter Course Name:");
		String course = scanner.next();
		System.out.println("Enter Branch Name:");
		String branch = scanner.next();

		return new Student(name,registerationNumber, course, branch);

	}

	public static void menuOption() {
		System.out.println("......Menu.....");
		System.out.println("1.Add New Student");
		System.out.println("2.Delete a Student");
		System.out.println("3.Find a Student");
		System.out.println("4.Print all Students");
		System.out.println("5.Print Menu Again");	
		System.out.println("6. To Exit");	
	}


}
