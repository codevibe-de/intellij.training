package de.codevibe.idgen;

import java.util.Random;
import java.util.stream.Collectors;

public class RandomCharsNameGenerator implements NameGenerator {

    private Random random;

    private int length;

    public RandomCharsNameGenerator(int length) {
        this.length = length;
    }

    @Override
    public void initialize() {
        random = new Random();
    }

    @Override
    public String generate() {
        return this.random.ints(this.length, 97, 123)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }
}
