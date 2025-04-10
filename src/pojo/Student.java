package pojo;

public class Student {
	
	private int id;
	private String name;
	private int marks;
	private String city;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//               101    Suraj        77      Pune
	public Student(int id,String name,int marks,String city) {
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.city=city;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public String getCity() {
		return city;
	}
	
	
	public void show() {
		System.out.println("ID: "+id+", Name: "+name+", Marks: "+marks+", City: "+city);
	}
	
	public String toString() {
		return "ID: "+id+", Name: "+name+", Marks: "+marks+", City: "+city;
	}
	

}
