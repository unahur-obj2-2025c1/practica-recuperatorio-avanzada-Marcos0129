package ar.com.unahur.obj2.practica;

import java.util.HashMap;
import java.util.Map;

public class Auto {

    private final String patente;
    private Integer kilometraje;
    private final String marca;
    private final String modelo;
    private double desgasteSuspensionDelantera;
    private double desgasteSuspensionTrasera;
    private Map<String,Double> desgasteCubiertas = new HashMap<>(); //ejemplo: "Delantera izq -> 5.0"
    
    public Auto(String patente, Integer kilometraje, String marca, String modelo, double desgasteSuspensionDelantera,
            double desgasteSuspensionTrasera, Map<String, Double> desgasteCubiertas) {
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.marca = marca;
        this.modelo = modelo;
        this.desgasteSuspensionDelantera = desgasteSuspensionDelantera;
        this.desgasteSuspensionTrasera = desgasteSuspensionTrasera;
        this.desgasteCubiertas = desgasteCubiertas;
    }

    public String getPatente() {
        return patente;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDesgasteSuspensionDelantera() {
        return desgasteSuspensionDelantera;
    }

    public double getDesgasteSuspensionTrasera() {
        return desgasteSuspensionTrasera;
    }

    public void setDesgasteSuspensionDelantera(double desgasteSuspensionDelantera) {
        this.desgasteSuspensionDelantera = desgasteSuspensionDelantera;
    }

    public void setDesgasteSuspensionTrasera(double desgasteSuspensionTrasera) {
        this.desgasteSuspensionTrasera = desgasteSuspensionTrasera;
    }

    public Map<String, Double> getDesgasteCubiertas() {
        return desgasteCubiertas;
    }
}
