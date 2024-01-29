public class ElonsToyCar {

    int distance = 0;

    public static ElonsToyCar buy() {
       return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        throw new UnsupportedOperationException("Please implement the RemoteControlCar.batteryDisplay()  method");
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the RemoteControlCar.drive()  method");
    }
}

