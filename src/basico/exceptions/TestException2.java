package basico.exceptions;

public class TestException2 {
	public static void main(String args[]) {
		String nome = null;
		
		try {
			nome.toLowerCase();
			System.out.println("a");
		} catch (NullPointerException ex) {
			System.out.println("b");
		}
		
		System.out.println("c");
	}
}
