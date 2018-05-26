package org.formacio.setmana2.domini;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="t_alumnes")
public class Alumne {
	@Id
	@Column(name="alu_nom")
	private String nom;
	@Column(name="alu_edat")
	private int edat;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}

	//Equals y gethash

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Alumne)) return false;
		Alumne alumne = (Alumne) o;
		return Objects.equals(getNom(), alumne.getNom());
	}

	@Override
	public int hashCode() {

		return Objects.hash(getNom());
	}
}
