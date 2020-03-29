package com.msk.lms.fp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BadClosureDemo {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);

		int factor[] = new int[]{2};

		Stream<Integer> numStream = numList.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * factor[0]);
		
		factor[0]=3;
		
		//Lazy evaluation
		numStream.forEach(System.out::println);

	}

}
