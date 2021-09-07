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
	void createGameAndGet0Score() {

		Game game = new Game();
		int score = game.score();

		assertEquals(score, 0);
	}

}
