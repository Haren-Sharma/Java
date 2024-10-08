//throw keyword
//custom exception
//Unchecked or runtime excpetions are handled on a choice 
//checked exceptions needs to be handled compulsory

//throw: Java throw keyword is used throw an exception explicitly in the code,
//inside the function or the block of code.

//throws:Java throws keyword is used in the method signature to declare an exception 
//which might be thrown by the function while the execution of the code.

class NameNotFoundException extends Exception {
    public NameNotFoundException(String str) {
        super(str);
    }
}

public class _9_Exceptions {
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    static String display(String str) throws NameNotFoundException {
        if (str == "") {
            throw new NameNotFoundException("Name Not Found.Hence setting the default name");
        } else {
            return "----" + str + "----";
        }
    }

    public static void main(String[] args) {
        String me = null;
        int res = 0;
        try {
            me = display("");
            res = divide(10, 0);
        } catch (ArithmeticException e) {
            res = 1;
            System.out.println(e.getMessage());
        } catch (NameNotFoundException e) {
            me = "----Haren----";
            System.out.println(e.getMessage());
        }
        System.out.println(res);
        System.out.println(me);
    }
}
