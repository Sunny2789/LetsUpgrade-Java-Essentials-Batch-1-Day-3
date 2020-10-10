package Day_3_Assignments;

// Java Essentials
// Batch 1 Day 3 Assignment No.1

// Assignment Description ---
// take 5 subjects marks each subject 100 marks;
// calculate the percentage;
// based on the percentage print the grade and the percentage;

// Solution --

import java.util.Scanner;

public class Day_3_Assignment_No1 {
    public static void main(String[] args) {
        // Making an object of Scanner class
        Scanner sc = new Scanner(System.in);

        while(true) {
            int each_marks = 100;
            // Message
            System.out.println("\n-----> Percentage Finder <-----");
            System.out.println("Enter Marks For Subject 1 ie. Science:");
            int subject1 = sc.nextInt();

            System.out.println("Enter Marks For Subject 2 ie. Maths:");
            int subject2 = sc.nextInt();

            System.out.println("Enter Marks For Subject 3 ie. Social Science:");
            int subject3 = sc.nextInt();

            System.out.println("Enter Marks For Subject 4 ie. English:");
            int subject4 = sc.nextInt();

            System.out.println("Enter Marks For Subject 5 ie. Hindi or Sanskrit:");
            int subject5 = sc.nextInt();
            int total_marks = subject1 + subject2 + subject3 + subject4 + subject5;

            // Displaying Total Marks
            System.out.println("Your Total Marks Are:");
            System.out.println(total_marks);

            // Generating and printing percentage
            float percentage = total_marks * each_marks / 500;

            System.out.println("Your Percentage Is:");
            System.out.println(percentage);

            System.out.println("Your Grade Is:");
            // Giving Remarks
            if (percentage > 90 || percentage == 90) {
                System.out.println("A+");
                System.out.println("Excellent !!!");
            }
            else if (percentage > 80 || percentage == 80) {
                System.out.println("A");
                System.out.println("Very Good !!!");
            }
            else if (percentage > 70 || percentage == 90) {
                System.out.println("B");
                System.out.println("Good !!!");
            }
            else if (percentage > 60 || percentage == 60) {
                System.out.println("C");
                System.out.println("Nice Try !!!");
            }
            else if (percentage > 50 || percentage == 50){
                System.out.println("D");
                System.out.println("You Are Almost Passed !!!");
            }
            else {
                System.out.println("Failed !!!");
                System.out.println("Hey Dude !!! You Have Falied. Try Again");
            }

        }
    }
}
