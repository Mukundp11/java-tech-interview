package com.nit.mukund;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWord {

	public static void main(String[] args) {

		 Map<Integer,List<String>> word=new HashMap<>();
		 List<String> name=Arrays.asList("one","two","three");
		 System.out.println("name in list are:"+name);
		 word.put(1, Arrays.asList("one"));
		 word.put(2,Arrays.asList("two"));
		 word.put(3,Arrays.asList("three"));
		 System.out.println("words are:"+word);
		 
		 Map<Integer, List<String>> collectword = name.stream().collect(Collectors.groupingBy(String::length));
		 System.out.println("word are as follows:"+collectword);
		 
		
	}

}
