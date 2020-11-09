
public class JoaquimStoreHierarchy {

	JoaquimStoreManager manager;
	JoaquimStoreVendor vendor;
	static int maxVendorPerManager = 4;

	//Constructor
	public JoaquimStoreHierarchy(JoaquimStoreManager manager, JoaquimStoreVendor vendor) {
		this.manager = manager;
		this.vendor = vendor;
	}
	
	//Methods
	public int[] getManagerVendorTeam(JoaquimStoreManager manager) {
		return manager.getManagerTeam();
	}

	public String setManagerVendorTeam(int position, JoaquimStoreVendor vendor, JoaquimStoreManager manager) {
		if (position <= maxVendorPerManager) {
			manager.setVendorTeam(position, vendor.getColaboratorIdNumber(vendor.colaboratorFamilyName, vendor.colaboratorName, vendor.colaboratorBirthDate));
			return "Success!";
		} else {
			return "The manager cannot manage another vendor";
		}

	}

}
