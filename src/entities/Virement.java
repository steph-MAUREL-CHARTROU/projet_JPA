package entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author StephanieMC
 *
 */

@Entity
@Table(name = " Virement")
public class Virement extends Operation {

	@Id
	private int id;

	@ManyToOne
	@JoinColumn(name = "Id_client")
	private Client beneficaire;

	public Virement() {

	}

	public Virement(int id, Client beneficaire) {
		super();
		this.id = id;
		this.beneficaire = beneficaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getBeneficaire() {
		return beneficaire;
	}

	public void setBeneficaire(Client beneficaire) {
		this.beneficaire = beneficaire;
	}

}
