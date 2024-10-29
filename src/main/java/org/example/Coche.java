package org.example;


public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;

    public Coche (String marcaCoche, String modeloCoche, int anioCoche, double kmCoche){
        this.marca = marcaCoche;
        this.modelo = modeloCoche;
        this.anio = anioCoche;
    }

    public void conducir (double km){
        this.kilometraje = this.kilometraje + km;

    }

    public String mostrarInformacion(){
        return marca + " " + modelo + " " + anio + " " + kilometraje;
    }
}
