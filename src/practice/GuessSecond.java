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
		System.out.println(name+" 님 게임 시작합니다. Enter를 누르세요"); 
		scan = new Scanner(System.in);
		String enter = scan.nextLine();
		Calendar now = Calendar.getInstance();
		int firstSec = now.get(Calendar.SECOND);
		System.out.println("첫번째 초는 == "+firstSec);
		System.out.println("10초 예상 후 Enter 누르세요.");
		enter = scan.nextLine();
		now = Calendar.getInstance();
		int lastSec = now.get(Calendar.SECOND);
		if(lastSec<firstSec) {
			lastSec += 60;
		}
		System.out.println("두번째 초는 == "+lastSec);
		// System.out.println(lastSec - firstSec);
		return lastSec - firstSec;
	}
}


class Game {
		public Game() {
			
		}
		public void run() {
			Player playerList[] = new Player[2];
			playerList[0] = new Player("장성호");
			playerList[1] = new Player("이중화");
			
			System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
			int player01Time = playerList[0].turn();
			int player02Time = playerList[1].turn();
			System.out.println(playerList[0].getName()+" 님의 결과는 "+player01Time);
			System.out.println(playerList[1].getName()+" 님의 결과는 "+player02Time);
			int player01Result = Math.abs(10-player01Time) ;
			int player02Result = Math.abs(10-player02Time) ;		
			if(player02Result == player01Result) System.out.println("무승부 입니다");
			else if(player02Result < player01Result) System.out.println("승자는 "+playerList[1].getName());
			else System.out.println("승자는 "+playerList[0].getName());
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
