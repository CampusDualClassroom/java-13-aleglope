package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
        // Use the setter instead of direct access
        ft.setActualFuel(-8);
        ft.showDetails();
    }
}
