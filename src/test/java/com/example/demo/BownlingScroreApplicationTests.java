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
	void verifyFirstTwoThrows() {
		Game g = new Game();
		g.roll(8);
		g.roll(1);
		assertEquals(9, g.score());
	}

}
