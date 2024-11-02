public class ParkingSpot {
    private final int spotNo;
    private final VehicleType vehicleType;
    private Vehicle vehicle;

    public ParkingSpot(int spotNo, VehicleType vehicleType) {
        this.spotNo = spotNo;
        this.vehicleType = vehicleType;
    }

    public void setVehicle(Vehicle vehicle) {
        if(this.vehicleType == vehicle.getVehicleType() && this.vehicle == null) this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNumber() {
        if(vehicle == null) return null;
        return vehicle.getVehicleNumber();
    }

    public int getSpotNo() {
        return spotNo;
    }
}