import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance("PARKING_LOT", 2, 2);
        ParkingSpot parkingSpot0 = new ParkingSpot(1, VehicleType.CAR);
        ParkingSpot parkingSpot1 = new ParkingSpot(2, VehicleType.MOTORBIKE);
        ParkingSpot parkingSpot2 = new ParkingSpot(3, VehicleType.CAR);
        ParkingSpot parkingSpot3 = new ParkingSpot(4, VehicleType.MOTORBIKE);
        ParkingSpot parkingSpot4 = new ParkingSpot(5, VehicleType.CAR);
        ParkingSpot parkingSpot5 = new ParkingSpot(6, VehicleType.TRUCK);


        Level level = new Level(1, new ArrayList<>());
        level.addParkingSpot(parkingSpot0);
        level.addParkingSpot(parkingSpot1);
        level.addParkingSpot(parkingSpot2);
        level.addParkingSpot(parkingSpot3);
        level.addParkingSpot(parkingSpot4);
        level.addParkingSpot(parkingSpot5);
        parkingLot.addLevel(level);

        Vehicle vehicle = new Vehicle(VehicleType.CAR, "KA-01-HH-1234");
        Vehicle vehicle1 = new Vehicle(VehicleType.MOTORBIKE, "KA-01-HH-9999");
        Vehicle vehicle2 = new Vehicle(VehicleType.CAR, "KA-01-BB-0001");
        Vehicle vehicle3 = new Vehicle(VehicleType.MOTORBIKE, "KA-01-HH-7777");
        Vehicle vehicle4 = new Vehicle(VehicleType.CAR, "KA-01-BB-0002");
        Vehicle vehicle5 = new Vehicle(VehicleType.TRUCK, "KA-01-BB-1234");
        parkingLot.parkVehicle(vehicle);
        parkingLot.parkVehicle(vehicle1);
        parkingLot.parkVehicle(vehicle2);
        parkingLot.parkVehicle(vehicle3);
        parkingLot.parkVehicle(vehicle4);
        parkingLot.parkVehicle(vehicle5);
        parkingLot.printParkingLot();

        parkingLot.exitVehicle(vehicle);
        parkingLot.printParkingLot();

        parkingLot.exitVehicle(vehicle2);
        parkingLot.exitVehicle(vehicle1);
        parkingLot.printParkingLot();
    }
}
