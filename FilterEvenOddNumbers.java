package com.nit.mukund;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEvenOddNumbers extends M {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		System.out.println("List contains:"+numbers);
		
		List<Integer> even = numbers.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		
		System.out.println("Even Numbers are:"+even);
		
		List<Integer> odd = numbers.stream()
				.filter(n->n%2!=0)
		        .collect(Collectors.toList());
		System.out.println("Odd Numbers are:"+odd);
		
		M a=new FilterEvenOddNumbers();
		a.a=30;
		System.out.println(a.a);
		
	}}
 abstract class M{
	int a;
	public M(){}
}

