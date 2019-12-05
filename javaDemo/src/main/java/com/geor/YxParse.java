package com.geor;

import java.io.File;
import java.util.Calendar;
import java.util.List;

public class YxParse {

	public static void main(String[] args) throws Exception
	{
		yiXingParse();
	}
	
	public static void yiXingParse() throws Exception{
		File ys = new File ("C:\\Users\\Administrator\\Desktop\\yx1202fenxi\\ys.txt");
		File cj = new File ("C:\\Users\\Administrator\\Desktop\\yx1202fenxi\\cj.txt");
		
		File time = new File ("C:\\Users\\Administrator\\Desktop\\yx1202fenxi\\time.txt");

		
		List<String> ysList = FileUtils.readTxt(ys) ;
		List<String> cjList = FileUtils.readTxt(cj);
		List<String> tmList = FileUtils.readTxt(time);
		
		Calendar cal = Calendar.getInstance() ;
//		for(String te:tmList){
//			cal.setTimeInMillis(Long.parseLong(te));
//			System.out.println(String.format("%s-%s-%s %s:%s:%s", cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH),
//					cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND)));
//		}
		
		for(String ysn:ysList){
			if(!cjList.contains(ysn)){
				System.out.println(ysn);
			}
		}
	}
}
