abstract class A{
    public abstract void show();
}
public class AbstractAnonymousClass {
    public static void main(String[] args) {
        A obj=new A() {
            public void show(){
                System.out.println("In anonmouis class A");
            }
        };
        obj.show();
    }
}
