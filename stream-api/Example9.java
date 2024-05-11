package com.javamultiplex.streams;

import java.util.ArrayList;
import java.util.Arrays;

//Convert list to array.
public class Example9 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);

		//list.stream().forEach(I -> System.out.println(I));


		list.forEach(System.out::println);

		Integer[] arr = list.stream().toArray(Integer[]::new);

		/*for (Integer a : arr) {
			System.out.println(a);
		}*/


		System.out.println("arr " + arr);

		list.stream().toArray(Integer[]::new);


		// Printing array content
		System.out.println("Array content");
		Arrays.stream(arr).forEach(System.out::println);

	}

}
