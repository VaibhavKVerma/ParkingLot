import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private final String name;
    private final int entryPoints;
    private final int exitPoints;
    private final List<Level> levels;

    private ParkingLot(String name, int entryPoints, int exitPoints) {
        this.name = name;
        this.entryPoints = entryPoints;
        this.exitPoints = exitPoints;
        this.levels = new ArrayList<>();
    }

    public static ParkingLot getInstance(String name, int entryPoints, int exitPoints) {
        if(parkingLot == null) {
            parkingLot = new ParkingLot(name, entryPoints, exitPoints);
        }
        return parkingLot;
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public void parkVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            boolean parked = level.parkVehicle(vehicle);
            if(parked) return;
        }
    }

    public void exitVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            boolean exited = level.exitVehicle(vehicle);
            if(exited) return;
        }
    }

    public void printParkingLot() {
        for(Level level : levels) {
            level.printLevel();
        }
    }
}