import java.util.Scanner;

public class AnalyzingScores {
	public static void main(String[] args) {
		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Define array, low count, high count, and average
		double[] scores = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		double average = 0;
		int lCount = 0, hCount = 0;

		//Ask for and read scores
		System.out.print("Enter up to 10 score. Negative number to finish: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextDouble();
			if (scores[i] < 0)
				break;
		}

		//Calculate low count, high count, and average
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 0) {
				average += scores[i];
			} else {
				average = average / i;
				break;
			}
		}
		
		for (double score: scores) {
			if (score >= 0) {
				if (score < average)
					lCount++;
				else
					hCount++;
			} else {
				break;
			}
		}

		//Find the sum of the digits, and print
		System.out.println("Average: " + (Math.round(average * 100) / 100));
		System.out.println("Number of scores at or above average: " + hCount);
		System.out.println("Number of scores below average: " + lCount);
	}


}