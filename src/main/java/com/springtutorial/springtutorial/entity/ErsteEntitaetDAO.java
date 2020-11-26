package com.springtutorial.springtutorial.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ErsteEntitaetDAO {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public ErsteEntitaet create(ErsteEntitaet e) {
		this.entityManager.persist(e);
		return e;
	}
	
	public List<ErsteEntitaet> findAll(){
		return this.entityManager.createQuery("select e from ErsteEntitaet e", ErsteEntitaet.class).getResultList();
		
	}

}
