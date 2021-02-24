package entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author StephanieMC
 *
 */

@Entity

public class Compte {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column ( name= "numero")
	private String numero;
	
	@Column(name="solde")
	private double solde;
	
	
	@ManyToMany
	@JoinTable(name = "compo",
	joinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id"))
	
	private List< Client> clients;
	
	@OneToMany
	@JoinTable(name = "operation_compte",
	joinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_operation", referencedColumnName = "id"))
	
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
