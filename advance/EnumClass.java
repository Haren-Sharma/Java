import java.util.Arrays;
//enum class cannot extend another class
//constructor cannot be public
enum Friends {
    Haren(24),//object of enum class Friends
    Sushant(24),
    Vivek(25),
    Naman(25);

    private int age;

    Friends(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        // Friends[] f = Friends.values();
        // System.out.println(Arrays.toString(f));
        // System.out.println(f[1].ordinal());
        
        Friends f1=Friends.Haren;
        System.out.println(f1.getClass().getName()); //Friends
        System.out.println(f1.getClass().getSuperclass().getName()); //java.lang.Enum
        System.out.println(f1.getAge());

    }
}
