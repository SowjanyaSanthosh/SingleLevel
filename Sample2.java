package com.org;

public class Sample2 implements Sample1 {
	
	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		s2.m1();
		s2.m2();

	}

	@Override
	public void m1() {
		System.out.println("m1 method present in Sample2 class");		
	}

	@Override
	public void m2() {
		System.out.println("m2 method present in Sample2 class");
		
	}

}
