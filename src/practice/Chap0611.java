package practice;

import java.util.Scanner;

public class Chap0611 {
	private String str;
	StringBuffer sb;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">>");
		str = scan.nextLine();
		
		sb = new StringBuffer(str);
		
		while(true) {
			System.out.println("���: ");
			String order = scan.nextLine();
			
			if(order.equals("�׸�")) {
				System.out.println("�����մϴ�."); break; 
			}
			
			String[] words = order.split("!");
			if(words.length != 2) {
				System.out.println("�߸��� ����Դϴ�!");
			} else {
				if(words[0].length() == 0 || words[1].length() == 0){
					System.out.println("�߸��� ����Դϴ�!");
					continue;
				}
			}
				
			int idx = sb.indexOf(words[0]);
			if(idx == -1) {
				System.out.println("ã�� �� �����ϴ�!");
				continue;
			}
			sb.replace(idx, idx+words[0].length(), words[1]);
			System.out.println(sb);	
		}
	}
	public static void main(String[] args) {
		Chap0611 word = new Chap0611();
		word.run();
	}
}
