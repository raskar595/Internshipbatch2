package pojo;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		
		obj.setName("Suraj");
		obj.setId(101);
		obj.setCity("Pune");
		obj.setMarks(77);
		
		System.out.println(obj);
	}

}
