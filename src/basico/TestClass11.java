package basico;

public class TestClass11{
    int x = 5;
    int getX(){ return x; }

    public static void main(String args[]) throws Exception{
        TestClass11 tc = new TestClass11();
        tc.looper();
        System.out.println(tc.x);
    }
    
    public void looper(){
        int x = 0;
        System.out.println("getX: " + getX());
        System.out.println(x = getX());
        while( (x = getX()) != 0 ){
            for(int m = 10; m>=0; m--){
            	//System.out.println("m: " + m);
                x = m;
            }
        }
        
   }     
}
