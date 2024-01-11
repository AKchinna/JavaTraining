package org.example;

public class ExceptionExamples {

    public static void main(String[] args){
        handlingArithmeticException(100);
    }

    private static void handlingArithmeticException(int num){
        try {
            int a = num / 0;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
    }

    private static void handleNullPointerException(String s){
        try {
            System.out.println(s.length());
        } catch (NullPointerException exp){
            exp.printStackTrace();
        }
    }
}
