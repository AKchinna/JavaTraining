package org.example;

public class ModifyString {
    public static void main(String[] args) {

        String s1 = "Learning Java";
        String s2 = "Basics";

        System.out.println("Length of the String is:" + s1.length());
        System.out.println("Upper Case String:" + s1.toUpperCase());
        System.out.println("Lower Case String:" + s1.toLowerCase());
        System.out.println("Get Char:" + s1.indexOf("n"));
        System.out.println("Get Position:" + s1.charAt(3));
    }
}
