package basico.exceptions;

public class TestException1 {
	public static void main(String args[]) {
		String nome;
		
		try {
			nome.toLowerCase();
			System.out.println("a");
		} catch (NullPointerException ex) {
			System.out.println("b");
		}
		
		System.out.println("c");
	}
}
