package customClass;

public class CustomClass {
	
	String size;
	String color;
	
	public void bounce() {
		System.out.println("The " + size + " " + color + " ball is bouncing.");
	}
	
	public static void main(String[] args) {
		CustomClass c1 = new CustomClass();
		CustomClass c2 = new CustomClass();
		
		// declare initial state
		c1.size = "big";
		c1.color = "orange";
		c2.size = "small";
		c2.color = "green";
		
		// call bounce method
		c1.bounce();
		c2.bounce();
	}
	
	
}
