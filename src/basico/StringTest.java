package basico;

public class StringTest {
	public static void main(String[] args) {
		String s = "blooper";
		StringBuilder sb = new StringBuilder(s);
		s.append("whopper");
		sb.append("shopper");
		System.out.println(s);
		System.out.println(sb);
	}
}
