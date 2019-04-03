package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		System.out.println("give me a name");
		String input = in.nextLine();
		for (int x=0;x<input.length();x++){
			System.out.println(input.charAt(x));
		}
	}
}
