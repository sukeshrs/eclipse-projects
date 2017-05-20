package generic;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrintBinary {

	public static void main(String[] args) {
		int lenthOfBinary = 5;
		char[] chars = new char[lenthOfBinary];

		Arrays.fill(chars, '1');
		String maxBinary = new String(chars);
		print("Max Binary number with length " + lenthOfBinary + ":" + maxBinary);

		int decimalValue = Integer.parseInt(maxBinary, 2);
		print("Decimal value of max binary : " + decimalValue);

		Set<String> binarySet = new TreeSet<String>();

		for (int i = 0; i <= decimalValue; i++) {
			String temp = Integer.toBinaryString(i);
			temp = String.format("%0" + lenthOfBinary + "d", Integer.parseInt(temp));
			// Check if any adjacent ones
			if (checkAdjacentOnes(temp)) {
				binarySet.add(temp);
			}
		}

		print(binarySet);

	}


	private static boolean checkAdjacentOnes(String input) {
		char one = '1';
		int length = input.length();
		for (int i = length - 1; i > 0; i--) {
			if (input.charAt(i) == one && input.charAt(i - 1) == one) {
				System.out.println("This number has Adjacent Ones :" + input);
				return false;
			}
		}
		return true;
	}
	
	private static void print(Object binarySet) {
		System.out.println(binarySet);
	}

}
