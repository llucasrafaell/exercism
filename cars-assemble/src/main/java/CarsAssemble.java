public class CarsAssemble {

    private final static int HOURLY_PRODUCTION_RATE = 221;
    private final static int MIN_VELOCITY = 0;
    private final static int MAX_VELOCITY = 10;

    public double productionRatePerHour(int speed) {
        if (velocityValid(speed)){
            return speed * HOURLY_PRODUCTION_RATE * successRate(speed);
        } 
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerMinute = (HOURLY_PRODUCTION_RATE * successRate(speed)) / 60 ;

        if(velocityValid(speed))
            return (int)(carsPerMinute * speed);
        return 0;
    }

    public boolean velocityValid (int speed){
        if (speed >= MIN_VELOCITY && speed <= MAX_VELOCITY)
            return true;
        else 
            return false;
    }

    public double successRate (int speed){
        if(speed < 5)
            return 1.0;
        else if(speed < 9)
            return 0.9;
        else if(speed < 10)
            return 0.8;
        else
            return 0.77;
    }
}
