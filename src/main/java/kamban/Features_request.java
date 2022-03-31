package kamban;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("R")
public class Features_request extends Fiche{
	
	private String fonctionnalite;

	public String getFonctionnalite() {
		return fonctionnalite;
	}

	public void setFonctionnalite(String fonctionnalite) {
		this.fonctionnalite = fonctionnalite;
	}
	
}
