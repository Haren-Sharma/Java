/*
 * Inner class can be either static or non static but static classes are always inner classes
*/
class A {
    public void show() {
        System.out.println("in class A");
    }

    class B {
        public void func() {
            System.out.println("in inner class B");
        }
    }

    static class C {
        public void func2() {
            System.out.println("in inner static class C");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj2 = obj.new B();
        obj2.func();
        A.C obj3 = new A.C();
        obj3.func2();
    }
}
