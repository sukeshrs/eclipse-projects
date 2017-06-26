package string;

import java.util.Stack;

public class StringReverse {
	public static void main(String args[]){
		String test = "123456";
		
		//Using api
		test = new StringBuilder(test).reverse().toString();
		System.out.println(test);
		
		//Using charArray		
		usingCharArray(test);
		
		//Using Stack		
		reverseUsingStack(test);
	}

	private static void reverseUsingStack(String test) {
		System.out.println("Before stack reverse:" + test);
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<test.length();i++){
			stack.push(test.charAt(i));
		}

		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		
		System.out.println("After stack reverse :" + sb.toString());
	}

	private static void usingCharArray(String test) {
		System.out.println("Before char array reverse:" + test); 
		char[] a = test.toCharArray();
		int startIndex = 0;
		int endIndex = a.length -1;
		char temp;
		for (int i=0;i<=endIndex;i++){
			temp = a[startIndex];
			a[startIndex] = a[endIndex];
			a[endIndex] = temp;
			startIndex ++;
			endIndex--;
		}
		System.out.println("After char array reverse :"+new String(a));
	}

}
