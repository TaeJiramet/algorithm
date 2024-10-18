import java.util.Scanner;
public class singleDecision {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        Byte number = scanner.nextByte();
        if (number>0){
            System.out.println("Positive");
        }
        System.out.println("END");
    }
}