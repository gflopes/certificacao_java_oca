package basico;

public class StaticTest {
	void m1() {
		StaticTest.m2();
		m3();
		StaticTest.m4();
	}
	
	static void m2() {
		
	}
	
	void m3() {
		m1();
		m2();
		StaticTest.m1();
	}
	
	static void m4() {
		
	}
}
