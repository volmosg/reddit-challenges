package diceRoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceRoller {
	
	public List<Integer> diceRoll(String[] rolls1) {
		List<Integer> counter = new ArrayList<Integer>();
		
		for (int i = 0; i < rolls1.length; i++) {
			int dPosition = rolls1[i].indexOf('d');
			int numberDices = Integer.parseInt(rolls1[i].substring(0, dPosition));
			int numberSides = Integer.parseInt(rolls1[i].substring(dPosition+1));
			
			int range = numberSides;
					
			int tempCounter = 0;
		
			for (int j = 1; j <= numberDices; j++) {
				Random rn = new Random();
				int randomNum = rn.nextInt(range) + 1;
				tempCounter = tempCounter + randomNum;
				
				}
			counter.add(tempCounter);
			}
		return counter;
	}

}
