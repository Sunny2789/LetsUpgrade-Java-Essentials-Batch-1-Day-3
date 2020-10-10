package Day_3_Assignments;

// Java Essentials
// Batch 1 Day 2 Assignment

// Assignment Description ---
// take employee name,date of birth,month of birth
// birth year, monthly salary;
// 5l - 20%;
// 4l - 15%;
// 3l- 10%;
// 2l -5%;
// display name,age,annual salary and the tax amount

import java.util.Scanner;

public class Day_3_Assignment_No2 {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            sc.nextLine();

            System.out.println("------> Please Enter Employee Information <-----");

            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Employee Date Of Birth(Enter Only Date):");
            String db = sc.nextLine();

            System.out.println("Enter Employee Month Of Birth Year(Enter Only Month):");
            int mb = sc.nextInt();

            System.out.println("Enter Employee Year Of Birth(Enter Only Year):");
            int yb = sc.nextInt();

            System.out.println("Enter Employee Annual Salary(Enter Only In One Digit): ");
            int as = sc.nextInt();

            String full_db = new String(db + "/" + mb + "/" + yb);

            String tax = new String();

            if (as > 5) {
                tax = "20%";
            }
            else if (as > 4) {
                tax = "15%";
            }
            else if (as > 3) {
                tax = "10%";
            }
            else if (as > 2) {
                tax = "5%";
            }
            else {
                tax = "No Tax";
            }


            System.out.println("\n-----> Employee Details <-----");
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Age: " + full_db);
            System.out.println("Employee Annual Salary: " + as + " lakhs");
            System.out.println("Income Tax To Be Payed: " + tax);
        }
    }
}
