package tn.esprit.microservices.tn.esprit.microservices;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Candidat implements Serializable{
	private static final long serielVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;
	private String nom, prenom,email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Candidat() {
		super();
	}
	
	public Candidat(String nom2) {
		super();
		this.nom = nom2;	}
	
	
}
