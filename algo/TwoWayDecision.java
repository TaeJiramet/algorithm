import java.util.Scanner;
public class TwoWayDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        if (number>0) {
            System.out.println("Positive ");
        } else {
            System.out.println("Not Positive ");
        }
         System.out.println("END");
    }
    
}
