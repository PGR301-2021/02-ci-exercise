package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BownlingScroreApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldHandleTheMostsimpleCasePossible() {
        Game g = new Game();
        g.roll(4);
        assertEquals(g.score(), 4);
        g.roll(2);
        assertEquals(g.score(), 6);
    }

}
