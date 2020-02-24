import java.util.Scanner;
import java.security.SecureRandom;

public class CAI5 {
	Scanner scan = new Scanner(System.in);
	SecureRandom factors = new SecureRandom();
	
	double factor1;
	double factor2;
	int difficultyLevel;
	int problemType;
	int operation;
	int responsePhrase;
	double correctAnswers;
	double score;

	private void quiz() {
		String decision;
		correctAnswers = 0;
		score = 0;
		int questionsAnswered = 0;
		readProblemType();
		readDifficulty();
		while (questionsAnswered < 10) {
			askQuestion();
			if(isAnswerCorrect() == 1) {
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
	
	private void readProblemType() {
		while(true) {
			System.out.println("Choose a problem type. Type 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division, and 5 for all.");
			problemType = scan.nextInt();
			if(problemType > 0 && problemType < 6) {
				break;
			} else {
				System.out.print("Not a valid number. ");
			}
		}
	}
	
	private void readDifficulty() {
		while(true) {
			System.out.println("Choose a difficulty level 1 through 4.");
			difficultyLevel = scan.nextInt();
			if(difficultyLevel > 0 && difficultyLevel < 5) {
				break;
			} else {
				System.out.print("Not a valid number. ");
			}
		}
	}
	
	private void generateQuestionArgument() {
		switch (difficultyLevel) {
		case 1:	factor1 = factors.nextInt(10);
				factor2 = factors.nextInt(10);
		break;
		case 2:	factor1 = factors.nextInt(100);
				factor2 = factors.nextInt(100);
		break;
		case 3:	factor1 = factors.nextInt(1000);
				factor2 = factors.nextInt(1000);
		break;
		case 4:	factor1 = factors.nextInt(10000);
				factor2 = factors.nextInt(10000);
		break;
		}
	}
	
	private void askQuestion() {
		generateQuestionArgument();
		if(problemType == 5) {
			operation = factors.nextInt(4);
		} else {
			operation = problemType - 1;
		}
		switch (operation) {
		case 0: System.out.println("How much is " + factor1 + " plus " + factor2 + "?");
		break;
		case 1: System.out.println("How much is " + factor1 + " times " + factor2 + "?");
		break;
		case 2: System.out.println("How much is " + factor1 + " minus " + factor2 + "?");
		break;
		case 3: System.out.println("How much is " + factor1 + " divided by " + factor2 + " rounded to two decimal places?");
		break;
		}
	}
	
	private double readResponse() {
		return scan.nextDouble();
	}
	
	private String readResponse2() {
		return scan.next();
	}
	
	private int isAnswerCorrect() {
		int answer = 0;
		switch (operation) {
		case 0: if(readResponse() == (factor1 + factor2)) {
			answer = 1;
			break;
		} else {
			answer = 0;
			break;
		}
		case 1: if(readResponse() == (factor1 * factor2)) {
			answer = 1;
			break;
		} else {
			answer = 0;
			break;
		}
		case 2: if(readResponse() == (factor1 - factor2)) {
			answer = 1;
			break;
		} else {
			answer = 0;
			break;
		}
		case 3: if(factor2 == 0.0) {
			if(readResponse2().equalsIgnoreCase("undefined")) {
				answer = 1;
				break;
			} else {
				break;
			}
		} else {
			if(readResponse() == (Math.round((factor1 / factor2)*100.0)/100.0)) {
			answer = 1;
			break;
		} else {
			answer = 0;
			break;
		}
		}
		}
		return answer;
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
		CAI5 app = new CAI5();
		app.quiz();
		}
	}
