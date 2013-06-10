import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceFileString {

	public static void main(String[] args) throws Exception {
		//Check arguments
		if (args.length != 3) {
			System.out.println("Useage: file oldStr newStr");
			System.exit(0);
		}
		
		//Create file and check for existence
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exists");
			System.exit(0);
		}
		
		//Create scanner for input and String for storage
		Scanner input = new Scanner(file);
		String text = "";
		
		while (input.hasNext()) {
			text += input.nextLine().replaceAll(args[1], args[2]) + System.getProperty("line.separator");;
		}
		input.close();
		
		//Create PrintWritter for output
		PrintWriter output = new PrintWriter(file);

		//Print output and close
		output.print(text.substring(0, text.length() - 2));
		output.close();
	}

}
