package entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 * 
 * @author StephanieMC
 *
 */

@Entity
public class Operation {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column ( name ="date")
	private LocalDateTime date;
	
	@Column ( name="montant")
	private double montant;
	
	@Column ( name="motif")
	private String motif;
	
	@ManyToOne
	@JoinTable(name = "operation_compte",
	joinColumns = @JoinColumn(name = "id_operation", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id"))
	
	private Compte compte;
	
	public Operation() {
		
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	@Override
	public String toString() {
		return "Operation [date=" + date + ", montant=" + montant + ", motif=" + motif + "]";
	}
	
	
	

}
