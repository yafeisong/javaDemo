package com.geor;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogParse {
	
	public static void main(String[] args) throws Exception {
		parse();
	}
	
	public static void parse() throws Exception{
		
		File file = new File("C:\\Users\\Administrator\\Desktop\\xzlog\\grs.service-2019-11-27.5.log");
		
		List<String> lines = FileUtils.readTxt(file);
		
		Map<String,Integer> map = new HashMap<String, Integer> ();
		
		
		Set<String> set = new HashSet<String> ();
		
		for(String line :lines){
			if(line.startsWith("2019-11-27")){
				String date = line.split(",")[0];
				
				Integer num = map.get(date) ;
				
				num = num ==null ?1:num +1 ;
				map.put(date, num) ;
				
				
				set.add(date) ;
				
			}
		}
		
		List<String> list = new ArrayList<String> ();
		
		for(String s:set){
			list.add(s) ;
		}
		
		Collections.sort(list); 
		
		for(String s :list){
			System.out.println(String.format("%s=%s", s,map.get(s)));
		}
		
		
	}
}
