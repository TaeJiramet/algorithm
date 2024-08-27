import java.util.Scanner;
public class area {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        byte base = scanner.nextByte();
        System.out.print("Enter the height of the triangle : ");
        byte height = scanner.nextByte();
        float triangleArea = (1/2.0f)*base*height;
        System.out.println("Area of triangle:"+triangleArea +" square units");
        System.out.println("----------------------------------------");
        System.out.print("Enter the length of the square : ");
        byte side = scanner.nextByte();
        int squareArea = side * side;
        System.out.println("Area of the squareArea ; "+ squareArea +" square units");

    }
}