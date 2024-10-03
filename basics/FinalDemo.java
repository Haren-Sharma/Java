/*
 * final:
 * variable -> constant
 * methods  -> it will stop overriding
 * class    -> it will stop inheritance
*/
final class A {
    public void show() {
        System.out.println("In class A");
    }
}

// class B extends A{ //not allowed
// }

class B {
    public final void show() {
        System.out.println("In class B");
    }
}

class C extends B {
    // public void show(){ //not allowed
    // }
}

public class FinalDemo {
    public static void main(String[] args) {
        final int a = 10;
        // a=45; not allowed
    }
}
