import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your midterm score :  ");
        int scoremidterm = scanner.nextInt();
        System.out.print("Enter your final score :  ");
        int scorefinal = scanner.nextInt();
        int total = scoremidterm+scorefinal;
        if(total>=50){
            System.out.println("Your total score is " +total +". The result is Pass!! " );
        }else {
            System.out.println("Your total score is " +total +". The result is Fail!! " );
        }

    }
}
