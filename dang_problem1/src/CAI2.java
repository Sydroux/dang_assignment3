import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {
	Scanner scan = new Scanner(System.in);
	SecureRandom factors = new SecureRandom();
	
	int factor1;
	int factor2;
	int responsePhrase;

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
		responsePhrase = factors.nextInt(4);
		switch (responsePhrase) {
		case 0:	System.out.println("Very good!");
		break;
		case 1:	System.out.println("Excellent!");
		break;
		case 2:	System.out.println("Nice work!");
		break;
		case 3:	System.out.println("Keep up the good work!");
		break;
		}
	}
	
	private void displayIncorrectResponse() {
		responsePhrase = factors.nextInt(4);
		switch (responsePhrase) {
		case 0:	System.out.println("No. Please try again.");
		break;
		case 1:	System.out.println("Wrong. Try once more.");
		break;
		case 2:	System.out.println("Don't give up!");
		break;
		case 3:	System.out.println("No. Keep trying.");
		break;
		}
	}
	
	
	public static void main(String[] args) {
		CAI2 app = new CAI2();
		app.quiz();
	}
}
