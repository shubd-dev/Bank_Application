package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("WELCOME!! to the bank!\n Are you are existing customer?(Y/N)");
        char ch = s.next().charAt(0);
        if(ch == 'N')
        {
            System.out.println("Do you want to create a new account:(Y/N)");
            char d = s.next().charAt(0);
            if(d == 'Y'){
                System.out.println("Info provided is:");
                display d1 = new display();
                d1.get_info();
                d1.display();
                System.out.println("Do you want to change anything?(N/Y)");
                d = s.next().charAt(0);
                if(d == 'Y'){
                    System.out.println("to change name press 1\n to change age press 2\nto change govt id press 3");
                    int deci = s.nextInt();
                    switch (deci){
                        case 1:
                            d1.get_name();
                            d1.save_data();
                            break;
                        case 2:d1.get_dob();d1.save_data();break;
                        case 3:d1.idCheck();d1.save_data();break;
                    }
                    d1.display();
                }
            }
        }
        else {
            Existing e1 = new Existing();
        }
        System.out.println("Thank you Please visit again");
    }
}
