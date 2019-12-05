package com.geor;

public class ChangeChracter {
	public static void main(String[] args) throws Exception {
//		changeChracter(); 
		
		getLocale();
		
	}
	public static void changeChracter() throws Exception{
		String string = "测试转码";
		
//		String utf8 = new String(string.getBytes("UTF-8"));
//		
//		System.out.println(utf8);
		
		String gbk = new String(string.getBytes("UTF-8"),"GBK");
		
		System.out.println("utf8->gbk:"+gbk);
		
		String utf8second = new String(gbk.getBytes("GBK"),"UTF-8");
		
		System.out.println("gbk-utf8:"+utf8second);
		
//		System.out.println(new String(new String(string.getBytes("GBK"),"UTF-8").getBytes("UTF-8"),"GBK"));
	}
	
	public static void getLocale() throws Exception{
		System.out.println(System.getProperty("file.encoding"));
	}
}
