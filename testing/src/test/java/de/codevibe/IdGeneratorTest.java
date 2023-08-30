package de.codevibe;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IdGeneratorTest {

    private IdGenerator generator;

    @BeforeEach
    void setUp() {
        this.generator = new IdGenerator(3, "abc", "xyz");
    }

    @Test
    void generateId() {
        // when
        String id = this.generator.generateId();

        // then
        Assertions.assertThat(id).hasSize(9);
        // todo add checks for prefix & suffix
    }

}