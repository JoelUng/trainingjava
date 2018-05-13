package ung.joel.trainingjava.interfacejava8;

public interface InterfaceDesHeros<T> extends Comparable<T> {

    /**
     * Méthode statique de l'interface.
     * Elle possède le même comportement qu'une méthode statique d'une classe.
     * Elle peut être appelée depuis l'interface InterfaceDesHeros sans instanciation d'une classe.
     */
    public static void methodeStatique() {
        System.out.println("comportement statique");
    }

    /**
     * Méthode avec une implémentation par défaut.
     * Les classes qui implémentent cette interface n'ont pas l'obligation de fournir une implémentation de cette méthode.
     */
    public default void methodeAvecComportementParDefaut() {
        System.out.println("comportement par défaut");
    }

    /**
     * Cette méthode permet d'encapsuler le comportement "compareTo" présent dans l'interface Comparable.
     * La méthode présente apporte une sémantique plus forte vis à vis de "compareTo".
     * On peut considérer cette méthode comme une extension de "compareTo".
     *
     * @param other objet à comparer
     * @return true si l'objet à comparer est "après" l'objet comparé.
     */
    public default boolean estApres(T other) {
        return compareTo(other) > 0;
    }

}
