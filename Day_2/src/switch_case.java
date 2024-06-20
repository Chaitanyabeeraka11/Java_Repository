
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter day name : ");
        String day = sc.next();
        switch(day){
            case "sunday":
                System.out.println("day1");
                break;
            case "monday":
                System.out.println("day2");
                break;
            case "tuesday":
                System.out.println("day3");
                break;
            case "wednesday":
                System.out.println("day4");
                break;
            case "thursday":
                System.out.println("day5");
                break;
            case "friday":
                System.out.println("day6");
                break;
            case "saturday":
                System.out.println("day7");
                break;
            default:
                System.out.println("invalid day");

        }
    }
}
