
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter day name : ");
            int daynum = 0;
            String day = sc.next();
            switch(day){
                case "sunday" ->  daynum = 1;
                case "monday" -> daynum = 2;
                case "tuesday" -> daynum = 3;
                case "wednesday" -> System.out.println("day4");
                case "thursday" -> System.out.println("day5");
                case "friday" -> System.out.println("day6");
                case "saturday" -> System.out.println("day7");
                default -> System.out.println("invalid day");

            }
            System.out.println("day number : "+ daynum);
        }
    }
}
