import java.util.*;
public class scanner_function {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your name :");
            String name = sc.next();
            System.out.println("your name is : "+ name);
        }
    }
}
