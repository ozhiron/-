public class Game {
	public static void main(String[] args) {
		int computerNumber = 40;
		int userNumber = 50;

		while (userNumber != computerNumber) {
			if (userNumber > computerNumber) {
				System.out.println("Больше" + " " + userNumber);
				userNumber--;
			} else if (userNumber < computerNumber) {
				System.out.println(userNumber + " " + "Меньше");
				userNumber++;
			} else if (userNumber == computerNumber) {
				System.out.println("вы угадали");
				break;
			}
		}		
	}
}