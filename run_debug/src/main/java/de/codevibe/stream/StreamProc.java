package de.codevibe.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamProc {

    public int findHighestInt(int... numbers) {
        var optionalInt = IntStream.of(numbers)
                .sorted()
                .findFirst();
        return optionalInt.orElse(0);
    }

    public List<Integer> transformStrings(String... strings) {
        return Arrays.stream(strings)
                .map(String::toUpperCase)
                .filter(s -> s.length() > 3)
                .map(String::length)
                .sorted()
                .limit(2)
                .toList();
    }

    public static void main(String[] args) {
        new StreamProc().findHighestInt(5, 2, 17, 1);
        new StreamProc().transformStrings("a", "blahblah", "java", "maven", "something");
    }

}
