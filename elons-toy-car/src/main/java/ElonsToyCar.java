public class ElonsToyCar {

    int distance = 0;
    int battery = 100;

    public static ElonsToyCar buy() {
       return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if(battery == 0)
            return "Battery empty";
    
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery > 0){
            battery-=1;
            distance += 20;
        }    
    }
}

