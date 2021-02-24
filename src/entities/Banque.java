package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
