package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student Surname: ");
        String Surname = scanner.nextLine();
        System.out.print("Student Name: ");
        String Name = scanner.nextLine();
        System.out.print("Student BirthDate (example: 08.03.2000): ");
        String BirthDate = scanner.nextLine();
        System.out.print("Student Telephone (example: +38(099)555-5555): ");
        String Telephone = scanner.nextLine();
        System.out.print("Student HomeAddress: ");
        String HomeAddress = scanner.nextLine();

        Student NewStudent = new Student();
        boolean AllTrue = true;
        do {
            int[] ErrorInput = NewStudent.Input(Surname, Name, BirthDate, Telephone, HomeAddress);
            System.out.println(ErrorInput[0] + " " + ErrorInput[1]);
            AllTrue = true;
            if(ErrorInput[0] == 1) {
                AllTrue = false;
                System.out.println("Wrong date syntax. Please try again and follow the example.");
                System.out.print("Student BirthDate (example: 08.03.2000): ");
                BirthDate = scanner.nextLine();
            }
            if(ErrorInput[1] == 1) {
                AllTrue = false;
                System.out.println("Wrong phone number. Please try again and follow the example.");
                System.out.print("Student Telephone (example: +38(099)555-5555): ");
                Telephone = scanner.nextLine();
            }
        } while(!AllTrue);

        System.out.println(NewStudent.getSurname() + " " + NewStudent.getName() + " " + NewStudent.getBirthDate() + " " + NewStudent.getTelephone() + " " + NewStudent.getHomeAddress());
    }
}

