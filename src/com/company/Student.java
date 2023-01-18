package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private int tuitionBalance;
    private int costOfCourse = 800;

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
                this.gradeYear = "Freshmen";
                System.out.println("You are a " + gradeYear + "!");
                break;
            case 2:
                this.gradeYear = "Sophomore";
                System.out.println("You are a" + gradeYear + "!");
                break;
            case 3:
                this.gradeYear = "Junior";
                System.out.println("You are a" + gradeYear + "!");
                break;
            case 4:
                this.gradeYear = "Senior";
                System.out.println("You are a" + gradeYear + "!");
            default:
                System.out.println("Error.");
        }


    }
}
