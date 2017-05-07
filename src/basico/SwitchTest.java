package basico;

class SwitchTest{
	public static void main(String args[]){
		boolean flag = false;
		for ( int i = 0 ; i < 3 ; i++){
			switch (i){
				flag = true;
			}

			if ( flag ) {
				System.out.println(i);
			}
		}
	}
}
