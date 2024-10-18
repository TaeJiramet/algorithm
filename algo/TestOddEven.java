import java.util.Scanner;
public class TestOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println( "The Number "+ number+" is Even. ");
        }else {
            System.out.println("The Number "+ number+ " is Odd.");
        }
    }
}
