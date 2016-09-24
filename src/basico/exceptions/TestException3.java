package basico.exceptions;

public class TestException3 {
	public static void main(String args[]) {
		String nome = null;
		
		try {
			nome.toLowerCase();
			System.out.println("a");
		} catch (NullPointerException ex) {
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
		
		System.out.println("d");
	}
}
