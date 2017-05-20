package generic;

public class Factorial {
	
	public static long factorial(long n){
		if (n==1){
			return 1;
		}else{
		return n * factorial(n-1);
		}
		
	}
	
	public static long factorialUsingFor(long n){
		if (n==1){
			return 1;
		}
		
		int fact =1;
		for(int i=0;i<=n;i++){
			fact = fact *i;
		}
		return fact;
		
	}

}
