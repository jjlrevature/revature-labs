package staticVSinstance;

public class A {
	// static
	public static int staticCount = 0;
	
	// instance 
	public int instanceCount = 0;
	
	public A() {
		staticCount++;
		this.instanceCount++;
	}
}
