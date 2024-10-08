class A {
    public void show() {
        System.out.println("in class A");
    }
}

public class _3_AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            // this is an anonymous inner class
            // here we can give different implementations for those methods only that are
            // provided in the A class
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
