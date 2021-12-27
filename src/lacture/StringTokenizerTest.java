package lacture;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String query = "name = ±è¿ø & age = 20 & weight = 50";
		StringTokenizer st = new StringTokenizer(query, "&");
		// System.out.println(query.split("&")[0]);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
		// System.out.println(st.nextToken());
	}
}
