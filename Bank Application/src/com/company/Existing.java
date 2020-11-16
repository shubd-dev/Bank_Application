package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Existing extends newCustomer{
    Scanner s = new Scanner(System.in);
    Existing(){
        System.out.print("Enter your govt issued ID:");
        String id_search = s.next();
        boolean flag = false;
        Scanner s2 = null;
        try {
            s2 = new Scanner(new FileInputStream("Data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(s2.hasNextLine()){
            String line = s2.nextLine();
            System.out.println(line);
            if(line.indexOf(id_search) != -1){
                flag = true;
            }
        }
        if(flag){
            System.out.println("it contains id:"+id_search);
        }
        else {
            System.out.println("Not found");
        }
    }
}
