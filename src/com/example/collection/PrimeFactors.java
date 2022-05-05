package com.example.collection;

public class PrimeFactors {

	public static void main(String[] args) {

		int n = 316;
		
		while ( n%2 == 0 ) {
			System.out.print(2 + " ");
			n = n/2;
		}
		
		for ( int i=3; i<Math.sqrt(n); i++ ) {
			while ( n%i == 0 ) {
				System.out.print(i + " ");
				n = n/i;
			}
		}
		// This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            System.out.print(n);
	}

}
