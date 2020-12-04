package test.exception;

public class Conection implements AutoCloseable{
	
	//AutoCloseable is an interface.
	
	public Conection() {
		System.out.println("Opening conection ...");
	}
	
	public void getData() {
		System.out.println("Receiving data ...");
		throw new IllegalStateException();
	}
	
	public void close() {
		System.out.println("Closing conection ...");
	}

}
