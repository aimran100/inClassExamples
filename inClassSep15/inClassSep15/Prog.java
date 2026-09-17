package inClassSep15;

import java.util.Random;

public class Prog {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int location;
		
		loadArrayRandom(numbers,100,1);
		//showArray(numbers);
		bubbleSort(numbers);
		showArray(numbers);
		
		location = linearSearch(numbers,5);
		System.out.printf("The value is at %d\n", location);
	}
	
	public static void loadArrayRandom(int[] theArray, int noRands, int start) {
		Random rand = new Random();
		int index;
		
		for(index=0;index<theArray.length;index++) {
			theArray[index] = rand.nextInt(noRands) + start;
		}
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		for(index=0;index<theArray.length;index++) {
			System.out.printf("[%d]: %d\n", index,theArray[index]);
		}
		
	}
	
	public static int linearSearch(int[] theArray, int value) {
		int location=-1;
		int index;
		
		for(index=0;index<theArray.length;index++) {
			if(theArray[index]==value) {
				location=index;
				break;
			}
		}
		return location;
	}
	
	public static void bubbleSort(int[] theArray) {
		int pass;
		int index;
		int temp;
		
		for(pass=0;pass<theArray.length-1;pass++) {
			for(index=0;index<theArray.length-1;index++) {
				if(theArray[index]>theArray[index+1]) {
					temp=theArray[index];
					theArray[index]=theArray[index+1];
					theArray[index+1]=temp;
				}
			}
		}	
	}
	
	public static int binarySearch(int[] array,int value) {
		int left = 0;
		int right = array.length - 1;
		
		while(left <= right) {
			int location = (left + right) / 2;
			
			if(array[location] == value) {
				return location;
			}else if (array[location] < value) {
				left = location + 1;
			}else {
				right = location - 1;
			}
		}
		return -1;
	}

}
