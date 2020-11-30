
public enum Gender {
	
	MALE(1), FEMALE(2), NO_GENDER(3);
	
	private int value;
	
	Gender (int value) {
		this.value = value;
	}
	
	public int getGender () {
		return this.value;
		
	}

}
