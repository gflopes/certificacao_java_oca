package basico;

import java.io.*;
class Great {
    public void doStuff() throws FileNotFoundException{
    }    
}

class Amazing extends Great { 
  public void doStuff(){ //throws IOException, IllegalArgumentException{
  }    
}

public class TestClass {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
    }
}