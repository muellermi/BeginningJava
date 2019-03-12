package de.muellerbruehl.cars;

public class StartCars {

  public static void main(String[] args) {
    Car car1 = createCar(1, 180, 4, 10);
    Car car2 = createCar(2, 144, 3, 9);
    operate(car1);
    operate(car2);
  }

  private static Car createCar(
          int number, 
          int maxSpeedInKmPerHour, 
          int speedUp, 
          int delay) {
    Car car = new Car();
    car.number = number;
    car.setMaxSpeed(maxSpeedInKmPerHour);
    car.speedUp = speedUp;
    car.delay = delay;
    return car;
  }

  private static void operate(Car car) {
    for (int i = 0; i < 10; i++) {
      car.accelerate(2);
      System.out.println("Current speed (" + car.number + "): " + car.getCurrentSpeed());
    }
    for (int i = 0; i < 5; i++) {
      car.delay(2);
      System.out.println("Current speed (" + car.number + "): " + car.getCurrentSpeed());
    }
  }

}
