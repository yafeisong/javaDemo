package com.geor;

import java.io.File;
import java.util.List;

public class RidParse {

	
	public static void main(String[] args) throws Exception {
		parseRids(); 
	}
	
	public static void parseRids () throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\义马4.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		for(String line:lines){
			if(line.indexOf("<rid>")>-1){
				System.out.println(line);
			}
		}
		
	}

}
