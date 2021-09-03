package garage;

public class Runner {
	public static void main(String[] args) {
		Car c1 = new Car(1, "MH3939", 2010, false, false, "sedane");
		Garage g = new Garage();
		g.vehicles.add(c1);
	}
}
