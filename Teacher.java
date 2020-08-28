package SchoolManagementSys;

public class Teacher extends School{
	String name;
	String id;
	int Salary;
	int TeachingGrade;
	
	@SuppressWarnings("static-access")
	Teacher(String name, int grade){
		while(super.noOfTeachers<=12) {
			TeachingGrade=grade;
			this.name=name;
			super.noOfTeachers++;
			id=String.valueOf(TeachingGrade);
			id();
			break;
		}
	}

	void id() {
		for (int i = 0; i<=3; i++) {
			int j=(int)(9*Math.random());
			id += String.valueOf(j);
		}
	}
	
	int setSalary(int amount) {
		School.espenses+=amount;
		return amount;
	}
	
	void getId() {
		System.out.println("Teacher ID is "+id);
	}
}
