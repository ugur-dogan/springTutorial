package com.springtutorial.springtutorial.komponenten;

import org.springframework.stereotype.Component;

@Component
public class ErsteKomponente implements ErsteKomponenteI{
	
	@Override
	public String helloWorld() {
		return "Hello World hinter einem Interface!";
	}

}
