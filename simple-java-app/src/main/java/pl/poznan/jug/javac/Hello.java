package pl.poznan.jug.javac;

public class Hello {

    private final String name;

    public Hello(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.printf("Hello %s!%n", name);
    }
}