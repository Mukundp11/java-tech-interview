package com.nit.mukund;

public class DemoStringModify {

	public static void main(String[] args) {

StringBuilder sb=new StringBuilder("abc");
stringModify(sb);
System.out.println(sb);

	}

	public static void  stringModify(StringBuilder sb) {
		sb.append("def");
		
		sb=new StringBuilder("xyz");
		sb.append("123");
		
	}
}
