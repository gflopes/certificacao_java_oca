package basico;

public class ArrayCopy {
	public static void main(String args[]) {
		int[] scores = {1, 2, 3, 4, 5, 6};
		
		String texto = new StringBuilder("world").insert(0, "hello ").toString();
		System.out.println(texto);
		
		System.arraycopy(scores, 2, scores, 3, 2);
		for (int i :  scores) System.out.println(i);
	}
}
