//every class constructor's first line is super() in java,i.e,call the super class's default constructor 
class A {
    public A() {
        System.out.println("In Class A");
    }

    public A(int n) {
        System.out.println("n:" + n);
    }

    public void show() {
        System.out.println("Class A show");
    }

}

class B extends A {
    public B(int n) {
        super(n);
        System.out.println("In Class B");
    }

    public void show(){
        //In method overriding function signature should be the same
        //whereas in overloading the parameters should differ either in number or type
        System.out.println("Class B show");
        super.show();// super keyword is also used to access overrided variables and methods of the super class
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B(20);
        obj.show();
    }
}
