package vog.SalesCommissions;

public class ComissionLauncher {

	public static void main(String[] args) {
		// testing matrices
		int [][] revenues = {{190, 140, 1926, 14, 143},
				{325,19,293,1491,162},
				{682,14,852,56,659},
				{829,140,609,120,87}};
		int [][] expenses = {{120,65,890,54,430},
				{300,10,23,802,235},
				{50,299,1290,12,145},
				{67,254,89,129,76}};
		
		ComissionCalculator operation1 = new ComissionCalculator();
		operation1.resultCalculator(revenues, expenses);
		System.out.println(operation1.getFinalResult());

	}

}
