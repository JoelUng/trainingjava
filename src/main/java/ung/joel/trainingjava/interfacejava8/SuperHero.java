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
}
