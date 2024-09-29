package com.campusdual.classroom;

public class FuelTank {


  private int actualFuel = 10;


  public int getActualFuel() {
    return this.actualFuel;
  }


  public void setActualFuel(int fuel) {
    if (fuel >= 0) {
      this.actualFuel = fuel;
    } else {
      System.out.println("No se aceptan valores negativos para actualFuel.");
    }
  }


  public void showDetails() {
    System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
  }
}
