/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autocarproject;

/**
 *
 * @author AKMAL RIZQY
 */
public class Fuel extends AutoCarRPL {
    private String jenisBahanBakar;

    public Fuel(Setir setir, Roda[] roda2, Mesin mesin2, String jenisBahanBakar) {
        super(setir, roda2, mesin2);
        this.jenisBahanBakar = jenisBahanBakar;
        System.out.println("Jenis bahan bakar: " + jenisBahanBakar);
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }
}
