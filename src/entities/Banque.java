package entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author StephanieMC
 *
 */
@Entity
@Table(name="banque")
public class Banque {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom")
	private String nom;
	

	@OneToMany( mappedBy="banque")
	private List<Client> clients;
	
	
	public Banque() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Banque [nom=" + nom + "]";
	}
	
	
	

}
