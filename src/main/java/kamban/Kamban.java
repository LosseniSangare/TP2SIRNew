package kamban;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Kamban {
	private long id;
	private String libelle;
	private List<Section> section = new ArrayList<Section>();
	
	public Kamban() {
		super();
	}

	public Kamban(long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@OneToMany(mappedBy = "kamban", cascade = CascadeType.PERSIST)
	public List<Section> getSection() {
		return section;
	}

	public void setSection(List<Section> section) {
		this.section = section;
	}
	
	
	
}
