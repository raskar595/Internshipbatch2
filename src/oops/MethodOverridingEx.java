package oops;


class Greet1 {
	

	public void greetings(String str) {
		System.out.println("good Morning");//
	}

	public void greetings(Object obj) {
		System.out.println("good Evening");//
	}
}

public class MethodOverridingEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greet1 obj=new Greet1();
		obj.greetings('a');
	}

}
