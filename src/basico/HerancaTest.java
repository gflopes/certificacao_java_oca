package basico;

class Base{
	public short getValue(){ return 1; } //1
}

class Base2 extends Base{
   public byte getValue(){ return 2; } //2
}

public class HerancaTest{
   public static void main(String[] args){
      Base b = new Base2();
      System.out.println(b.getValue()); //3
   }
}