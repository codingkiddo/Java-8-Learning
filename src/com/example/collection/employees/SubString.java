package com.example.collection.employees;

import java.util.HashSet;
import java.util.Set;

public class SubString {

	public static void main(String[] args) {

		Set<String> result = new HashSet<>();
		String s = "abdd";
		
		for ( int i=0; i<s.length(); i++ ) {
			String ss = "";
			
			for ( int j=i+1; j<s.length(); j++ ) {
				ss+=s.charAt(i);
				ss+=s.charAt(j);
				if( ss.length() == 2 ) {
					result.add(ss);
				}
				ss="";
			}
		}
		
		System.out.println(result);
	}

}
