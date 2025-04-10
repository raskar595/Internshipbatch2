package oops;

public class TestAddition implements Addition{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The addition of A & B: "+(a+b));
		int num=1;
		System.out.println(num);
		
	}
	
	public static void main(String[] args) {
		
		TestAddition obj=new TestAddition();
		obj.add(3, 4);
		Addition.show();
	}

}
