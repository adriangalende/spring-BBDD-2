package org.formacio.setmana2.repositori;

import org.formacio.setmana2.domini.Alumne;
import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Repository
@Transactional
public class RepositoriEscola {

	@PersistenceContext
	EntityManager em;
	
	public Curs carregaCurs(String nom) {
		Curs curs = em.find(Curs.class, nom);
		if(curs != null){
			return curs;
		}
		return null;

	}
	
	
	public Matricula apunta (String alumne, String curs) throws EdatIncorrecteException {
		Alumne alumneActual = em.find(Alumne.class, alumne);
		Curs cursActual = em.find(Curs.class, curs);
		Matricula matricula = new Matricula();
		matricula.setAlumne(alumneActual);
		matricula.setCurs(cursActual);
		em.persist(matricula);
	    return matricula;
	}
	
	
}
