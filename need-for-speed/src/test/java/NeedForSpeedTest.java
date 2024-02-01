import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class NeedForSpeedTest {

    @Test
    @Tag("task:3")
    @DisplayName("The distanceDriven method returns 0 on a new car")
    public void new_remote_control_car_has_not_driven_any_distance() {
        int speed = 10;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        assertThat(car.distanceDriven()).isEqualTo(0);
    }

    @Test
    @Tag("task:3")
    @DisplayName("The distanceDriven method returns 5 after driving once")
    public void drive_increases_distance_driven_with_speed() {
        int speed = 5;
        int batteryDrain = 1;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        car.drive();

        assertThat(car.distanceDriven()).isEqualTo(5);
    }

    @Test
    @Tag("task:3")
    @DisplayName("The distanceDriven method returns the correct distance after driving multiple times")
    public void drive_does_not_increase_distance_driven_when_battery_drained() {
        int speed = 9;
        int batteryDrain = 50;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // Drain the battery
        car.drive();
        car.drive();

        // One extra drive attempt (should not succeed)
        car.drive();

        assertThat(car.distanceDriven()).isEqualTo(18);
    }

    @Test
    @Tag("task:4")
    @DisplayName("The batteryDrained method returns false when car never drove")
    public void new_remote_control_car_battery_is_not_drained() {
        int speed = 15;
        int batteryDrain = 3;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        assertThat(car.batteryDrained()).isFalse();
    }

    @Test
    @Tag("task:4")
    @DisplayName("The batteryDrained method returns false when car battery did not completely drain after driving")
    public void drive_to_almost_drain_battery() {
        int speed = 2;
        int batteryDrain = 1;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // Almost drain the battery
        for (int i = 0; i < 99; i++) {
            car.drive();
        }

        assertThat(car.batteryDrained()).isFalse();
    }

    @Test
    @Tag("task:4")
    @DisplayName("The batteryDrained method returns true when battery completely drained after driving")
    public void drive_until_battery_is_drained() {
        int speed = 2;
        int batteryDrain = 1;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // Drain the battery
        for (int i = 0; i < 100; i++) {
            car.drive();
        }

        assertThat(car.batteryDrained()).isTrue();
    }

    @Test
    @Tag("task:5")
    @DisplayName("The distanceDriven method returns 0 on a new nitro car")
    public void nitro_car_has_not_driven_any_distance() {
        NeedForSpeed car = NeedForSpeed.nitro();
        assertThat(car.distanceDriven()).isEqualTo(0);
    }

    @Test
    @Tag("task:5")
    @DisplayName("The batteryDrained method returns false when nitro car never drove")
    public void nitro_car_has_battery_not_drained() {
        NeedForSpeed car = NeedForSpeed.nitro();
        assertThat(car.batteryDrained()).isFalse();
    }

    @Test
    @Tag("task:5")
    @DisplayName("The distanceDriven method returns the correct distance after driving a nitro car")
    public void nitro_car_has_correct_speed() {
        NeedForSpeed car = NeedForSpeed.nitro();
        car.drive();
        assertThat(car.distanceDriven()).isEqualTo(50);
    }

    @Test
    @Tag("task:5")
    @DisplayName("The batteryDrained method returns false when nitro battery did not completely drain after driving")
    public void nitro_has_correct_battery_drain() {
        NeedForSpeed car = NeedForSpeed.nitro();

        // The battery is almost drained
        for (int i = 0; i < 24; i++) {
            car.drive();
        }

        assertThat(car.batteryDrained()).isFalse();
    }

    @Test
    @Tag("task:5")
    @DisplayName("The batteryDrained method returns true when nitro battery completely drained after driving")
    public void nitro_battery_completely_drains() {
        NeedForSpeed car = NeedForSpeed.nitro();

        // The battery is drained
        for (int i = 0; i < 25; i++) {
            car.drive();
        }

        assertThat(car.batteryDrained()).isTrue();
    }

    @Test
    @Tag("task:6")
    @DisplayName("The tryFinishCar method returns true when car can finish a race")
    public void car_can_finish_with_car_that_can_easily_finish() {
        int speed = 10;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        int distance = 100;
        RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isTrue();
    }

    @Test
    @Tag("task:6")
    @DisplayName("The tryFinishCar method returns true when car can just finish a race")
    public void car_can_finish_with_car_that_can_just_finish() {
        int speed = 2;
        int batteryDrain = 10;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        int distance = 20;
        RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isTrue();
    }

    @Test
    @Tag("task:6")
    @DisplayName("The tryFinishCar method returns false when car just cannot finish a race")
    public void car_can_finish_with_car_that_just_cannot_finish() {
        int speed = 3;
        int batteryDrain = 20;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        int distance = 16;
        RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isFalse();
    }

    @Test
    @Tag("task:6")
    @DisplayName("The tryFinishCar method returns false when car cannot finish a race")
    public void car_can_finish_with_car_that_cannot_finish() {
        int speed = 1;
        int batteryDrain = 20;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        int distance = 678;
        RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isFalse();
    }
}

