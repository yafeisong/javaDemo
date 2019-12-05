package com.geor.innerclassthread ;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ResourceSynchronizeTaskExecutor {
	
	BlockingQueue<String> taskQueue;

	public ResourceSynchronizeTaskExecutor() {
		System.out.println("start [RESOURCE SYNCHRONIZE TASK Executor] ...");
		taskQueue = new ArrayBlockingQueue<String>(200);
		for (int i = 0; i < 5; i++) {
			new Thread(new ResourceSynchronizeWorker()).start();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("start sync worker err");
			}
		}
	}

//	@Override
	public void execute(String String) {
	}

//	@Override
	public void execute(List<String> Strings) {
		for (String String : Strings) {
			try {
				taskQueue.put(String);
				
			} catch (Exception e) {
				System.out.println("put queue error");
			}
		}
	}

	class ResourceSynchronizeWorker implements Runnable {

		String String;

		boolean isRunning = true;

		public ResourceSynchronizeWorker() {
		}

		public void run() {
			System.out.println("sync start...");
			while (isRunning) {
				try {
					System.out.println("xunhuanzhixing................");
					String = taskQueue.take();
				} catch (Exception e) {
					
				}
			}
		}
	}

}
