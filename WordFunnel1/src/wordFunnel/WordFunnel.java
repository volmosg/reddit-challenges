package wordFunnel;

public class WordFunnel {
	
	
	
	public boolean wordFunnel(String word1, String word2) {
		String mutated = new String();
		boolean result = false;
		
		// iterate on the different characters of the word to be mutated
		for (int i = 0; i < word1.length(); i++) {
			// generate a mutated word by creating a gap in the i position
			mutated = word1.substring(0, i) + word1.substring(i+1, word1.length());
			if (mutated.equals(word2)) {
				result = true;
				break;
			}
		}

		return result;
	}
	

}
