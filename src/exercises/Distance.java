package exercises;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Integer miles = input.nextInt();
        System.out.println("How many gallons of gas have you used?");
        Integer gallons = input.nextInt();
        input.close();
        System.out.println("Your miles per gallon average is: " + (miles/gallons));
    }
}