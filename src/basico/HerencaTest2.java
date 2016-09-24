package basico;

interface Bozo{
	int type = 0;
	public void jump();
}

public class HerencaTest2 implements Bozo{
	public HerencaTest2(){
		type = 1;
	}
	
	public void jump(){
		System.out.println("jumping..."+type);
	}
	
	public static void main(String[] args){
		Bozo b = new HerencaTest2();
		b.jump();
	}
}
