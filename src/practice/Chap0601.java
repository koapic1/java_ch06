package practice;
class MyPoint {
	private int x,y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		MyPoint temp = (MyPoint)obj;
		if(x==temp.x && y==temp.y) return true; 
		return false;
	}
}

public class Chap0601 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(10, 30);
		MyPoint q = new MyPoint(4, 50);
		if(p.equals(q)) System.out.println("같은 점");
		else System.out.println("다른 점");
	}

}
