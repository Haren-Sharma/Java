class Test {
    static int a = 0;
    int b, c;

    static void test_func() {
        // never use instance variables inside static method
        System.out.println("Static Method a:" + a);
    }

    static {
        System.out.println("Static Block");
        // this is called only once irrespective of the number of objects
        // it is called as soon as the class is loaded
    }

    Test(int b, int c) {
        System.out.println("Constructor called");
        this.b = b;
        this.c = c;
        System.out.println("a+b+c: " + (a + b + c));
        a += 10;
    }
}

public class StaticDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Test obj = new Test(10, 20);
        Test obj2 = new Test(15, 20);
        Test.test_func(); // way to call static methods
        Class.forName("Test"); // this is used when we want to load our class without creating any object
    }
}
