package oop_1_1;

public class CarTest {
    public static void main(String[] args) {
        Car opel = new Car(10);
        opel.fillCar(50);
        System.out.println(opel.carMovement(200));
        opel.fillCar(50);
        System.out.println(opel.carMovement(200));
        System.out.println(opel);
    }
    }

