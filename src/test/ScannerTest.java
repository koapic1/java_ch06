package test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		char ch = 'a';
		int num = 10;
		// String str = new String("aaa"); 객체지만 사용빈도가 높아 선언 없이 바로 사용 가능.
		String str = "aaa";
		Scanner scan = new Scanner(System.in);
		Scanner scan02 = new Scanner(System.in);
		Scanner scan03 = scan;
		System.out.println(scan.hashCode());
		System.out.println(scan02.hashCode());
		System.out.println(scan.equals(scan03));
	}
}
