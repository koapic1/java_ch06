package lacture;

public class StringBufferTest {
	public static void main(String[] args) {
		// String �� ���� ���� ���̸� �����Ѵ�.
		String str01 = new String("String");
		StringBuffer sb = new StringBuffer("a");
		sb.append(" pencil");
		sb.insert(2, "good ");
		System.out.println(sb);
	}
}
