package mypack;

public abstract class Vehicle {

	String vehicleType;
	int noOfWheels;
	String fuel;
	public Vehicle() {
		super();
	}
	
	public Vehicle(String vehicleType, int noOfWheels, String fuel) {
		super();
		this.vehicleType = vehicleType;
		this.noOfWheels = noOfWheels;
		this.fuel = fuel;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", noOfWheels=" + noOfWheels + ", fuel=" + fuel + "]";
	}

	abstract int noOfWheels();
	abstract String consumptionFuel();
	
}
