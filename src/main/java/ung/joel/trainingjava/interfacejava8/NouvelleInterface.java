package ung.joel.trainingjava.interfacejava8;

public interface NouvelleInterface {

    public static void methodeStatique() {
        System.out.println("Je suis statique");
    }

    default void methodeAvecComportementParDefaut() {
        System.out.println("Je suis un comportement par défaut");
    }
}
