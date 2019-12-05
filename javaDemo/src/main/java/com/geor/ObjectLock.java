package com.geor;

public class ObjectLock {
	
	public synchronized void method1(String name) throws Exception{
		
		System.out.println(name + ":ObjectLock.method1(),start ..");
		Thread.sleep(1000); 
		System.out.println(name + ":ObjectLock.method1(),end..");
	}
	
	public synchronized void method2(String name) throws Exception{
		System.out.println(name + ":ObjectLock.method2(),start..");
		Thread.sleep(1000);
		System.out.println(name + ":ObjectLock.method2(),end ..");
	}
	
	public void method3(String name ) throws Exception{
		System.out.println(name + ":ObjectLock.method3(),start ..");
		Thread.sleep(1000);
		System.out.println(name + ":ObjectLock.method3(),end ..");
	}
}
