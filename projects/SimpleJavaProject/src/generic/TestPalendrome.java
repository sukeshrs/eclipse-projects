package generic;


public class TestPalendrome {
	
	public static void main(String[] args) {
		
		String s = args[0];
		
		if (s.equals(new StringBuilder(s).reverse().toString())){
			System.out.println(s + "is pal");
		}else {
			System.out.println(s + "is not pal");
		}
		
		System.out.println("Is palendrome " +isPalendrome(s));

	}

	private static boolean isPalendrome(String s) {
		int length = s.length();
		
		//7 , 6 , 8
		
		for (int i=0;i<(length/2);i++){
			
			if (s.charAt(i) != s.charAt(length-i-1)){
			return false;	
			}
			
		}
		return true;
	}

}
