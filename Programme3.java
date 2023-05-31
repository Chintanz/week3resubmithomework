package week3resubmithomework;

import java.util.Scanner;

/**Write a java program to input student Name, roll No, and three subjects Math, Science and
 English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
public class Programme3 {
    public static void main(String[] args) {
        String result;
        int maths,science,eng;
        String x ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student name : ");
        String name = in.nextLine();
        System.out.println("Enter roll no of student:");
        int r = in.nextInt();
        System.out.println("Maths:");
        int m1 = in.nextInt();
        System.out.println("Science:");
        int m2 = in.nextInt();
        System.out.println("English: ");
        int m3 = in.nextInt();
        int t = m1 + m2 + m3;
        System.out.println("Total: "+ t);

        String g = "";
        float p = (float) (t / 500.0 * 100.0);
        if (p >= 90)
            g = " A+";
        else if (p >= 80)
            g = "   A";
        else if (p >= 70)
            g = "  B+";
        else if (p >= 60)
            g = "   B";
        else if (p >= 50)
            g = "   C";
        else if (p >= 40)
            g = "   D";
        else if (p>=35)
            g = "  E";
        else if (p<35)
            x = "Fail";
        System.out.println("Error");

        System.out.println("_____________");
        System.out.println("|                                   |");
        System.out.println("|           Mark sheet              |");
        System.out.println("|_____________|");
        System.out.println("| Name:                  "+name+"      |");
        System.out.println("| Roll no:                  "+r+"      |");
        System.out.println("|_____________|");
        System.out.println("| Maths:                   "+m1+"       |");
        System.out.println("| Science:                 "+m2+"       |");
        System.out.println("| English:                 "+m3+"       |");
        System.out.println("|____________   |");
        System.out.println("| Total:                   "+ t+"      |");
        System.out.println("| Percentage:              "+ p+"     |");
        System.out.println("| Grade:                "+g+"        |");
        System.out.println("|_____________|");
    }
    }
