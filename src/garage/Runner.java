package garage;

public class Runner {
	public static void main(String[] args) {
		Car c1 = new Car(1, "MH3939", 2010, false, false, "sedane");
		Suv s1 = new Suv(2, "MH3928", 2014, true, false, false);
		Truck t1 = new Truck(2, "MH3920", 2017, true, 200, 8);
		Garage g = new Garage();
		g.addVehicle(c1);
		g.addVehicle(s1);
		g.addVehicle(t1);
		System.out.println("\n");
		g.printAllVehicles();
		System.out.println("\n");
		g.fixVehicle(t1);
		g.fixVehicle(s1);
		g.fixVehicle(c1);
		System.out.println("\n");
		g.printAllVehicles();
		System.out.println("\n");
		g.clearAllVehicles();
		System.out.println("\n");
		g.printAllVehicles();
	}
}
