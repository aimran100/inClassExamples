package inClassSep17;

public class Recursion {

	public static void main(String[] args) {
		//int num = 30;
	   // int result = factorial(num);
		//System.out.printf("%d!     = %d\n", num,result);
		//int result2 = factorialSum(num);
		//System.out.printf("%d! Sum = %d\n", num,result2);
		//count(0);
		int[] arr = {1,4,5,6,7,8,9,2};
		int[] arr2 = {44,33,22,11,9,8,7,6,5};
		int[] arr3 = {3,1,8,7,2,4,9,5};
		selectionSort(arr);
		insertionSort(arr2);

	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1;i++) {
			int val = i;
			for(int y = i + 1; y < arr.length;y++) {
				if(arr[y] < arr[val]) {
					val = y;
				}
			}
			int val2 = arr[val];
			arr[val] = arr[i];
			arr[i] = val2;
		/*	 int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
			 */
		}
		System.out.println("Selection Sorted Array");
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void quickSort(int[] arr) {
	}
	public static void insertionSort(int[] arr) {
		int n = arr.length;
        
        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Place the key at its correct position
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort: ");
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
        }
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
	public static void count(int num){
		if(num == 10) {
			return;
		}
		count(num+1);
		System.out.println(num);

	}

	
}
