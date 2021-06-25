
public class encapsulationCar {
	private String make;
	private String model;
	private int year;
	
	encapsulationCar(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}	
	// second method to copy objects
	encapsulationCar(encapsulationCar x){
		this.copy(x);
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	// adding copy method for copyObjects
	public void copy(encapsulationCar x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}
