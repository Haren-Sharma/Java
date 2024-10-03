class A {
    public void show1() {
        System.out.println("class A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("class B show");
    }
}

public class Casting {
    public static void main(String[] args) {
        A obj = new B(); // upcasting
        obj.show1();
        B obj2 = (B) obj; //downcasting
        obj2.show2();
    }
}
