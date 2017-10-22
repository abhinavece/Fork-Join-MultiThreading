package com.heapdev.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class App {
	
	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(200);
		System.out.println("pool.invoke(simpleRecursiveAction)");
		pool.invoke(simpleRecursiveAction);
		
	}

}
