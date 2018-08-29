package wordFunnel;

import java.util.Scanner;

public class WordFunnelLauncher {

	public static void main(String[] args) {
		// Request two strings to the user
		System.out.println("Introduce two words: ");
		Scanner reader = new Scanner(System.in);
		String word1 = reader.nextLine();
		String word2 = reader.nextLine();
		reader.close();
		// initialize result
		boolean result = false;
		
		// create WordFunnel object and keep the result in a variable
		WordFunnel wd = new WordFunnel();
		result = wd.wordFunnel(word1, word2);
		
		// print the output!
		System.out.println("funnel(" + word1 + "," + word2 + ") => " + result);

	}

}
