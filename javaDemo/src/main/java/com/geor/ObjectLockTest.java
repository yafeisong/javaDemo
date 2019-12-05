package com.geor;

public class ObjectLockTest implements Runnable{
	static ObjectLock ol = new ObjectLock() ;
	
	String name = null ;
	
	@Override
	public void run() {
		try {
			ol.method1(name); 
			ol.method2(name);
			ol.method3(name); 
		} catch (Exception e) {
		
		}
	}
	
	private ObjectLockTest() {
		
	}
	
	private ObjectLockTest (String name){
		this.name = name;
	}

	public static void main(String[] args) {
		Thread olt = new Thread(new ObjectLockTest("objectTest1")) ;
		olt.start(); 
		
		Thread olt2 = new Thread(new ObjectLockTest("objectTest2")) ;
		olt2.start(); 
	}
}
