package tn.esprit.microservices;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Entity;
import org.springframework.context.annotation.Bean;

@Entity
public class Job implements Serializable{
	private static final long serielVersionUID = 6;
	@Id
	@GeneratedValue
	private int id;
	private String service;
	private Boolean etat;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}


	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(String service) {
		super();
		this.service = service;
	}
}
