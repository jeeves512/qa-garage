package garage;

public class Vehicle {
	private int id;
	private String licencePlate;
	private int year;
	private boolean isElectric;
	public Vehicle(int id, String licencePlate, int year, boolean isElectric) {
		super();
		this.id = id;
		this.licencePlate = licencePlate;
		this.year = year;
		this.isElectric = isElectric;
	}
	
	public float calculateBill() {
		int total = 0;
		total += 100;
		System.out.println("The total is " + total);
		return total;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", licencePlate=" + licencePlate + ", year=" + year + ", isElectric=" + isElectric
				+ "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLicencePlate() {
		return licencePlate;
	}
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	
	
}
