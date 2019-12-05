package com.geor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.util.StringUtils;

public class FileUtils {
   public static  void writeToFile(Object content,String logfilepath ){
	   System.out.println(content);
	   if(StringUtils.isEmpty(logfilepath)){
		   logfilepath = "C:/logfile.txt";
	   }
	   FileWriter fw = null;
	   String filePath = logfilepath ;
	   try {
		   File writeFile = new File(filePath);
		   if(!writeFile.exists()){
			   writeFile.createNewFile();
		   }
		   fw = new FileWriter(writeFile,true);
		   fw.write(content.toString()+"\n");
		   fw.close();
	} catch (Exception e) {
		
	}finally{
		if(fw != null){
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}
  }
   public static boolean deleteAll(String parentDir){
	   boolean deleteFlag = false;
	   File parentFile = new File(parentDir) ;
	   if(!parentFile.exists()){
		   return false;
	   }
	  File [] files = parentFile.listFiles();
	  if(files == null || files.length==0){
		  return true;
	  }
	  for(File deleteFile:files){
		  deleteDir(deleteFile);
	  }
	  return deleteFlag ;
   }
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            //递归删除目录中的子目录下
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // 目录此时为空，可以删除
        return dir.delete();
    }
	   public static void main(String[] args) {
	   try {
		   copyFolder(new File("E:/downhtml/法尔胜泓昇集团有限公司"), new File("E:/downhtml/history/法尔胜泓昇集团有限公司"));
		   deleteDir(new File("E:/downhtml/法尔胜泓昇集团有限公司"));
		} catch (Exception e) {
			
		}
	   try {
		} catch (Exception e) {
			
		}
	}
    public static boolean copyFile(File sourceFile,File destFile) throws Exception{
    	boolean flag = true;
        FileInputStream  input  =  new  FileInputStream(sourceFile);  
        FileOutputStream  output  =  new  FileOutputStream(destFile);  
        byte[]  b  =  new  byte[1024  *  5];  
        int  len;  
        try {
        	while  ( (len  =  input.read(b))  !=  -1)  {  
        		output.write(b,  0,  len);  
        	} 
        	input.close();
        	output.flush();  
        	output.close();  
        } catch (Exception e) {
        	flag = false;
        }finally{
        	try {
				if(output != null){
					output.close();
				}
				if(input != null){
					input.close();
				}
			} catch (Exception e2) {
			
			}
        }
    	return flag;
    }
	/**
	 * 复制一个目录及其子目录、文件到另外一个目录
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFolder(File src, File dest) throws IOException {
		if (src.isDirectory()) {
			if (!dest.exists()) {
				dest.mkdir();
			}
			String files[] = src.list();
			for (String file : files) {
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// 递归复制
				copyFolder(srcFile, destFile);
			}
		} else {
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);
 
			byte[] buffer = new byte[1024];
 
			int length;
			
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		}
	}
    public static List<String>  readTxt(File sourceFile) throws Exception{
    	List<String> lines = new ArrayList<String>();
    	BufferedReader sourceFilebr = null;
    	try {
    		sourceFilebr = new BufferedReader(new FileReader(sourceFile));
    		String beReplaceFileline = "";
    		while(( beReplaceFileline = sourceFilebr.readLine())!=null){
    			if(StringUtils.isEmpty(beReplaceFileline)){
    				continue;
    			}
    			lines.add(beReplaceFileline.trim()) ;
    		}
    		sourceFilebr.close();
		} catch (Exception e) {
			
		}
    	return lines;
    }
}
