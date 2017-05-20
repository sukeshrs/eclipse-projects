package generic;

public class StringAmbiguity {

	 public void foo(String s) {
		 System.out.println("String");
		 }

		 public void foo(StringBuffer sb){
		 System.out.println("StringBuffer");
		 }

		 public static void main(String[] args) {
			new StringAmbiguity().foo("");
			
			
			String s1 = "abc";
			StringBuffer s2 = new StringBuffer(s1);
			System.out.println(s1.equals(s2));
			
			
			inter();
		}

		private static void inter() {
			String s1 = "abc";
			String s2 = new String("abc");
			s2 = s2.intern();
			System.out.println(s1 ==s2);
		}
}
