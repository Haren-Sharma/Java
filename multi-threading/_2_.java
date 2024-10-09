class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class _2_ {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        obj.setPriority(Thread.MIN_PRIORITY);//still after setting the priority we are not sure,it all depends on the scheduler
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj2.start();
    }
}
