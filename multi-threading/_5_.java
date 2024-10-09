class Counter {
    int c;

    public synchronized void increment() { //with the help of synchronized we have made this method thread safe
        //i.e only one thread can access this method at a particular time.
        c++;
    }

    public void display() {
        System.out.println(c);
    }
}

public class _5_ {
    public static void main(String[] args) throws InterruptedException {
        Counter obj = new Counter();
        Runnable r1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                obj.increment();
            }
        };
        Runnable r2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                obj.increment();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        // pauses the current thread until the specified thread has completed its
        // execution.
        // It's useful when you need to ensure that a thread has finished its work
        // before the calling thread continues
        t1.join();
        t2.join();
        obj.display();
    }
}
