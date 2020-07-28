package Q417;

public class Kilometrage417 {
	
	int kilometer; 
	double kilometerTotal;
	
	public void setKilometer (int kilometer) {
		this.kilometer = kilometer;
		this.kilometerTotal += kilometer;
	}
	
	public int getKilometer () {
		return kilometer;
	}
	
	public double getkilomterTotal () {
		return kilometerTotal;
	}	

}
