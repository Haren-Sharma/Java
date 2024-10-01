package accessModifiers.package2;

import accessModifiers.package1.Demo1;

class A extends Demo1 {
    public A(){
        super.show();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        A obj=new A();
    }
}
