package string;

public class EqualsTest {	

	
	public static void main(String[] args) {
		String s ="Test";
		String s1 ="Test";
		String s2 = new String("Test");
		String s3 = new String("Test");
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}
	
}
