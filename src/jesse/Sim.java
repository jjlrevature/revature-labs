package jesse;

public class Sim {
	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
		
		fv.setName("a new flyingvehicle");
		System.out.println(fv.getName());
		
		Airplane boeing = new Airplane((short)4,(short)5);
		boeing.move(15);
	}
}
