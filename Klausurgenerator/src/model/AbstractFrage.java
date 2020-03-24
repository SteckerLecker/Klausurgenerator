package model;

import de.arbeitsagentur.klausurgenerator.enums.Schwierigkeitsgrad;

public abstract class AbstractFrage {
	protected String frageText;
	protected Schwierigkeitsgrad grad;
	protected int punkte;
	protected String seminar;

	AbstractFrage(String frage, Schwierigkeitsgrad grad, int punkte, String seminar) {
		frageText = frage;
		this.grad = grad;
		this.punkte = punkte;
		this.seminar = seminar;

	}

	public String getFrageText() {
		return frageText;
	}

	public Schwierigkeitsgrad getGrad() {
		return grad;
	}

	public int getPunkte() {
		return punkte;
	}

	public String getSeminar() {
		return seminar;
	}
	
	public String toString() {
		StringBuilder frageString = new StringBuilder(getFrageTyp());
		setSeperator(frageString);
		
		frageString.append(frageText);
		
		
		frageString.append(grad.toString());
		
		
		frageString.append(punkte);
		
		
		frageString.append(seminar);
		
		
		frageString.append(getAntwort());
		
		return "";
	}

	protected void setSeperator(StringBuilder frageString) {
		frageString.append("|");
	}

	protected abstract Object getAntwort();

	protected abstract String getFrageTyp();

}
