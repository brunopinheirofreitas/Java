package Cap06Ex629;

import java.security.SecureRandom;

public class TossCoin {
	
	private static final SecureRandom randomCoin = new SecureRandom();
	
	public static int TossCoinResult() {
		int coinResult = randomCoin.nextInt(2);
		return coinResult;
	}
	

}
