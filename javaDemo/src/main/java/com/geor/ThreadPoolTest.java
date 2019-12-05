package com.geor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
	
	public static void main(String[] args) throws Exception {
//		newSingleThreadExecutor();
		
//		newFixedThreadPool();
		
//		newCachedThreadPool();
		
		List<Future<Object>> futures = newScheduledThreadPool ();
	}
	
	public static void newSingleThreadExecutor() throws Exception{
		ExecutorService ex = Executors.newSingleThreadExecutor() ;
		
		for(int i =0 ;i<10;i++){
			final int j = i;
			ex.execute(new Runnable() {
				@Override
				public void run() {
					
					if(j == 2){
						int ij = j/0;
					}
					
					System.out.println(Thread.currentThread().getName());
					
				}
			});
		}
		
		ex.shutdown();
	}
	public static void newFixedThreadPool() throws Exception{
		ExecutorService ex = Executors.newFixedThreadPool(5) ;
		
		for(int i =0 ;i<10;i++){
			final int j = i;
			ex.execute(new Runnable() {
				@Override
				public void run() {
					
					if(j == 2){
						int ij = j/0;
					}
					
					System.out.println(Thread.currentThread().getName());
					
				}
			});
		}
		
		ex.shutdown();
	}
	public static void newCachedThreadPool() throws Exception{
		ExecutorService ex = Executors.newCachedThreadPool() ; // Integer.MAX_VALUE  ;
		
		for(int i =0 ;i<10;i++){
			final int j = i;
			ex.execute(new Runnable() {
				@Override
				public void run() {
					
					if(j == 2){
						int ij = j/0;
					}
					
					System.out.println(Thread.currentThread().getName());
					
				}
			});
		}
		ex.shutdown();
	}
	public static List<Future<Object>> newScheduledThreadPool() throws Exception {
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(5) ; 
		
		final List<Future<Object>> futures = new ArrayList<Future<Object>> ();
		
		for(int i =0 ;i<10;i++){
			final int j = i;
			futures.add((Future<Object>)ex.submit(new Runnable() {
				@Override
				public void run() {
					
					if(j == 2){
						int ij = j/0;
					}
					
					System.out.println(j + ":"+Thread.currentThread().getName());
					
				}
			}));
		}
		ex.shutdown();
		
		return futures ;
	}
	public static void newScheduledThreadPool1000() throws Exception{
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(1) ; 
		
		for(int i =0 ;i<10;i++){
			final int j = i;
			ex.execute(new Runnable() {
				@Override
				public void run() {
					
					if(j == 2){
						int ij = j/0;
					}
					
					System.out.println(j + ":"+Thread.currentThread().getName());
					
				}
			});
		}
		ex.shutdown();
	}

}
