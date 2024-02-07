import java.util.Scanner;
public class Car {
    private int maxSpeed;
    private String name;
    private int YearOfMake;

    public Car(int maxSpeed, String name, int YearOfMake) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.YearOfMake = YearOfMake;
    }

    public void displayName() {
        System.out.println("Car name = " + name);
    }

    public void displayYear() {
        System.out.println("Year made = " + YearOfMake);
    }

    public void displaySpeed() {
        System.out.println("Max Speed = " + maxSpeed + "km/h");
    }
}
