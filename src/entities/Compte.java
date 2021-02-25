package entities;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author StephanieMC
 *
 */

@Entity
@Table( name="Compte")
@Inheritance( strategy = InheritanceType.JOINED)

public class Compte {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column ( name= "numero")
	private String numero;
	
	@Column(name="solde")
	private double solde;
	
	
	@ManyToMany
	@JoinTable(name = "compte_client",
	joinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id"))
	
	private List< Client> clients;
	
	@OneToMany( mappedBy="compte")
	private List<Operation> operations;

	
	public Compte() {
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", getNumero()=" + getNumero() + ", getSolde()="
				+ getSolde() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
