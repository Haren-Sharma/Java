class A{
    public void show(){
        System.out.println("Class A");
    }
}
class B extends A{

}
class C extends B{

}
public class Inheritance {
    /*
     * Java doesnot support multiple inheritance,supports single and multilevel
     * Why?
     * Think of a scenario in which C extends both A and B
     * An obj of C calls show() and show() is present in both A and B
     * How should it be decided which show() will be executed.
     */
    
    public static void main(String[] args) {
        C obj=new C();
        obj.show(); //multilevel inheritance
    }
}
