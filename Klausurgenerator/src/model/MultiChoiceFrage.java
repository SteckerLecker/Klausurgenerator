package model;

import de.arbeitsagentur.klausurgenerator.enums.Schwierigkeitsgrad;

public class MultiChoiceFrage extends AbstractFrage {
	
	private String[] antworten;
	private String rAntwort;

	MultiChoiceFrage(String frage, Schwierigkeitsgrad grad, int punkte, String seminar, String rAntwort ,String[] antworten) {
		super(frage, grad, punkte, seminar);
		this.antworten = antworten;
		this.rAntwort = rAntwort;
	}

	public String[] getAntworten() {
		return antworten;
	}

	public String getrAntwort() {
		return rAntwort;
	}

	@Override
	protected Object getAntwort() {
		StringBuilder antworten = new StringBuilder(rAntwort);
		setSeperator(antworten);
		
		for(String antwort : this.antworten) {
			antworten.append(antwort);
			setSeperator(antworten);
		}
		
		return antworten.toString();
	}

	@Override
	protected String getFrageTyp() {
		return "MultipleChoice";
	}



}
