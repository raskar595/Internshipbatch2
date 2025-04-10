package pojo;

public class TestTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud=new Student(11, "Mayur Bhojane", 77, "Pune");
		
		Teacher teach=new Teacher(101, "Suraj Raskar", "Computer Science", 1800, stud);

		System.out.println(teach.getStudent().getName());
		
		
	}

}
