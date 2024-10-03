/* 
 * Abstract class can have both abstract methods and normal methods
 * Abstract methods are methods with just the declaration
 * Abstract methods must be included inside an abstract class only
 * Any class extending abstarct class needs to implement the abstract methods
 * Objects cannot be made for abstract classes
*/
abstract class A{
    abstract public void show();
    public void fun1(){
        System.out.println("Fun 1 in class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Show in class B");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        A obj=new B();
        obj.fun1();
        obj.show();
    }
}
