import java.util.List;

public class Level {
    private final int floorNo;
    private final List<ParkingSpot> parkingSpots;

    public Level(int floorNo, List<ParkingSpot> parkingSpots) {
        this.floorNo = floorNo;
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot : parkingSpots) {
            if(parkingSpot.getVehicle() == null && parkingSpot.getVehicleType() == vehicle.getVehicleType()) {
                parkingSpot.setVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean exitVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot : parkingSpots) {
            if(parkingSpot.getVehicle() == vehicle) {
                parkingSpot.removeVehicle();
                return true;
            }
        }
        return false;
    }

    public void printLevel() {
        for(ParkingSpot parkingSpot : parkingSpots) {
            System.out.print(parkingSpot.getSpotNo() + " " + parkingSpot.getVehicleNumber() + " ");
        }
        System.out.println();
    }
}
