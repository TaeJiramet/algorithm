import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your 1st number");
        byte Number1 = scanner.nextByte();
        System.out.print("Enter your 2nd number");
        byte Number2 = scanner.nextByte();
        System.out.print("Enter your 3rd number");
        byte Number3 = scanner.nextByte();
        System.out.print("Enter your 4th number");
        byte Number4 = scanner.nextByte();
        System.out.print("Enter your 5th number");
        byte Number5 = scanner.nextByte();
        double Average = (Number1+Number2+Number3+Number4+Number5)/5.0;
        System.out.println("The average is "+ Average);
        scanner.close();
}
}