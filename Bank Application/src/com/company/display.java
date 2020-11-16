package com.company;

import java.io.*;

public class display extends newCustomer {
    void save_data() {
        try {
            File f1 = new File("Data.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("\n\nid:"+identification_no+"\n"+"name:"+name+"\n"+"age:"+ age+"\n"+"DOB:"+date+"\n\n");
            bw.close();
            System.out.println("saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void display(){
        save_data();
        FileReader f1;
        int ch;
        try {
            f1 = new FileReader("Data.txt");
            while((ch=f1.read()) != -1)
            {System.out.print((char)ch);}
            f1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
