package AccessModifiers;

import AccessModifiers2.ProtectedSubClass;

public class AccessModifiers {
	public static void main(String[] args) {
		// access class methods
		Person adam = new Person();
		
		adam.age = 15;		
		System.out.println(adam.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
	}
}
