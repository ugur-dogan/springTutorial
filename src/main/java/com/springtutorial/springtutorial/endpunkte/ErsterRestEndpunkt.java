package com.springtutorial.springtutorial.endpunkte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtutorial.springtutorial.komponenten.ErsteKomponenteI;

@RestController
public class ErsterRestEndpunkt {
	
	@Autowired
	protected ErsteKomponenteI ersteKomponente;
	
	@GetMapping(path="/ersterendpunkt")
	public String ersterEndpunkt() {
		return ersteKomponente.helloWorld();
	}

}
