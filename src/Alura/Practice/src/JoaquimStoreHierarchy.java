
public abstract class JoaquimStoreHierarchy {
	
	public static void setJoaquimStoreHierarchy (int position, JoaquimStoreManager manager, JoaquimStoreVendor vendor) {
		manager.setVendorTeam(position, vendor);
		vendor.setVendorManager(manager);
	}
	
	public static JoaquimStoreVendor[] getJoaquimStoreHierarchy (JoaquimStoreManager manager) {
			return manager.getManagerTeam();

	}
	
	public static JoaquimStoreManager getVendorManager (JoaquimStoreVendor vendor) {
		return vendor.getVendorManager();
	}
	
	
	
}
