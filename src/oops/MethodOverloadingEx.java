package oops;

public class MethodOverloadingEx {
	
	public void show() {
		System.out.println("Hello Good Morning Show.");
	}
	
	public void show(String str) {
		System.out.println("Hello good morning "+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingEx obj=new MethodOverloadingEx();
		obj.show("Suraj");
	}

}
