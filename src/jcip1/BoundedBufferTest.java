package jcip1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BoundedBufferTest extends TestCase{
	private static final long LOCKUP_DETECT_TIMEOUT = 1000;
    private static final int CAPACITY = 10000;
    private static final int THRESHOLD = 10000;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
////		fail("Not yet implemented");
//		testIsEmptyWhenConstructed();
////		testTakeBlocksWhenEmpty();
//	}
	
	public void testIsEmptyWhenConstructed() {
		BoundedBuffer<Integer> bb = new BoundedBuffer<>(10);
		assertTrue(bb.isEmpty());
		assertFalse(bb.isFull());
	}
	
	public void testTakeBlocksWhenEmpty() {
		final BoundedBuffer<Integer> bb = new BoundedBuffer<>(10);
		Thread taker = new Thread() {
			public void run() {
				try {
					int unused = bb.take();
					fail();
				} catch (InterruptedException success) {
					// TODO: handle exception
				}
			}
		};
		
		try {
			taker.start();
			Thread.sleep(LOCKUP_DETECT_TIMEOUT);
			taker.interrupt();
			taker.join(LOCKUP_DETECT_TIMEOUT);
			assertFalse(taker.isAlive());
		} catch (Exception e) {
			// TODO: handle exception
			fail();
		}
	}

}
