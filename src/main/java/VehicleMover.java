public class VehicleMover {
    private static Vehicle motorcycle;
    private static Vehicle unicycle;
    private static Vehicle redVehicle;
    private static Vehicle blueVehicle;
    public static void main(String[] args) {
        motorcycle = new Vehicle(2, 4f, 20, "Motorcycle");
        unicycle = new Vehicle(1, 3f, 20, "Unicycle");
        redVehicle = new Vehicle(4, 5f, 20, "Red Car");
        while (motorcycle.canMove()) {
            motorcycle.move();
        }
        while (unicycle.canMove()) {
            unicycle.move();
        }
        while (redVehicle.canMove()) {
            redVehicle.move();
        }
        while (blueVehicle.canMove()) {
            blueVehicle.move();
        }

    }
}
