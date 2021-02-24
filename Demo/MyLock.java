import java.util.concurrent.CountDownLatch;

public class MyLock {
    private static final Integer TEST_THREAD_COUNT = 999;
    public static void main(String[] args) throws InterruptedException {
        Account src = new Account(1000);
        Account target = new Account(1000);
        Thread[] threads = new Thread[TEST_THREAD_COUNT];

        CountDownLatch countDownLatch = new CountDownLatch(TEST_THREAD_COUNT);

        for (int i = 0; i < TEST_THREAD_COUNT; i++) {
            threads[i] = new Thread(new Runnable(){
                public void run() {
                    src.transactionToTarget(1, target);
                    //System.out.println(Thread.currentThread());
                    countDownLatch.countDown();
                }
            });
            threads[i].start();
        }

        // for (int i = 0; i < TEST_THREAD_COUNT; i++) {
        //     threads[i].join();
        //     //System.out.println("end");
        // }

        countDownLatch.await();
        System.out.println("src = " + src.getBanalce());
        System.out.println("target = " + target.getBanalce());
    }
}

