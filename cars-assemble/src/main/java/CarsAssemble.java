public class CarsAssemble {

    int defaultVelocity = 221;

    public double productionRatePerHour(int speed) {
        if (velocityValid(speed)){
            return speed * defaultVelocity * successRate(speed);
        } 
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerMinute = (defaultVelocity * successRate(speed)) / 60 ;

        if(velocityValid(speed))
            return (int)(carsPerMinute * speed);
        return 0;
    }

    public boolean velocityValid (int speed){
        if (speed >=0 && speed <= 10)
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
