package com.nit.mukund;

public class Person {

	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null || getClass() !=obj.getClass()) return false;
		Person person=(Person) obj;
		return age==person.age && name.equals(person.name);
		
		
	}
	@Override
	public int hashCode() {
		return 44;
		
	}
	
	public static void main(String[] args) {
		Person p=new Person("dilip",40);
		Person p2=new Person("dilip",40);
		
		System.out.println("person1.hashCode(): is"+p.hashCode());
		System.out.println("person2.hashcode: "+p2.hashCode());
		
		System.out.println("hash code is same:"+( p.hashCode()==p2.hashCode()));
		
	}
}
