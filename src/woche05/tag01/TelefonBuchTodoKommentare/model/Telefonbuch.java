package woche05.tag01.TelefonBuchTodoKommentare.model;

import java.util.ArrayList;
import java.util.List;

//TODO 0 Klassenkommentar vergessen & Regionen einfügen
public class Telefonbuch {

	//TODO 1 Attributnamen werden klein geschrieben & Kontakte kann bei Initialisierung weggelassen werden
	private List<Kontakte> Telefonbuch = new ArrayList<Kontakte>();
	
	
	public List<Kontakte> getTelefonbuch() {
		return Telefonbuch;
	}
	
	public void setTelefonbuch(List<Kontakte> telefonbuch) {
		Telefonbuch = telefonbuch;
	}

	//TODO 2 Sprachen sind vermischt, Programm sollte deutsch entwickelt werden
	public void addContact(Kontakte kontakt) {
		Telefonbuch.add(kontakt);
	}
	
	public List<Kontakte> viewAllContacts() {
		return Telefonbuch;
	}
	
	
	public Kontakte viewContactGivenPhone(long telefonnummer) {
		//TODO 3 kein aussagekräftiger Name
		Kontakte obj = new Kontakte();

		//TODO 4 keine Ziffern in Variablennamen
		for (Kontakte obj1 : Telefonbuch) {
			if (obj1.getlTelefonnummer() == telefonnummer) {
				obj = obj1;
			}
		}
		return obj;
	}
	
	public boolean removeContact(long telefonnummer) {
	    //TODO 5 kein Variablennamen mit nur einem Buchstaben
		boolean f = false;
		for (Kontakte obj : Telefonbuch) {
			if (obj.getlTelefonnummer() == telefonnummer) {
				f = true;
				Telefonbuch.remove(obj);

				//TODO 6 niemals eine break-Anweisung in einer Schleife
				break;
			}
		}
		return f;
	}
}
