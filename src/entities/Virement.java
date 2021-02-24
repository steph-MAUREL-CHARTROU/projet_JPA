package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Virement {
	
	@Id
	private int id;
	
	@Column( name="benefit")
	private String beneficaire;

}
