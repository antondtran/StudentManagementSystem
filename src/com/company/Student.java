package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private int tuitionBalance;
    private static int costOfCourse = 800;
    private static int id = 1000;

    // Constructor

    public Student(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("");
        System.out.println("Enter grade level");
        System.out.println("Enter 1: Freshmen\nEnter 2: Sophomore\nEnter 3: Junior\nEnter 4: Senior");
        System.out.print("Input: ");

        int userCaseNum = scanner.nextInt();

        switch(userCaseNum){
            case 1:
                this.gradeYear = 1;
                System.out.println("Welcome Freshmen!");
                setStudentID();
                break;
            case 2:
                this.gradeYear = 2;
                System.out.println("Welcome Sophomore!");
                setStudentID();
                break;
            case 3:
                this.gradeYear = 3;
                System.out.println("Welcome Junior!");
                setStudentID();
                break;
            case 4:
                this.gradeYear = 4;
                System.out.println("Welcome Senior!");
                setStudentID();
                break;
            default:
                System.out.println("Error.");
        }


    }

    private void setStudentID(){
        id++;
        this.studentID = gradeYear +  "" + id;
        System.out.println("Your student ID is " + studentID);
    }
}
