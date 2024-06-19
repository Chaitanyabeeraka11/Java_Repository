import java.util.*;
public class control_floes {
    public static void main(String[] args) {
        int grade;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter your grade : ");
            grade = input.nextInt();
        }
        if(grade >= 90){
            System.out.println("Grade A");
        }
        else if(grade <90 && grade >=60){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }
        
    }
    
}
