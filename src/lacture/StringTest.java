package lacture;

public class StringTest {
	public static void main(String[] args) {
		String str01 = "abcd";
		char strList [] = {'a', 'b', 'c', 'd'};
		String str02 = new String(strList);
		String str03 = new String("a/b/cd");
		String str04 = "   abcd    ";	
		String subject = "ũ���������� ���������ϴ�. �츮�� �� 1�� 3�� ���� �ʴ� �ɱ��....?";
		System.out.println(str01.equals(str03));
		
		System.out.println(str01.charAt(0));
		System.out.println(str01.contains("ab"));
		System.out.println(str01.length());
		System.out.println(str03.split("/")[2]); // �ɰ��� �迭�� ����
		System.out.println(str04.trim().charAt(0)); // trim : ��/�� ���� ���� 
		
		System.out.println(str01+str02);
		System.out.println(str01.concat(str02));
		System.out.println(subject.substring(0,10)+ " ...");
	}
}
