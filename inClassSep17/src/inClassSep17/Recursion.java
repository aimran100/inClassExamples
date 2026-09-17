package inClassSep17;

public class Recursion {

	public static void main(String[] args) {
		int num = 30;
	    int result = factorial(num);
		System.out.printf("%d!     = %d\n", num,result);
		int result2 = factorialSum(num);
		System.out.printf("%d! Sum = %d\n", num,result2);

	}
	public static int factorial(int x) {
		/*
		int sum = 0;
		int val = x;
		if(x == 1) {
			return 1;
		}else {
			for(int i = x; x > 1; i--) {
				x--;
				val = x * val;
				sum = val;	
			}
			return sum;
		}
		*/
		// *** base case
		if(x==1) {
			return 1;
		}
		// *** recursive
		return x * factorial(x-1);
	}
	public static int factorialSum(int x) {
		// *** base case
				if(x==1) {
					return 1;
					
				}
				// *** recursive
				return x + factorialSum(x-1);

	}

	
}
