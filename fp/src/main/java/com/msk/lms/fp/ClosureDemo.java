package com.msk.lms.fp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClosureDemo {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);

		int factor = 2;

		Stream<Integer> numStream = numList.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * factor);
		
		//effectively final
		//factor=3;
		
		numStream.forEach(System.out::println);

	}

}
