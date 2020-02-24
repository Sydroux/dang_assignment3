import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {
	Scanner scan = new Scanner(System.in);
	SecureRandom factors = new SecureRandom();
	
	int factor1;
	int factor2;

	private void quiz() {
		factor1 = factors.nextInt(10);
		factor2 = factors.nextInt(10);
		while (true) {
			askQuestion();
			if(isAnswerCorrect() == true) {
				displayCorrectResponse();
				break;
			} else {
				displayIncorrectResponse();
			}
		}
	}
	
	private void askQuestion() {
		System.out.println("How much is " + factor1 + " times " + factor2 + "?");
	}
	
	private int readResponse() {
		return scan.nextInt();
	}
	
	private boolean isAnswerCorrect() {
		if(readResponse() == (factor1 * factor2)) {
			return true;
		} else {
			return false;
		}
	}
	
	private void displayCorrectResponse() {
		System.out.println("Very good!");
	}
	
	private void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
	}
	
	
	public static void main(String[] args) {
		CAI1 app = new CAI1();
		app.quiz();
	}
}
