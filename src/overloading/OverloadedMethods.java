package overloading;

public class OverloadedMethods {
	public static void main(String[] args) {
		//create instance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		
		om.print("this is second method");
		om.print("second","third");
	}
	// overload here
	public void print() {
		System.out.println("original print method");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String a, String b) {
		System.out.println(a + " " + b);
	}
}
