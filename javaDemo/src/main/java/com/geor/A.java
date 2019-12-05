package com.geor;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A {
	
	public static void main(String[] args) throws Exception {
		areaFilter(); 
	}
	
	public static void areaFilter() throws Exception{
		Set<String> areas = new HashSet<String>();
		areas.add("江苏");
		areas.add("江苏");
		areas.add("南京");
		areas.add("苏州");
		areas.add("无锡");
		areas.add("常州");
		areas.add("镇江");
		areas.add("扬州");
		areas.add("泰州");
		areas.add("南通");
		areas.add("徐州");
		areas.add("淮安");
		areas.add("宿迁");
		areas.add("连云港");
		areas.add("盐城");
		areas.add("江阴");
		areas.add("宜兴");
		areas.add("邳州");
		areas.add("新沂");
		areas.add("溧阳");
		areas.add("张家港");
		areas.add("常熟");
		areas.add("太仓");
		areas.add("昆山");
		areas.add("如皋");
		areas.add("海门");
		areas.add("启东");
		areas.add("东台");
		areas.add("高邮");
		areas.add("仪征");
		areas.add("丹阳");
		areas.add("扬中");
		areas.add("句容");
		areas.add("靖江");
		areas.add("兴化");
		areas.add("泰兴");
		areas.add("海安");
		areas.add("如东");
		areas.add("宝应");
		areas.add("建湖");
		areas.add("阜宁");
		areas.add("射阳");
		areas.add("滨海");
		areas.add("响水");
		areas.add("涟水");
		areas.add("盱眙");
		areas.add("金湖");
		areas.add("沭阳");
		areas.add("泗阳");
		areas.add("泗洪");
		areas.add("东海");
		areas.add("灌云");
		areas.add("灌南");
		areas.add("睢宁");
		areas.add("沛县");
		areas.add("丰县");
		areas.add("梁溪");
		areas.add("锡山");
		areas.add("惠山");
		areas.add("滨湖");
		areas.add("新吴");
		
		
		File file = new File("C:\\Users\\Administrator\\Desktop\\filter.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		for(String line:lines){
			boolean contain = false;
			for(String key :areas){
				if(line.contains(key)){
					contain = true ;
				}
			}
			if(!contain){
				System.out.println(line);
			}
		}
		
		
		
		
		
	}

}
