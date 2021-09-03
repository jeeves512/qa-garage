package garage;
import java.util.*;

public class Garage {
	
	public ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
		System.out.println("Added vehicle " + v.getLicencePlate());
	}
	public void removeVehicle(int id) {
		int i = 0;
		for(Vehicle v: vehicles) {
			if(id == v.getId()) break;
			i++;
		}
		vehicles.remove(i);
	}
	
	public void fixVehicle(Vehicle v) {
		System.out.println("Calculating Bill.....");
		System.out.println("Total bill is $" + v.calculateBill());
	}
	
	public void printAllVehicles() {
		for(Vehicle v: vehicles) {
			System.out.println(v);
		}
	}
	
	public void clearAllVehicles() {
		vehicles.clear();
		System.out.println("Cleared all Vehicles from Garage!!");
	}
}
