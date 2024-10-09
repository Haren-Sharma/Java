import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _10_TakingInput {
    public static void main(String[] args) throws IOException {
        // 1st way
        System.out.println("Enter a number:");
        int num = System.in.read(); // basically it returns the ascii value of the first character entered starting
                                    // from left
        // A9->65
        System.out.println(num);
        // Consume the leftover newline character
        System.in.read(); // This consumes the '\n' left after System.in.read()

        // 2nd way-this can be also used to read data from resources like file,etc
        InputStreamReader ins = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ins);
        System.out.println("Enter a number 2:");
        String num2 = bf.readLine();
        System.out.println(num2);

        // 3rd way
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 3:");
        int num3 = sc.nextInt();
        System.out.println(num3);
    }
}
