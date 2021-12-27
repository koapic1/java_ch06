package lacture;

public class StringBufferTest {
	public static void main(String[] args) {
		// String 과 유사 가변 길이를 제공한다.
		String str01 = new String("String");
		StringBuffer sb = new StringBuffer("a");
		sb.append(" pencil");
		sb.insert(2, "good ");
		System.out.println(sb);
	}
}
