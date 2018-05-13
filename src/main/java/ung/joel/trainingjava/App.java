package ung.joel.trainingjava;

import ung.joel.trainingjava.interfacejava8.InterfaceDesHeros;
import ung.joel.trainingjava.interfacejava8.SuperHero;

public final class App {

    public static void main(String[] args) {
        // Interface
        interfaceExemple();
    }

    public static void interfaceExemple() {
        SuperHero superman = new SuperHero("Superman");
        System.out.println("---------------------- Interface en java 8 -----------------------");
        System.out.println("Lancement de la méthode par défaut :");
        superman.methodeAvecComportementParDefaut();
        System.out.println("Lancement de la méthode statique :");
        InterfaceDesHeros.methodeStatique();

        SuperHero batman = new SuperHero("Batman");
        System.out.println("Extension de Comparable :");
        System.out.println("Superman > Batman : " + superman.estApres(batman));
        System.out.println("------------------------------------------------------------------");
    }
}
