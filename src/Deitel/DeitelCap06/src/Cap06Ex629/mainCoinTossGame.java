package Cap06Ex629;

public class mainCoinTossGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double head=0;
		double tail=0;
		double sum=0;
		
//		int coinResult = TossCoin.TossCoinResult();
//		System.out.println(coinResult);
		System.out.println("Let's see if statistics are true, let's roll a coin one billion times.");
		System.out.println("Starting rolling: ");
		for (int counter=0; counter <= 10; counter++) {
			int coinResult = TossCoin.TossCoinResult();
			switch (coinResult) {
				case 0:
					head++;
					break;
				case 1:
					tail++;
					break;
			}
			
		}
		System.out.println("Done!");
		System.out.printf("The ammount of head and tail is: %.2f e %.2f%n", head, tail);
		sum = head + tail;
		System.out.printf("In percentage that means %.2f heads and %.2f tails", ((head/sum)*100), ((tail/sum)*100));

	}

}
