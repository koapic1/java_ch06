package app;

import lib.Calculator;

// ���� design  pattern
public class CalcTest {

	public static void main(String[] args) {
		Calculator calc = new GoodCalculator();
		System.out.println(calc.add(10, 20));
	}
}
