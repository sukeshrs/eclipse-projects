package generic;

public class RemoveStringFromString {
	public static void main (String[] args){
		
		String main = "Test is calles  is test";
		String sub = "is";
		
		 main = main.replaceAll(sub, "");
		 System.out.println(main);
		 
		 String test = "Test";
		 String test1="Test";
		 
		 System.out.println(test.compareTo(test1));
		 
		 System.out.println( test1.toCharArray());
		 
		 char[] charArray = test1.toCharArray();
		 
		;
		 
	}

}
