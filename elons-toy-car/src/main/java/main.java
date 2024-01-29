public class main {
    public static void main(String[] args) {
        
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        for (int i = 0; i < 10; i++) {
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        for (int i = 0; i < 50; i++) {
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}