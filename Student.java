package SchoolManagementSys;

public class Student extends School {
	String name;
	String id;
	int grade;
	int feesPaid=0;
	int TotalFees=0;
	@SuppressWarnings("static-access")
	Student(String name, int grade){
		while(super.noOfStudents>=0) {
			this.name=name;
			this.grade=grade;
			super.noOfStudents++;
			id=String.valueOf(grade);
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
	void getId() {
		System.out.println("Student ID is "+id);
	}
	void getTotalFees() {
		TotalFees +=feesPaid;
		System.out.println("Student Total Fees is "+TotalFees);
	}
	int Payfee(int amt) {
		feesPaid+=amt;
		School.revenue+=amt;
		return amt;
	}
	
}
