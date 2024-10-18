import java.util.Scanner;
public class NoteChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter amount to pay : ");
        int price = scanner.nextInt();
        int change = 1000-price;
        System.out.println("Change is :"+change +" Bath");
        int fiveHundred = change /500 ;
        change = change%500;
        System.out.println("Five-hundred note :"+fiveHundred+" note(s)");
        int oneHundred = change / 100;
        change = change % 100;
        System.out.println("Hundred note :" + oneHundred + " note(s)");
        int fifty = change / 50;
        change = change % 50;
        System.out.println("Fifty note :" + fifty + " note(s)");
        int twenty = change / 20;
        change = change % 20;
        System.out.println("Twenty note :" + twenty + " note(s)");
        int ten = change / 10;
        change = change % 10;
        System.out.println("Ten coin :" + ten + " coin(s)");
        int five = change / 5;
        change = change % 5;
        System.out.println("Five coin :" + five + " coin(s)");
        int two = change / 2;
        change = change % 2;
        System.out.println("Two coin :" + two + " coin(s)");
        int one = change / 1;
        change = change % 1;
        System.out.println("One coin :" + one + " coin(s)");
    }
}