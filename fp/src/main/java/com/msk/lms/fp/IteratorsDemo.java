package com.msk.lms.fp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IteratorsDemo {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

		// External Iterators; Not Polymorphic
		
//		for (int i = 0; i < numList.size(); i++) {
//			System.out.println(numList.get(i));
//		}

		// for (int n : numList) {
		// System.out.println(n);
		// }

		// Internal Iterators
		
		 numList.forEach(new Consumer<Integer>() {
		 @Override
		 public void accept(Integer n) {
		 System.out.println(n);
		 }
		 });

		numList.forEach((Integer n) -> System.out.println(n));

		// Type Inference
		
		numList.forEach(n -> System.out.println(n));

		// Method Reference
		
		numList.forEach(System.out::println);
	}

}
