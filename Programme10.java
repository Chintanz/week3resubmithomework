package week3resubmithomework;
/**Write a java program to input any two number and ask user to enter their symbol (+, -,
 /, *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else)*/
import java.util.Scanner;
public class Programme10 {
    public static void main(String[] args) {
Programme10 obj = new Programme10();
obj.m1();
    }
    public boolean m1() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        if (operator == '+') {
            result = first + second;
            System.out.println(first + " + " + second + " = " + result);
        } else if (operator == '-') {
            result = first - second;
            System.out.println(first + " - " + second + " = " + result);
        } else if (operator == '*') {
            result = first * second;
            System.out.println(first + " * " + second + " = " + result);
        } else if (operator == '/') {
            result = first / second;
            System.out.println(first + " / " + second + " = " + result);
        } else {
            System.out.println("Invalid operator!");
        }
        reader.close();

        return false;
    }
}

