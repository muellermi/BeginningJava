package de.muellerbruehl.cars;

public class StartCars {

  public static void main(String[] args) {
    Car car1 = Car.createCar(180, 4, 10);
    Car car2 = Car.createCar(144, 3, 9);
    operate(car1);
    operate(car2);
  }


  private static void operate(Car car) {
    for (int i = 0; i < 10; i++) {
      car.accelerate(2);
      System.out.println("Current speed (" + car.getNumber() + "): " + car.getCurrentSpeed());
    }
    for (int i = 0; i < 5; i++) {
      car.delay(2);
      System.out.println("Current speed (" + car.getNumber() + "): " + car.getCurrentSpeed());
    }
  }

}
