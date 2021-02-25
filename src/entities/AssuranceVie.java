package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author StephanieMC
 *
 */

@Entity
@Table(name = "Assurance_Vie")
public class AssuranceVie extends Compte {


	@Column(name = "date_fin")
	private LocalDate dateFin;

	@Column(name = "taux")
	private double taux;

	public AssuranceVie() {

	}

	public AssuranceVie( LocalDate dateFin, double taux) {
		super();
		this.dateFin = dateFin;
		this.taux = taux;
	}


	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
