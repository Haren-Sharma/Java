import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11_TryWithRes {
    public static void main(String[] args) throws IOException {
        //we basically use finally block to close the resources but we can achieve this 
        //with the help of try with resources feature of java
        try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){
            String num=bf.readLine();
            System.out.println("Entered string is "+num);
        } 
    }
}
