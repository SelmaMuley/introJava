package org.example;

public class Principal
{
    public static void main(String[] args) {
        Coche coche1 = new Coche("marca1", "modelo1", 2000, 0);
        Coche coche2 = new Coche("marca2", "modelo2", 2000, 0);
        Coche coche3 = new Coche("marca3", "modelo3", 2000, 0);

        Coche[] coches = {coche1, coche2, coche3};

        for (Coche coche: coches){
            System.out.println(coche.mostrarInformacion());
        }

        for (Coche coche : coches){
            coche.conducir(100);
            System.out.println(coche.mostrarInformacion());
        }

    }
}
