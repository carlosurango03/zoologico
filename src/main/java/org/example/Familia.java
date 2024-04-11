package org.example;

public class Familia {

    Animal papa;
    Animal mama;
    Animal hijo;


    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }


    public void imprimirFamilia() {
        System.out.println(
                "El papá es: " + this.papa.nombre +
                        "\nLa mamá es: " + this.mama.nombre +
                        "\nEl hijo es: " + (this.hijo != null ? this.hijo.nombre : "Ninguno")
        );
    }


    public void tenerHijo(String nombre) {
        if (this.papa.pareja != null) {
            Animal hijo = new Animal(nombre, 1);
            double random = Math.random();
            if (random < 0.5) {
                hijo.genero = "F";
            } else {
                hijo.genero = "M";
            }
            this.hijo = hijo;
            System.out.println("¡Ha nacido " + hijo.nombre + "!");
        } else {
            System.out.println("Aún no puedes tener hijos");
        }
    }
}
