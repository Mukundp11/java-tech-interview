package com.nit.mukund;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {


		List<Integer> al=Arrays.asList(1,2,3,4,6,1,2,3,7,8,9);
		System.out.println(al);
		Set<Integer> s=new HashSet<Integer>(al);
		System.out.println(s);
		List<Integer> unique = al.stream().distinct().collect(Collectors.toList());
		System.out.println("unique elements are:"+unique);
	}
}
