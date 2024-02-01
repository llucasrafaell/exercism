class NeedForSpeed {

    int speed;
    int distanceDrive = 0;
    private int batteryDrain;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain; 
    }

    public int distanceDriven() {
        return distanceDrive;
    }

    public void drive() {
        if (!batteryDrained()){
            distanceDrive += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {

       while (!car.batteryDrained() && car.distanceDrive < distance){
            car.drive();
       }
        
       return car.distanceDrive >= distance;
    }
}
