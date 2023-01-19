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
                student_enrollment();
                break;
            case 2:
                this.gradeYear = 2;
                System.out.println("Welcome Sophomore!");
                setStudentID();
                student_enrollment();
                break;
            case 3:
                this.gradeYear = 3;
                System.out.println("Welcome Junior!");
                setStudentID();
                student_enrollment();
                break;
            case 4:
                this.gradeYear = 4;
                System.out.println("Welcome Senior!");
                setStudentID();
                student_enrollment();
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

    private void student_enrollment(){
        Scanner scanner = new Scanner(System.in);
        String yesOrNo;

        while (true){
            System.out.println("Would you like to enroll in a class? Type Y for yes and N for no: ");
            yesOrNo = scanner.next();

            if (yesOrNo.equals("Y")){
                classSelection();
                break;


            } else if (yesOrNo.equals("N")){
                System.out.println("Okay have a nice day!");
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
    }

    private void classSelection(){
        Scanner scanner = new Scanner(System.in);
        int classSelect;
        String yOrN;
        System.out.println("What classes would you like to apply to?");
        System.out.println("1: History\n2: Math\n3: Science\n4: Exit");
        System.out.print("Input: ");
        classSelect = scanner.nextInt();

        switch (classSelect){
            case 1:


                while(true) {
                    System.out.println("You have successfully enrolled into History!");
                    System.out.print("Would you like to apple for another class? Y or N: ");
                    yOrN = scanner.next();
                    if (yOrN.equals("Y")){
                        classSelection();
                        break;

                    } else if (yOrN.equals("N")){
                        System.out.println("Okay have a nice day!");
                        break;

                    } else{
                        System.out.println("Please try again");


                    }
                }
                break;

            case 2:
                while(true) {
                    System.out.println("You have successfully enrolled into Math!");
                    System.out.print("Would you like to apple for another class? Y or N: ");
                    yOrN = scanner.next();
                    if (yOrN.equals("Y")){
                        classSelection();
                        break;

                    } else if (yOrN.equals("N")){
                        System.out.println("Okay have a nice day!");
                        break;

                    } else{
                        System.out.println("Please try again");


                    }
                }
                break;
            case 3:
                while(true) {
                    System.out.println("You have successfully enrolled into Science!");
                    System.out.print("Would you like to apple for another class? Y or N: ");
                    yOrN = scanner.next();
                    if (yOrN.equals("Y")){
                        classSelection();
                        break;

                    } else if (yOrN.equals("N")){
                        System.out.println("Okay have a nice day!");
                        break;

                    } else{
                        System.out.println("Please try again");


                    }
                }
                break;
            case 4:
                System.out.println("Okay have a nice day!");
                break;
            default:
                System.out.println("Error. Please try again");


        }
    }
}
