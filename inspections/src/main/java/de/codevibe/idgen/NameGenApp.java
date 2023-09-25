package de.codevibe.idgen;

public class NameGenApp {

    public static void main(String[] args) {
        NameGenerator nameGenerator = new RandomCharsNameGenerator(8);
        var name = nameGenerator.generate();
        System.out.println(name);
    }
}
