/*
 * Polymorphism means many forms
 * It is of two types
 * Compile Time(Early Binding):At compile time we know which method will be executed.For e.g method overloading
 * Runtime(Late Binding):At runtime it is decided which method will get executed.For e.g method overriding
*/

//below is the example for dynamic method dispatch

class A {
    public void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Class B");
    }
}

class C extends B {
    public void show() {
        System.out.println("Class C");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}