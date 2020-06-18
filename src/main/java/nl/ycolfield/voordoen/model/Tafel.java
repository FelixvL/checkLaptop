package nl.ycolfield.voordoen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tafel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	public String tafelnummer;
	public int aantalPersonen;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTafelnummer() {
		return tafelnummer;
	}
	public void setTafelnummer(String tafelnummer) {
		this.tafelnummer = tafelnummer;
	}
	public int getAantalPersonen() {
		return aantalPersonen;
	}
	public void setAantalPersonen(int aantalPersonen) {
		this.aantalPersonen = aantalPersonen;
	}
	
	
}
