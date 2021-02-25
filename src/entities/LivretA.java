package entities;

import javax.persistence.Column;

import javax.persistence.Entity;

/**
 * 
 * @author StephanieMC
 *
 */
@Entity
public class LivretA extends Compte {

	// L'id est hérité de la classe Compte 
	
	
	@Column(name = "taux")
	private double taux;

	public LivretA() {

	}

	public LivretA(double taux) {
		super();
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
