package basico;

public class TestClass15 {
	public void switchString(String input){
		switch(input){
			case "a" : System.out.println( "apple" );
			case "b" : System.out.println( "bat" );
				break;
			case "c" : System.out.println( "cat" );
			default : System.out.println( "none" );
		}
	}
	
	public static void main(String[] args) throws Exception {
		TestClass15 tc = new TestClass15();
		tc.switchString("c");
	}
}
