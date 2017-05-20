package generic;


public class TestFibonacci {

	public static void main(String[] args) {
	
		int i = 1;
		int j = 2;
		int temp =0;
		for (int a=0; a<10 ; a++){
			temp = j;
			j=i+j;
			i= temp;
			System.out.println("JJJ" + j);
		}

	}

}
