import java.util.Scanner;
public class bmr {
    public static void main(String[] args) {
        float bmr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender: Male(1), Female(2) : ");
        int gender = scanner.nextInt();
        System.out.print("Enter your weight : ");
        float weight = scanner.nextFloat();
        System.out.print("Enter your height : ");
        int height = scanner.nextInt();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        if (gender ==1){
             bmr = (66+(13.7f*weight)+(5*height)-(6.8f*age));
        }else {
             bmr = (665+(9.6f*weight)+(1.8f*height)-(4.7f*age));
        }
        System.out.println("Your BMR is  : " + bmr);
    }
}
