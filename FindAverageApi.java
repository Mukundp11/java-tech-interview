package com.nit.mukund;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageApi {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,2,6,5,6);
		System.out.println("numbers in list are:"+numbers);
		OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
		System.out.println("average is:"+average);
	}

}
