package lacture;

class Rect {
	private int width;
	private int height;
	
	// ������ �Լ� Class�� �̸��� ���ƾ� ��.
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Rect tempRect = (Rect)obj;
		if(width * height == tempRect.width * tempRect.height) return true;
		return false;
	}
}

public class RectTest {
	public static void main(String[] args) {
		Rect rect01 = new Rect(10, 10);
		Rect rect02 = new Rect(5, 20);
		System.out.println(rect01 == rect02);
		System.out.println(rect01.equals(rect02));
		System.out.println(rect01);
		System.out.println(rect02);
	}
}