package org.example;

public class CarDetails {
    String color;
    int size;
    double weight;

    public static void Start() {
        System.out.println("Press the Start Key");
    }
    public static void Accelerate() {
        System.out.println("Press the Accelerator");
    }
    /*public static void Brakes() {
        System.out.println("Press the Brakes");
    }*/

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void displayCar() {
        System.out.println("Color of the car:" + color);
        System.out.println("Weight of the car:" + weight);
        System.out.println("Size of the car:" + size);
    }

    /*public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }*/
}
