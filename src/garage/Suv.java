package garage;

public class Suv extends Vehicle {
	
	private boolean isFourWheelDrive;
	private boolean offRoad;
	
	
	public Suv(int id, String licencePlate, int year, boolean isElectric, boolean isFourWheelDrive, boolean offRoad) {
		super(id, licencePlate, year, isElectric);
		this.isFourWheelDrive = isFourWheelDrive;
		this.offRoad = offRoad;
	}
	
	@Override
	public float calculateBill() {
		if(isFourWheelDrive && offRoad) return 100;
		else if(isFourWheelDrive || offRoad) return 50;
		else return 20;
	}


	public boolean isFourWheelDrive() {
		return isFourWheelDrive;
	}


	public void setFourWheelDrive(boolean isFourWheelDrive) {
		this.isFourWheelDrive = isFourWheelDrive;
	}


	public boolean isOffRoad() {
		return offRoad;
	}


	public void setOffRoad(boolean offRoad) {
		this.offRoad = offRoad;
	}
	
	
}
