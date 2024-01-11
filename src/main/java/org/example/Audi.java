package org.example;

public class Audi {
    public static void main(String[] args) {

        CarDetails audi = new CarDetails();
        audi.setColor("red");
        audi.setSize(60);
        audi.setWeight(21.34);
        audi.displayCar();

        CarDetails.Accelerate();
        CarDetails.Start();

        displayLogo("A");
        displayLogo(100);

    }
    public static void displayLogo(String s1) {
        System.out.println("Logo i:" + s1);
    }

    public static void displayLogo(int s) {
        System.out.println("Logo is:" + s);
    }
}
