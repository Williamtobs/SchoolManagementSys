package SchoolManagementSys;

public class ManagementSystem {
	public static void main(String[] args) {
		School.getSchoolName();
		Teacher teacher1 = new Teacher("WIlliam Tobi", 9);
		teacher1.getId();
		teacher1.setSalary(1000);
		
		Teacher teacher2 = new Teacher("Stephaine Lydia", 8);
		teacher2.getId();
		teacher2.setSalary(800);
		
		
		
		Student student1 = new Student("Hakeem Jackson", 9);
		student1.getId();
		student1.Payfee(3000);
		student1.getTotalFees();
		
		Student student2 = new Student("Jada Ashley", 9);
		student2.getId();
		student2.Payfee(5000);
		student2.getTotalFees();
		
		School.getEspenses();
		School.getRevenue();
		School.getnoOfTeachers();
		School.getnoOfStudents();
	}

}
