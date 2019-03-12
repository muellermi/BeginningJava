package de.muellerbruehl.cars;

public class Car {

  public int number;
  private int maxSpeed;
  public int speedUp;
  public int delay;
  private int currentSpeed;

  public int getCurrentSpeed() {
    return toKmPerHour(currentSpeed);
  }

  public void setMaxSpeed(int maxSpeedInKmPerHour) {
    maxSpeed = toMeterPerSecond(maxSpeedInKmPerHour);
  }

  public void accelerate(int duration) {
    int newSpeed = currentSpeed + speedUp * duration;
    if (newSpeed > maxSpeed) {
      currentSpeed = maxSpeed;
    } else {
      currentSpeed = newSpeed;
    }
  }

  public void delay(int duration) {
    int newSpeed = currentSpeed - delay * duration;
    if (newSpeed < 0) {
      currentSpeed = 0;
    } else {
      currentSpeed = newSpeed;
    }
  }

  private static int toMeterPerSecond(int speedKmPerHour) {
    return speedKmPerHour * 1000 / 3600;
  }

  private static int toKmPerHour(int speedMeterPerSecond) {
    return speedMeterPerSecond * 3600 / 1000;
  }

}
