package com.geor;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B {
	public static void main(String[] args) throws Exception {
		f1();
	}
	
	public static void f1 () throws Exception {
		File file = new File ("C:\\Users\\Administrator\\Desktop\\parse\\1814.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		Set<String> coms = new HashSet<String>();
		
		for(String line:lines){
			if(line.endsWith("公司")){
				coms.add(line) ;
			}
		}
		
		for(String s:coms){
			System.out.println(s);
		}
		
	}

}
