import java.util.Scanner;
import java.security.SecureRandom;

public class CAI3 {
	Scanner scan = new Scanner(System.in);
	SecureRandom factors = new SecureRandom();
	
	int factor1;
	int factor2;
	int responsePhrase;
	double correctAnswers;
	double score;

	private void quiz() {
		String decision;
		correctAnswers = 0;
		score = 0;
		int questionsAnswered = 0;
		while (questionsAnswered < 10) {
			askQuestion();
			if(isAnswerCorrect() == true) {
				displayCorrectResponse();
				questionsAnswered++;
				correctAnswers++;
			} else {
				displayIncorrectResponse();
				questionsAnswered++;
			}
		}
		score = (correctAnswers / 10) * 100;
		displayCompletionMessage();
		while(true) {
			System.out.println("Do you want to solve a new problem set? yes/no");
			decision = scan.next();
			if(decision.equalsIgnoreCase("yes")) {
				quiz();
				break;
			} else if(decision.equalsIgnoreCase("no")) {
				break;
			} else {
				System.out.println("Not a valid answer. Answer yes or no.");
			}
		}
	}
	
	private void askQuestion() {
		factor1 = factors.nextInt(10);
		factor2 = factors.nextInt(10);
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
	
	private void displayCompletionMessage() {
		System.out.printf("Your score is %.1f\n", score);
		if(score >= 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		} else {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
	
	
	public static void main(String[] args) {
		CAI3 app = new CAI3();
		app.quiz();
		}
	}
