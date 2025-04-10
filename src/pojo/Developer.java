package pojo;

public class Developer {
	
	private int id;
	private String name;
	private String position;
	private int salary;
	private String city;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public Developer(int id, String name, String position, int salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", city="
				+ city + "]";
	}

	

}
