/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autocarproject;

/**
 *
 * @author AKMAL RIZQY
 */
public class AutoCarRPL implements Transportasi {
    private int bahanBakar;
    private int kecepatan;
    private Setir setir;
    private Roda[] roda2;
    private Mesin mesin2;

    public AutoCarRPL(Setir setir, Roda[] roda2, Mesin mesin2) {
        this.setir = setir;
        this.roda2 = roda2;
        this.mesin2 = mesin2;
    }

    @Override
    public void setBahanBakar(int bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public int getBahanBakar() {
        return bahanBakar;
    }

    @Override
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public int getKecepatan() {
        return kecepatan;
    }

    public void start() {
        System.out.println("Mobil dimulai.");
    }

    public void drive() {
        System.out.println("Mobil berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }
}
