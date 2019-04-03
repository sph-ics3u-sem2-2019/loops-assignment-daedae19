package problem5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read the string and output in reverse case.
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		for (int x=0;x<word.length();x++) {
			 char letter=word.charAt(x);
			 if (letter>='A' && letter<='Z') {
				 System.out.print(Character.toLowerCase(letter));
			 }else {System.out.print(Character.toUpperCase(letter));
		}
	}

}
}