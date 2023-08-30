package de.codevibe;

import java.util.Random;

public class IdGenerator {

    private int length;

    private String prefix;

    private String suffix;

    public IdGenerator(int length, String prefix, String suffix) {
        this.length = length;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String generateId() {
        var nstr = String.format("%d", new Random().nextInt()); // fixme
        return prefix + nstr + suffix;
    }


}
