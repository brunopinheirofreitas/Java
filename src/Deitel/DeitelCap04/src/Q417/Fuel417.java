package Q417;

public class Fuel417 {
	
	int fuel;
	double fuelTotal;
	
	public void setFuel (int fuel) {
		this.fuel = fuel;
		fuelTotal += fuel;
	}
	
	public int getFuel () {
		return fuel;
	}
	
	public double getFuelTotal () {
		return fuelTotal;
	}

}
