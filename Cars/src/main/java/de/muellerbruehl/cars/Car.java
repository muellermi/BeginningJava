package de.muellerbruehl.cars;

public class Car {

  //<editor-fold defaultstate="collapsed" desc="Number">
  private int number;
  public int getNumber() {
    return number;
  }
  
  public void setNumber(int number) {
    this.number = number;
  }
  //</editor-fold>
  
  private int maxSpeed;
  public int getSpeedUp() {
    return speedUp;
  }

  public void setSpeedUp(int speedUp) {
    this.speedUp = speedUp;
  }
  //</editor-fold>

  private int delay;
  public int getDelay() {
    return delay;
  }

  public void setDelay(int delay) {
    this.delay = delay;
  }
  //</editor-fold>

  private int speedUp;
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
