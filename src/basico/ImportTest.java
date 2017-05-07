package basico;

import java.io.*;

public class ImportTest {
	public static void main(String[] args){
		PrintWriter pw = new PrintWriter(System.out);
		OutputStreamWriter osw = new OutputStreamWriter( System.out );
		pw.print("hello");
	}
}
