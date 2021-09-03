package garage;

public class Truck extends Vehicle {

	public int loadCapacity;
	public int numWheels;
	
	public Truck(int id, String licencePlate, int year, boolean isElectric,int loadCapacity, int numWheels) {
		super(id, licencePlate, year, isElectric);
		this.loadCapacity = loadCapacity;
		this.numWheels = numWheels;
	}
	
	@Override
	public float calculateBill() {
		if(numWheels > 4 && loadCapacity > 100) return 500;
		else if (numWheels > 4 || loadCapacity > 100) return 250;
		else return 100;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	@Override
	public String toString() {
		return "Truck [loadCapacity=" + loadCapacity + ", numWheels=" + numWheels + "]";
	}
	
	
}
