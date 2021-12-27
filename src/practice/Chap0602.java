package practice;

import java.util.Objects;

class Circle {
	private int x,y,radius;
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle (" + x + ", " + y + "), 반지름 = " + radius;
	}
	@Override
	public boolean equals(Object obj) {
		Circle temp = (Circle) obj;
		return temp.x == x && temp.y == y;
	}
}
public class Chap0602 {
	public static void main(String[] args) {
		 Circle circle01 = new Circle(10,10,50);
		 Circle circle02 = new Circle(10,10,30);
		 System.out.println(circle01);
		 if(circle01.equals(circle02)) System.out.println("같은 원");
		 else System.out.println("다른 원");
	}
}
