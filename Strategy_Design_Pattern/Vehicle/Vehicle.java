package Vehicle;

import DrivingStrategy.DrivingStrategy;

public class Vehicle implements DrivingStrategy {
    DrivingStrategy obj;

    public Vehicle(DrivingStrategy obj) {
        this.obj = obj;
    }

    public void drive() {
        this.obj.drive();
    }
}
