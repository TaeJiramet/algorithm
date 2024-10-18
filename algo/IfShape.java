import java.util.Scanner;
public class IfShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Number : ");
        byte number = scanner.nextByte();
        if(number==1){
            System.out.print("Enter the base of  the triangle : ");
            int base = scanner.nextInt();
            System.out.print("Enter the height of  the triangle :");
            int height = scanner.nextInt();
            float triangleArea = (1/2.0f)*base*height;
            System.out.println("Area of  the triangle :"+ triangleArea +" square units");
        }else {
            System.out.print("Enter your weight in kilogram :");
            float weight = scanner.nextFloat();
            System.out.print("Enter your height in meters :");
            float height = scanner.nextFloat();
            float bmi = weight/(height*height);
            System.out.println("Your BMI for weight = "+weight+"kg and height = "+height+"meters is :"+bmi+"bmi. ");
            System.out.println("Bye Bye");
        }
    }
}
