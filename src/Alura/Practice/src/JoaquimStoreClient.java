
public class JoaquimStoreClient {
	
	private String clientFamilyName;
	private String clientName;
	private int clientID;
	
	//Constructor
	public JoaquimStoreClient (String familyName, String name, int clientID) {
		this.clientFamilyName = familyName;
		this.clientName = name;
		this.clientID = clientID;
	}
	
	//Methods
	public String getClientInformation () {
		return ("Cliente full name: " + this.clientName + " " + this.clientFamilyName + " ID: " + this.clientID);
	}
	
	public int getClientID () {
			return this.clientID;
	}

	public String getClientFamilyName() {
		return clientFamilyName;
	}

	public void setClientFamilyName(String clientFamilyName) {
		this.clientFamilyName = clientFamilyName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

}
