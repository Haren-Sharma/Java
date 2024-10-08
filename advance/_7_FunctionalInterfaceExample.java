/*
 * Interfaces are of 3 types:
 * 1)Normal
 * 2)Functional-with only one method
 * 3)Marker-with no methods-used for giving permissions for like serialization etc.
*/

@FunctionalInterface
interface A{
    void show();
}
public class _7_FunctionalInterfaceExample {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("In show");    
            }
        };
        obj.show();
    }    
}
