package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BownlingScroreApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldGetCorrectScoreAfterRoll() {
		Game g = new Game();
		g.roll(5);
		assertEquals(g.score(), 5);
	}

}
