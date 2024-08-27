import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("your salary ");
        int salary = scanner.nextInt();
        System.out.print("interest rate ");
        float rate = scanner.nextFloat();
        float Tax = salary*rate;
     System.out.println ("Your interest is " + Tax);
    }
}
