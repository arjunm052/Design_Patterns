import java.util.ArrayList;

import DrivingStrategy.NormalDrive;
import DrivingStrategy.SpecialDrive;
import Vehicle.OffRoadVehicle;
import Vehicle.PassengerVehicle;
import Vehicle.SportsVehicle;
import Vehicle.Vehicle;

public class strategy {
    public static void main(String[] args) {
        PassengerVehicle p1 = new PassengerVehicle(new NormalDrive());
        SportsVehicle s1 = new SportsVehicle(new SpecialDrive());
        OffRoadVehicle o1 = new OffRoadVehicle(new SpecialDrive());

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(p1);
        vehicles.add(s1);
        vehicles.add(o1);

        for (Vehicle veh : vehicles) {
            veh.drive();
        }

    }
}
