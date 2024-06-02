package mypack;

public  class petrolCar extends Car {

	public String consumptionFuel() {
		System.out.println("consumptionFuel()");
		return "String";
	}

	public static void main(String[] args) {
	
		petrolCar obj2=new petrolCar();
		obj2.noOfWheels();
		obj2.consumptionFuel();
		
	}
}