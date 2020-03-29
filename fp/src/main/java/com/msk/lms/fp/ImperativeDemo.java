package com.msk.lms.fp;

import java.util.Arrays;
import java.util.List;

public class ImperativeDemo {

	public static void main(String[] args) {
		// compute total sum of the double of even numbers in a list
		
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//code smell: repeated mutation of result variable
		int result=0;
		
		for(int n:numList){
			if(n%2==0){
				result+=2*n;
			}
		}
		System.out.println(result);
		
		//Imperative style: how to do and what to do
		
	}

}
