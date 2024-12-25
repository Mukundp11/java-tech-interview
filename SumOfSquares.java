package com.nit.mukund;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,2);
		Integer sum = numbers.stream().map(n->n*n).reduce(1,Integer::sum);
		System.out.println("sum is :"+sum);
		
		
		
	}

}
