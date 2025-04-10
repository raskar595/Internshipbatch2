package pojo;

public class Teacher {
	
	private int tid;
	private String tname;
	private String dept;
	private int salary;
	private Student student;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tid, String tname, String dept, int salary, Student student) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.dept = dept;
		this.salary = salary;
		this.student = student;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", dept=" + dept + ", salary=" + salary + ", student="
				+ student + "]";
	}
	
	
	

}
