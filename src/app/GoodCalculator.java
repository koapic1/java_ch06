package app;

import lib.Calculator;

public class GoodCalculator extends Calculator {

	@Override //?????
	public int add(int a, int b) {
		
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double avg(int[] arr) {
		double sum = 0;
		for(int i = 0; i<arr.length;i++) {
			sum = arr[i];
		}
		return sum/arr.length;
	}
}
