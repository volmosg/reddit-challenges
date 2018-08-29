package diceRoller;

import java.util.ArrayList;
import java.util.List;

public class DiceLauncher {

	public static void main(String[] args) {
		
		String[] rolls1 = {"4d10","2d6","10d2"};
		List<Integer> result = new ArrayList<Integer>();
		
		DiceRoller dc = new DiceRoller();
		result = dc.diceRoll(rolls1);
		
		for (int i : result) {
			System.out.println("Result: " + i);
		}

	}

}
