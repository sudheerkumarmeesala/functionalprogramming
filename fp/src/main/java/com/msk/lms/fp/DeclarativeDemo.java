package com.msk.lms.fp;

import java.util.Arrays;
import java.util.List;

public class DeclarativeDemo {

	public static void main(String[] args) {
		// compute total sum of the double of even numbers in a list

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//No mutation; Only transformation
		System.out.println(
				numList.stream()
				.filter(e -> e % 2 == 0)
				.mapToInt(e -> e * 2)
				.sum());
		
		//Declarative style: what to do
	}

}
