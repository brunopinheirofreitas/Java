package Cap06Ex66;

public class SphereVolume {
	
	private static double fraction = (4.0/3.0);
	
	public static double CalculateSphereVolume (double radius) {
		double volume = fraction * Math.PI * Math.pow(radius, 3);
		return volume;
	}

}
