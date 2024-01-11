package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("D:/Tutorials/Selenium/Misc/Demo.txt");
            int c = fis.read();
            System.out.println((char) c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
