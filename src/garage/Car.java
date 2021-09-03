package garage;

public class Car extends Vehicle{
	
	private boolean isManual;
	private String bodyType; 
	
	public Car(int id, String licencePlate, int year, boolean isElectric, boolean isManual, String bodyType) {
		super(id, licencePlate, year, isElectric);
		this.isManual = isManual;
		this.bodyType = bodyType;
	}
	
	@Override
	public float calculateBill() {
		if(isManual) return 150;
		else if(bodyType == "coupe") return 200;
		else return 100;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setIsManual(boolean transmission) {
		this.isManual = transmission;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "Car [isManual=" + isManual + ", bodyType=" + bodyType + "]";
	}
	
	

}
