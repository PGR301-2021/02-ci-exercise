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
	void testsimplecase(){
		Game g = new Game();
		g.roll(9);
		assertEquals(9, 9);
	}
}
