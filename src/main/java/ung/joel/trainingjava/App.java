package ung.joel.trainingjava;

import ung.joel.trainingjava.interfacejava8.NouvelleInterface;

/**
 * Hello world!
 */
public final class App implements NouvelleInterface {
    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app = new App();
        app.methodeAvecComportementParDefaut();
    }
}
