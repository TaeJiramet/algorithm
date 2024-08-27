import java.util.Scanner;
public class aquareMeters {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);
        double PI = 3.14159;
        System.out.print("Enter Rasmi ");
        byte radius = scanner.nextByte();
        double aquareMeters = PI*radius*radius;
        System.out.println(aquareMeters);
    }
}