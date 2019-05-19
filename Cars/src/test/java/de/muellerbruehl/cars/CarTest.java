package de.muellerbruehl.cars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

  @Test
  public void accelerating10SecondsWithSpeedup4Gives144KmPerHour() {
    Car car = Car.createCar(180, 4, 10);
    car.accelerate(10);
    int speed = car.getCurrentSpeed();
    assertEquals(speed, 144);
  }

  @Test
  public void accelerating20SecondsWithSpeedup4GivesMaxSpeed() {
    Car car = new Car ();
    car.setNumber(-1);
    car.setMaxSpeed(180);
    car.setSpeedUp(4);
    car.setDelay(10);
    
    car.accelerate(20);
    int speed = car.getCurrentSpeed();
    assertEquals(speed, 180);
  }

}
