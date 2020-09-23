package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int finish = Integer.parseInt(scanner.nextLine());*/

        Student Vasya = new Student();
        Vasya.Input("123456789-12345", "1", "2", "3", "4");

        System.out.println(Vasya.getSurname() + " " + Vasya.getName() + " " + Vasya.getBirthDate() + " " + Vasya.getTelephone() + " " + Vasya.getHomeAddress());
    }
}

class Student {
    private String Surname;
    private String Name;
    private String BirthDate;
    private String Telephone;
    private String HomeAddress;

    public void Input(String Surname, String Name, String BirthDate, String Telephone, String HomeAddress) {
        this.Surname = Surname;
        this.Name = Name;
        this.BirthDate = BirthDate;
        this.Telephone = Telephone;
        this.HomeAddress = HomeAddress;
    }

    public String getSurname() {
        return this.Surname;
    }
    public String getName() {
        return this.Name;
    }
    public String getBirthDate() {
        return this.BirthDate;
    }
    public String getTelephone() {
        return this.Telephone;
    }public String getHomeAddress() {
        return this.HomeAddress;
    }

}