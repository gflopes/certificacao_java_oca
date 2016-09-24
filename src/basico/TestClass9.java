package basico;

class A1{
	   final int fi = 10;
}

public class TestClass9 extends A1{
   int fi = 15;
   public static void main(String[] args){
	   TestClass9 b = new TestClass9();
       b.fi = 20;
       System.out.println(b.fi);
       System.out.println(  (  (A1) b  ).fi  );
   }
}
