package model;

import de.arbeitsagentur.klausurgenerator.enums.Schwierigkeitsgrad;

public class Freitext extends AbstractFrage {

	private String[] schluesselwoerter;

	Freitext(String frage, Schwierigkeitsgrad grad, int punkte, String seminar, String[] schluesselwoerter) {
		super(frage, grad, punkte, seminar);
		this.schluesselwoerter = schluesselwoerter;
	}

	public String[] getSchluesselwoerter() {
		return schluesselwoerter;
	}

	@Override
	protected Object getAntwort() {
		StringBuilder antwort = new StringBuilder();
		
		for(String wort : schluesselwoerter) {
			antwort.append(wort);
			setSeperator(antwort);
		}
		
		return antwort.toString();
	}

	@Override
	protected String getFrageTyp() {
		
		return "Freitext";
	}

}
