/*
 * Before java 8
 * we have to work extensively with anonomous inner claases for functional interfaces
 * but with lamba expressions code rediability increased and less class files are generated
 * Lambda expressions only work with functional interfaces
*/
@FunctionalInterface
interface B {
    void display();
}

interface C {
    int add(int a, int b);
}

public class _8_LambdaExpression {
    public static void main(String[] args) {
        B obj = () -> {
            System.out.println("In Display");
        };
        obj.display();
        C obj2 = (a, b) -> {
            return a + b;
        };
        int r = obj2.add(10, 20);

        System.out.println("Result is " + r);
    }
}
