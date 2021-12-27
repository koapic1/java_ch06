package practice;

import java.util.Calendar;
import java.util.Scanner;

class Player {	
	private Scanner scan;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Scanner getScan() {
		return scan;
	}
	public int turn() {
		System.out.println(name+" �� ���� �����մϴ�. Enter�� ��������"); 
		scan = new Scanner(System.in);
		String enter = scan.nextLine();
		Calendar now = Calendar.getInstance();
		int firstSec = now.get(Calendar.SECOND);
		System.out.println("ù��° �ʴ� == "+firstSec);
		System.out.println("10�� ���� �� Enter ��������.");
		enter = scan.nextLine();
		now = Calendar.getInstance();
		int lastSec = now.get(Calendar.SECOND);
		if(lastSec<firstSec) {
			lastSec += 60;
		}
		System.out.println("�ι�° �ʴ� == "+lastSec);
		// System.out.println(lastSec - firstSec);
		return lastSec - firstSec;
	}
}


class Game {
		public Game() {
			
		}
		public void run() {
			Player playerList[] = new Player[2];
			playerList[0] = new Player("�强ȣ");
			playerList[1] = new Player("����ȭ");
			
			System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
			int player01Time = playerList[0].turn();
			int player02Time = playerList[1].turn();
			System.out.println(playerList[0].getName()+" ���� ����� "+player01Time);
			System.out.println(playerList[1].getName()+" ���� ����� "+player02Time);
			int player01Result = Math.abs(10-player01Time) ;
			int player02Result = Math.abs(10-player02Time) ;		
			if(player02Result == player01Result) System.out.println("���º� �Դϴ�");
			else if(player02Result < player01Result) System.out.println("���ڴ� "+playerList[1].getName());
			else System.out.println("���ڴ� "+playerList[0].getName());
			playerList[0].getScan().close();
			playerList[1].getScan().close();
		}
}

public class GuessSecond {
		public static void main(String[] args) {
			Game game = new Game();
			game.run();
		}
}
