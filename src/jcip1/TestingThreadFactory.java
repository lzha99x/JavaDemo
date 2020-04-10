package jcip1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class TestingThreadFactory implements ThreadFactory{
	public final AtomicInteger numCreate = new AtomicInteger();
	private final ThreadFactory factory
			= Executors.defaultThreadFactory();
	
	public Thread newThread(Runnable runnable) {
		numCreate.incrementAndGet();
		return factory.newThread(runnable);
	}
}
