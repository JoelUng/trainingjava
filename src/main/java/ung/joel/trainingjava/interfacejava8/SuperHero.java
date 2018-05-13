package ung.joel.trainingjava.interfacejava8;

public class SuperHero implements InterfaceDesHeros<SuperHero> {

    private final String name;

    public SuperHero(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SuperHero other) {
        return name.compareTo(other.name);
    }

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
