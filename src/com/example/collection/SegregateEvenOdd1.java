package com.example.collection;

public class SegregateEvenOdd1 {

	static void segregateEvenOdd(int arr[])
    {
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1;
        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (arr[left]%2 == 0 && left < right)
                left++;
 
            /* Decrement right index while we see 1 at right */
            while (arr[right]%2 == 1 && left < right)
                right--;
 
            if (left < right)
            {
                /* Swap arr[left] and arr[right]*/
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
	
	// function to rearrange the array in given way.
    static void rearrangeEvenAndOdd(int arr[], int n)
    {
        // variables
        int j = -1,temp;
     
        // quick sort method
        for (int i = 0; i < n; i++) {
     
            // if array of element
            // is odd then swap
            if (arr[i] % 2 == 0) {
     
                // increment j by one
                j++;
     
                // swap the element
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
     
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 10, 18, 44, 2, 10, 9, 66 };
        int n = arr.length;
     
        segregateEvenOdd(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        rearrangeEvenAndOdd(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
