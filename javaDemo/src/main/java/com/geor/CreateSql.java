package com.geor;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.Sides;

public class CreateSql {
	
	public static void main(String[] args) throws Exception {
//		createSql();
		
		
		createRandomSql(); 
	}
	
	public static void parseResult() throws Exception{
		
	}
	
	public static void createSql() throws Exception{
		File file =new File("C:\\Users\\Administrator\\Desktop\\173.txt");
		File file180 =new File("C:\\Users\\Administrator\\Desktop\\180.txt");
		
		
		File sqlFile = new File("D:/sqlFile.sql");
		
		sqlFile.delete() ;
		
		List<String> lines = FileUtils.readTxt(file180) ;
		
		List<String> lines173 = FileUtils.readTxt(file) ;
		
		String sql = "INSERT INTO `t_qcc_query_keyword_baseinfo` (`id`, `querykeyword`, `queryurl`, `parentkeyword`, `queryaccount`, `type`, `worktype`, `xinxiweidu`, `time`, `zhuangtai`, `deep`, `updatetime`) VALUES "
				+ "('%s', '%s', NULL, NULL, 'jiangyin', 'name', 'queryinfo', 'baseinfo', '5184000000', '0', NULL, '%s');";
		
		
		Set<String> set = new  HashSet<String>();
		
		for(String line:lines){
			
//			set.add(line.trim());
			
			if(!lines173.contains(line)){
				System.out.println(line);
				set.add(line);
			}
		}
		
//		System.out.println(set.size());
//		
//		set = new HashSet<String>();
//		
//		System.out.println(set.size());
//		
//		for(String line:lines173){
//			set.add(line);
//		}
//		System.out.println(set.size());
		
		for(String line:set){
			String uuid = SecUtils.getUUID() ;
			FileUtils.writeToFile(String.format(sql, uuid,line,System.currentTimeMillis()),sqlFile.getAbsolutePath());
			Thread.sleep(100);
		}
		
//		System.out.println(set.size());
	}
	public static void createRandomSql() throws Exception{
		
		
		File sqlFile = new File("D:/sqlRandomFile.sql");
		
		sqlFile.delete() ;
		
		String sql = "INSERT INTO `t_qcc_query_keyword_baseinfo` (`id`, `querykeyword`, `queryurl`, `parentkeyword`, `queryaccount`, `type`, `worktype`, `xinxiweidu`, `time`, `zhuangtai`, `deep`, `updatetime`) VALUES "
				+ "('%s', '%s', NULL, NULL, 'geors', 'code', 'queryinfo', 'baseinfo', '5184000000', '0', NULL, '%s');";
		
		
		Set<String> set = new  HashSet<String>();
		
		for(int i=0;i<1200;i++){
			String uuid = SecUtils.getUUID() ;
			FileUtils.writeToFile(String.format(sql, uuid,
					SecUtils.getUUID().substring(0, 18).toUpperCase(),
					System.currentTimeMillis()),sqlFile.getAbsolutePath());			
		}
	}
}
