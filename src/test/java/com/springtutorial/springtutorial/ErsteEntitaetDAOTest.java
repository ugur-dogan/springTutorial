package com.springtutorial.springtutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.springtutorial.springtutorial.entity.ErsteEntitaet;
import com.springtutorial.springtutorial.entity.ErsteEntitaetDAO;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class ErsteEntitaetDAOTest {
	
	@Autowired
	private ErsteEntitaetDAO dao;
	
	/**
	 * 1. ErsteEntitaet anlegen
	 * 2. Alle Objekte aus der Datenbank holen
	 * 3. Pruefen dass die Entitaet korrekt anlegen wurde
	 * @throws Exception
	 */
	@Test
	public void simplerDAOTest() throws Exception {
		
		//kein Element in der Datenbank
		List<ErsteEntitaet> alleEntitaeten = dao.findAll();
		assertEquals(0, alleEntitaeten.size());
		
		//Entitaet anlegen
		ErsteEntitaet e = new ErsteEntitaet();
		e.setEinDatenfeld("das ist ein Text");
		dao.create(e);
		
		//eine neue Entitaet wurde angelegt
		alleEntitaeten = dao.findAll();
		assertEquals(1, alleEntitaeten.size());
		
		String inhalt = alleEntitaeten.get(0).getEinDatenfeld();
		assertEquals("das ist ein Text", inhalt);
	}

}
