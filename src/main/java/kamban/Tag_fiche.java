package kamban;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tag_fiche {
	private int id;
	private List <Fiche>fiche = new ArrayList<Fiche>();
	private List <Tag>tag = new ArrayList<Tag>();
	
	
	public Tag_fiche() {
		super();
	}

	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	 @OneToMany(mappedBy = "tag_fiche", cascade = CascadeType.PERSIST)
	public List<Fiche> getFiche() {
		return fiche;
	}


	public void setFiche(List<Fiche> fiche) {
		this.fiche = fiche;
	}

	
	@OneToMany(mappedBy = "tag_fiche", cascade = CascadeType.PERSIST)
	public List<Tag> getTag() {
		return tag;
	}


	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}
	
	
	
	
	
}


