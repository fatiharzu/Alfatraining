package woche05.tag01.telefonbuch.model;

import java.util.ArrayList;
import java.util.List;

public class Telefonbuch {
	
	private List<Kontakte> Telefonbuch = new ArrayList<Kontakte>();
	
	
	public List<Kontakte> getTelefonbuch() {
		return Telefonbuch;
	}
	
	public void setTelefonbuch(List<Kontakte> telefonbuch) {
		Telefonbuch = telefonbuch;
	}
	
	public void addContact(Kontakte kontakt) {
		Telefonbuch.add(kontakt);
	}
	
	public List<Kontakte> viewAllContacts() {
		return Telefonbuch;
	}
	
	
	public Kontakte viewContactGivenPhone(long telefonnummer) {
		Kontakte obj = new Kontakte();
		
		for (Kontakte obj1 : Telefonbuch) {
			if (obj1.getlTelefonnummer() == telefonnummer) {
				obj = obj1;
			}
		}
		return obj;
	}
	
	public boolean removeContact(long telefonnummer) {
	    
		boolean f = false;
		for (Kontakte obj : Telefonbuch) {
			if (obj.getlTelefonnummer() == telefonnummer) {
				f = true;
				Telefonbuch.remove(obj);
				
				break;
			}
		}
		return f;
	}
}
