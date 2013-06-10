import java.util.Scanner;

public class StudentHighScore {
	public static void main(String[] args) {
		//Declare variables
		int numOfStudents;
		double highScore = 0.0;
		String highScoreStudent = "";
		int loopCount = 0;


		//Create a scanner for reading console
		Scanner input = new Scanner(System.in);

		//Ask for and read number of students
		System.out.print("Enter the number of students: ");
		numOfStudents = input.nextInt();
		if (numOfStudents < 1)
			System.exit(0);

		//Ask for student name and score
		System.out.print("Please enter the students FULL name and their score: ");

		//Read student name and score
		while (loopCount < numOfStudents) {
			loopCount++;

			String firstName = input.next();
			String lastName = input.next();
			double score = input.nextDouble();

			if (score > highScore){
				highScore = score;
				highScoreStudent = firstName + " " + lastName;
			}
		}

		//Print output
		System.out.println(highScoreStudent + " has the high score of " + highScore + "!");

	}
}