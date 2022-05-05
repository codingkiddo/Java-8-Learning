package com.example.collection;

public class Largest2ndElementInArray {

	public static void main(String[] args) {
		
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		print2ndLargest(arr);
		
		
		int arr2[] = { 12, 35, 12};
		print2ndLargest(arr2);
		
		int arr3[] = { 12, 12, 12};
		print2ndLargest(arr3);
		
		int arr4[] = { 12 };
		print2ndLargest(arr4);
		
	}

	private static void print2ndLargest(int arr[]) {
		
		int n = arr.length;
		int first, second;
		first = second = Integer.MIN_VALUE;
		
		// There should be atleast two elements
	    if (n < 2)
	    {
	        System.out.printf(" Invalid Input ");
	        return;
	    }
		
		for (int i=0; i<n; i++) {
			if ( arr[i] > first ) {
				second = first;
				first = arr[i];
			}
			
			if (arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		}
		if (second == Integer.MIN_VALUE)
	        System.out.printf("There is no second " +
	                          "largest element\n");
	    else
	        System.out.printf("The second largest " +
	                          "element is %d\n", second);
	}
}
