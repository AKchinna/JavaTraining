package org.example;

public class Hyundai  extends CarDetails{

    public static void main(String[] args) {
        Start();
        Accelerate();
        Brakes();

    }
    public static void Brakes() {
        System.out.println("Press the Brakes");
    }

    public static void Start() {
        String Key = "ON";
        System.out.println("Turn the key" + Key);
    }
}
