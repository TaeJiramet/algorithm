import java.util.Scanner;
public class bmi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight value : ");
        byte weight = scanner.nextByte();
        System.out.print("Enter your height : ");
        float height = scanner.nextFloat();
        float avgBMI = weight/(height*height);
        System.out.println("your BMI for weight = "+weight+"kg"+" and height = "+height+"meter"+"is :"+avgBMI+"bmi.");
        
    }
}
