import java.util.ArrayList;
import java.util.List;

public class Allocator {
    private List<Account> locks = new ArrayList<>();

    private Allocator(){
    }

    public static Allocator getInstance() {
        return AllocatorSingle.install;
    }

    private static class AllocatorSingle{
        public static final Allocator install = new Allocator();
    }

    public synchronized void apply(Account src, Account tag) {
        //System.out.println(Thread.currentThread());
        while (locks.contains(src) || locks.contains(tag)) {
            try {
                //System.out.println("wait " + Thread.currentThread());
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }
        locks.add(src);
        locks.add(tag);
    }

    public synchronized void release(Account src, Account tag) {
        locks.remove(src);
        locks.remove(tag);
        this.notifyAll();
    }
}
