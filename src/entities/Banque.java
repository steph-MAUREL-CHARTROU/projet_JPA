package entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
/**
 * 
 * @author StephanieMC
 *
 */
@Entity
public class Banque {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	

	@OneToMany
	@JoinTable(name = "banque_client",
	joinColumns = @JoinColumn(name = "id_banque", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id"))
	
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
