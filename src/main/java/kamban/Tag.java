package kamban;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tag {
	private int id;
	private String libelle;
	private Fiche fiche;
	private Tag_fiche tag_fiche; 
	
	public Tag() {
		// TODO Auto-generated constructor stub
	}

	public Tag(String libelle, Tag_fiche tag_fiche ) {
		super();
		this.libelle = libelle;
		this.tag_fiche = tag_fiche;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@ManyToOne
	public Fiche getFiche() {
		return fiche;
	}
	
	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}
	
	@ManyToOne
	public Tag_fiche getTag_fiche() {
		return tag_fiche;
	}

	public void setTag_fiche(Tag_fiche tag_fiche) {
		this.tag_fiche = tag_fiche;
	}
	
	
	

}
