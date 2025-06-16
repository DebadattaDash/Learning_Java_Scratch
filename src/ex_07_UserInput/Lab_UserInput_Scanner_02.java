package ex_07_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());

        System.out.println("Enter the Int");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

        System.out.println("Enter the double");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);

        System.out.println("Enter the float");
        float float_input = scanner.nextFloat();
        System.out.println(float_input);
    }
}
