package week3resubmithomework;

import java.util.Scanner;

/**Write a java program input sales id, seller's name, sales amount, and salary basic and
 then fined this sales Commission*/
public class Programme7 {
    String name;
    int emp_id;
    int sales_amount;
    int sal;
    double comm;

    // create own method
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = in.nextLine();
        System.out.print("Enter employee id: ");
        emp_id = in.nextInt();
        System.out.print("Enter sales amount : ");
        sales_amount = in.nextInt();
        System.out.println("Enter salary : ");
        sal = in.nextInt();
    }

    // create own method
    void compute() {
        if (sales_amount >= 50000) {
            comm = 35 / 100.0 * sal;
        } else if (sales_amount >= 30000) {
            comm = 20 / 100.0 * sal;
        } else if (sales_amount >= 20000) {
            comm = 10.0 / 100.0 * sal;
        } else if (sales_amount >= 10000) {
            comm = 5 / 100.0 * sal;
        } else {
            comm = 2 / 100.0 * sal;
        }
    }

    // create own method
    void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee Number: " + emp_id);
        System.out.println("Monthly Sales: " + sal);
        System.out.println("Commission: " + comm);
    }

    // Main method
    public static void main(String args[])
    {
        Programme7 p7= new Programme7();
        p7.input();
        p7.compute();
        p7.display();

    }
}
