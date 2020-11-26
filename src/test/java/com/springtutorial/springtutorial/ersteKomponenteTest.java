package com.springtutorial.springtutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springtutorial.springtutorial.komponenten.ErsteKomponenteI;

@SpringBootTest
public class ersteKomponenteTest {
	
	@Autowired
	private ErsteKomponenteI ersteKomponente;
	
	@Test
	public void einfacherKomponentenTest() throws Exception {
		String helloWorld = ersteKomponente.helloWorld();
		assertEquals("Hello World hinter einem Interface!", helloWorld);

	}

}
