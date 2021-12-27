package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chap0607A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(">>");
			String str = scan.nextLine();
			if(str.equals("그만")) break;
			
//			StringTokenizer st = new StringTokenizer(str," ");
//			System.out.println("단어 갯수는 "+st.countTokens());
			String words[] = str.split(" ");
			System.out.println("단어 갯수는 "+words.length);
		}
		System.out.println("종료합니다.");
		scan.close();
	}

}
