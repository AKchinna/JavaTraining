package org.example;

public class AddNumbers {
    public static void main(String [] args) {
        addNumbers(4, 5);
        addNumbers(5, 5);
        addNumbers(7, 5);
        addNumbers(6, 5);
        addNumbers(8, 5);

        int result = addNumbers(6, 5);
        int output = result +5;
        System.out.println("Increment the output:" + output);
    }
    public static int addNumbers(int num1, int num2) {
        int res = num1 + num2;
        System.out.println("Addition of 2 numbers:" + res);
        return res;
    }
}
