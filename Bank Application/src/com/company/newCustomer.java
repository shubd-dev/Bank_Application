package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class newCustomer {
    String name = "";
    int age;
    public int identification_no;
    String date;
    Scanner s = new Scanner(System.in);
    newCustomer()
    {
        System.out.println("Welcome to the BANK OF MAFIA!!");
        System.out.println("Please follow further instruction to Create/Access your bank acc");
    }
    void get_info(){
        get_name();
        get_dob();
        if(age >= 18) {
            idCheck();
        }
        System.out.println("account generated Successfully with your provided information");
    }
    void get_name(){
        char d;
        do {
            System.out.println("Please enter your name:");
            name = s.nextLine();
            System.out.println("Are you sure to save "+name+" as name?(Y/N)");
            d = s.next().charAt(0);
        }while (d == 'N');
    }
    void get_dob(){
        System.out.print("Enter your Date of birth(dd-mm-yyyy):");
        date = s.next();
        LocalDate now = LocalDate.now();
        System.out.println("Today's date is "+now+"\n Now enter your age:");
        age = s.nextInt();
        if(age <= 18){
            System.out.println("Sorry you are under-age but kids bank is next door");
        }
    }
    void idCheck(){
        System.out.println("Please enter your govt. issued id no.:");
        identification_no = s.nextInt();
    }
}
