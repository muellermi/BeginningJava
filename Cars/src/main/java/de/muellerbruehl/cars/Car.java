package de.muellerbruehl.cars;

public class Car {

  private static int serialNumber;
  
  public static Car createCar(int maxSpeedInKmPerHour, int speedUp, int delay) {
    Car car = new Car();
    car.setNumber(++serialNumber);
    car.setMaxSpeed(maxSpeedInKmPerHour);
    car.setSpeedUp(speedUp);
    car.setDelay(delay);
    return car;
  }

  //<editor-fold defaultstate="collapsed" desc="Number">
  private int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="SpeedUpr">
  private int speedUp;

  public int getSpeedUp() {
    return speedUp;
  }

  public void setSpeedUp(int speedUp) {
    this.speedUp = speedUp;
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Delay">
  private int delay;

  public int getDelay() {
    return delay;
  }

  public void setDelay(int delay) {
    this.delay = delay;
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="MaxSpeed">
  private int maxSpeed;

  public void setMaxSpeed(int maxSpeedInKmPerHour) {
    maxSpeed = toMeterPerSecond(maxSpeedInKmPerHour);
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="CurrentSpeed">
  private int currentSpeed;

  public int getCurrentSpeed() {
    return toKmPerHour(currentSpeed);
  }
  //</editor-fold>

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

  //<editor-fold defaultstate="collapsed" desc="conversion">
  private static int toMeterPerSecond(int speedKmPerHour) {
    return speedKmPerHour * 1000 / 3600;
  }
  
  private static int toKmPerHour(int speedMeterPerSecond) {
    return speedMeterPerSecond * 3600 / 1000;
  }
  //</editor-fold>
}
