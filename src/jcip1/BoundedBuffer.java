package jcip1;

import java.util.concurrent.Semaphore;

public class BoundedBuffer<E> {
	private final Semaphore availableItems, availableSpaces;
	private final E[] items;
	private int putPosition = 0, takePosition = 0;
		
	public BoundedBuffer(int capacity) {
		availableItems = new Semaphore(0);
		availableSpaces = new Semaphore(capacity);
		items = (E[]) new Object[capacity];		
	}
	
	public boolean isEmpty() {
		return availableItems.availablePermits() == 0;
	}
	
	public boolean isFull() {
		return availableSpaces.availablePermits() == 0;
	}
	
	public void put(E x) throws InterruptedException {
		availableItems.acquire();
		doInsert(x);
		availableItems.release();
	}
	
	public E take() throws InterruptedException {
		availableSpaces.acquire();
		E item = doExtract();
		availableSpaces.release();
		return item;
	}
	
	private synchronized E doExtract() {
		int i = takePosition;
		E x = items[i];
		items[i] = null;
		takePosition = (++i == items.length) ? 0 : i;
		return x;
	}

	private synchronized void doInsert(E x) {
		int i = putPosition;
		items[i] = x;
		putPosition = (++i == items.length) ? 0 : i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedBuffer<Integer> bb = new BoundedBuffer(10);
		System.out.println("is empty = " + bb.isEmpty());

	}

}
