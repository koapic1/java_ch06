package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chap0607A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(">>");
			String str = scan.nextLine();
			if(str.equals("�׸�")) break;
			
//			StringTokenizer st = new StringTokenizer(str," ");
//			System.out.println("�ܾ� ������ "+st.countTokens());
			String words[] = str.split(" ");
			System.out.println("�ܾ� ������ "+words.length);
		}
		System.out.println("�����մϴ�.");
		scan.close();
	}

}
