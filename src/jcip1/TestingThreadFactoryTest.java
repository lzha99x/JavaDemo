package jcip1;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestingThreadFactoryTest extends TestCase{
	private final TestingThreadFactory threadFactory = new TestingThreadFactory();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPollExpansion() throws InterruptedException{
		int MAX_SIZE = 10;
		ExecutorService exec = Executors.newFixedThreadPool(MAX_SIZE);
		
		for (int i = 0; i < 10*MAX_SIZE; i++) {
			exec.execute(() -> {
				try {
					Thread.sleep(Long.MAX_VALUE);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			});
//			threadFactory.newThread(() -> {
//				// TODO Auto-generated method stub
//				try {
//					Thread.sleep(Long.MAX_VALUE);
//				} catch (InterruptedException e) {
//					Thread.currentThread().interrupt();
//				}
//			});
		}
			for (int j = 0; j < 20 && threadFactory.numCreate.get() < MAX_SIZE; j++)
				Thread.sleep(100);
			
			assertEquals(threadFactory.numCreate.get(), MAX_SIZE);
			exec.shutdownNow();
		}
	}


