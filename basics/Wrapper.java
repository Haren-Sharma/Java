/*Java provides the concept of Wrapper classes to incorporate primitives into OOP paradigm*/
public class Wrapper {
    public static void main(String[] args) {
        int a=10;
        Integer a1=a; //auto-boxing
        int b=a1; //auto-unboxing
        System.out.println(a1);
        System.out.println(b);
        String c="100";
        int ic=Integer.parseInt(c);
        System.out.println(ic+100);
    }
}
