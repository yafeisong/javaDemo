package com.geor.innerclassthread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InnerClassThreadTest {
	
	Map<String,ResourceSynchronizeTaskExecutor> cache = new HashMap<String,ResourceSynchronizeTaskExecutor>();
	
	public static void main(String[] args) {
		new InnerClassThreadTest().running(); 
	}
	
	public void running(){
		boolean isRunning = true;
		
		while(isRunning){
			String [] StringActions = new String [(int)(Math.random()*20)];
			
			for (int index = 0 ;index <StringActions.length ;index ++){
				StringActions[index] = "index"+index;
			}
			ResourceSynchronizeTaskExecutor ResourceSynchronizeTaskExecutor = getCache ();
			List<String> theStrings = new ArrayList<String> ();
			theStrings.add(new String()) ;
			ResourceSynchronizeTaskExecutor.execute(theStrings);
			
			if (StringActions.length < 10){
				System.out.println("length:"+StringActions.length);
				try {
					Thread.sleep(10000);
				} catch (Exception e) {
					
				}
			}
		}
	}
	
	public ResourceSynchronizeTaskExecutor getCache(){
		ResourceSynchronizeTaskExecutor executor = cache.get("ResourceSynchronizeTaskExecutor.class");
		
		if (executor == null ){
			executor = new ResourceSynchronizeTaskExecutor();
			cache.put("ResourceSynchronizeTaskExecutor.class", executor) ;
		}
		return executor ;
	}
	
}
