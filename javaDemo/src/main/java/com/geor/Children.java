package com.geor;

public class Children extends Parent{

//	static {
//		System.out.println("Children.staticInit{}");
//	}
//	
//	{
//		System.out.println("Children.normalInit{}");
//	}
//	
	public  Children() {
		System.out.println("Children.Children()");
	}
	
	public static void main(String[] args) {
		
		for(int i =0;i<2000;i++){
			byte [] bs = new byte[1024];
			System.out.println(i);
		}
	}
	
	
	public static  void throwExcetion(){
		boolean b = true;
		
		try {
			if(b){
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end..");
		
		System.out.println("end...2");
		System.out.println("Children.throwExcetion()");
		
	}
	
}
