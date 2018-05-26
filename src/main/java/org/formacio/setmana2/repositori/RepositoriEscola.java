package org.formacio.setmana2.repositori;

import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Component
@Transactional
public class RepositoriEscola {

	
	public Curs carregaCurs(String nom) {
		return null;
	}
	
	
	public Matricula apunta (String alumne, String curs) throws EdatIncorrecteException {
	    return null;	
	}
	
	
}
