package de.codevibe.counter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

    public static final String DEFAULT_NAME = "a";

    Counter counter;

    @BeforeEach
    void setupSystemUnderTest() {
        this.counter = new Counter();
    }

    @Test
    void clear() {
        // given
        this.counter.increment(DEFAULT_NAME);

        // when
        this.counter.clear(DEFAULT_NAME);

        // then
        Assertions.assertThat(this.counter.get(DEFAULT_NAME)).isEqualTo(0);
    }
}