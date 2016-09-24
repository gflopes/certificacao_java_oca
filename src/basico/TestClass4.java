package basico;

public class TestClass4 {
	static int si = 10;
	public static void main (String args[]){
		new TestClass4();
	}
	
	public TestClass4(){
		System.out.println(this);
	}
	
	public String toString(){
		return "TestClass.si = "+this.si;
	}
}
