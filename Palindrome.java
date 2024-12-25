package com.nit.mukund;

public class Palindrome {

	public static void main(String[] args) {


		String name="madam";
		StringBuilder sb=new StringBuilder(name).reverse();
		if(name.equalsIgnoreCase(sb.toString())) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
	}

}
