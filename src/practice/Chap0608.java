package practice;

import java.util.Scanner;

public class Chap0608 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for(int i = 1; i < str.length()+1; i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0, i));
		}
		scan.close();
	}
}
