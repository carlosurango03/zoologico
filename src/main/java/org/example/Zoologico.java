package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal(
                "Cebra", 100);
        animal1.genero = "F";

        Animal animal2 = new Animal(
                "Caballo", 120);
        animal2.genero = "M";

        animal1.encontrarPareja(animal2);

        Familia familia = new Familia(animal1, animal2);

        familia.tenerHijo(
                "Cebrallo");

        familia.imprimirFamilia();
    }
}