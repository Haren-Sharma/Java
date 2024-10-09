public class _4_ {
    static void show(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable obj = () -> {
            show("Hi");
        };
        Runnable obj2 = () -> {
            show("Hello");
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
