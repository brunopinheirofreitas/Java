
public class JoaquimStoreClient {
	
	private String clientFamilyName;
	private String clientName;
	private int clientID;
	
	public JoaquimStoreClient (String familyName, String name, int clientID) {
		this.clientFamilyName = familyName;
		this.clientName = name;
		this.clientID = clientID;
	}
	
	public String getClientInformation (int clientID) {
		if (clientID == this.clientID) {
			return ("Cliente full name: " + this.clientName + " " + this.clientFamilyName + " ID: " + this.clientID);
		} else {
			return "Client not found!";
		}
	}
	
	public int getClientID (String familyName, String name) {
		if (familyName == this.clientFamilyName && name == this.clientName) {
			return this.clientID;
		} else {
			return -1;
		}
	}
	
	

}
