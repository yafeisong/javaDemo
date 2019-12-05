package com.geor;

public class Parent {

	static {
		System.out.println("Parent.staticInit{}");
	}
	
	{
		System.out.println("Parent.normalInit{}");
	}
	
	public  Parent() {
		System.out.println("Parent.Parent()");
	}
	
}