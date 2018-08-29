package vog.SalesCommissions;

import java.util.Arrays;

public class ComissionCalculator {
	
	// comissions matrix used for intermediate maths
	// results array with final calculations
	int [][] comissions = new int [4][5];
	private double [] results = new double [5];
	private String finalResult = "";
	

	public double[] getResults() {
		return results;
	}


	public String getFinalResult() {
		return finalResult;
	}


	public String resultCalculator(int [][] revenues, int [][] expenses) {
		// loop over the (1) columns and (2) the rows of the matrices (revenues and
		// expenses have the same dimensions, so it doesn't matter
		for (int i = 0; i < revenues[0].length; i++) {
			for (int j = 0; j < revenues.length; j++) {
				// only apply the comission percentage if positive balance
				 if (revenues[j][i] - expenses[j][i] <= 0) {
					 comissions[j][i] = 0;
				 }
				 else {
					 comissions[j][i] = revenues[j][i] - expenses[j][i];
					 
				 }
				 results[i] += comissions[j][i] * 0.062;
				 
			}
		}
		
		finalResult = Arrays.toString(results);
		return finalResult;
    }

	

}
