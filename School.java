package SchoolManagementSys;

public class School {
	static String SchoolName="University of the People";
	static int revenue=0;
	int teachers;
	String students;
	static int espenses=0;
	static int noOfTeachers=0;
	static int noOfStudents=0;
	
	static void getEspenses() {
		System.out.println("Current School Espenses is "+espenses);
	}
	static void getSchoolName() {
		System.out.println(SchoolName);
	}
	static void getRevenue() {
		System.out.println("Current School revenue is "+revenue);
	}
	static void getnoOfTeachers() {
		System.out.println("Number of Teacher(s) registered = "+noOfTeachers);
	}
	static void getnoOfStudents() {
		System.out.println("Number of Student(s) registered = "+noOfStudents);
	}

}
