/*
 * Interface is just like a class
 * All the methods are by default public abstract
 * All the variables are by default final static
 * class -> class extends
 * interface -> interface extends
 * class -> interface -> implements
*/
interface A{
    double PI=3.17;
    void show();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println(A.PI);
        A obj=new B();
        obj.show();
    }    
}
