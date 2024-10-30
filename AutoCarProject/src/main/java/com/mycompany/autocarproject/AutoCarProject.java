/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.autocarproject;

/**
 *
 * @author AKMAL RIZQY
 */
public class AutoCarProject {

   
    public static void main(String[] args) {
        Setir setir = new Setir();
        Roda[] roda2 = { new Roda(4), new Roda(4), new Roda(4), new Roda(4) };
        Mesin mesin2 = new Mesin();

        AutoCarRPL autoCar = new AutoCarRPL(setir, roda2, mesin2);
        autoCar.setBahanBakar(50);
        autoCar.setKecepatan(80);
        autoCar.start();
        autoCar.drive();

        System.out.println("\nTesting Mio:");
        Mio mio = new Mio(setir, roda2, mesin2);
        mio.start();
        mio.drive();

        System.out.println("\nTesting Fuel:");
        Fuel fuelCar = new Fuel(setir, roda2, mesin2, "Bensin");
        fuelCar.setBahanBakar(60);
        System.out.println("Fuel bahan bakar: " + fuelCar.getBahanBakar() + " liter");
    }
}