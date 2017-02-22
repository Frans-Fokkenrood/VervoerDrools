package com.fokkenrood.drools;

public class Artikel {
	int		artikelNummer				= -1;
	String	goederenCode				= null;
	String	goederenBeschrijving		= null;
	int		brutoGewicht				= -1;
	
	public int getArtikelNummer() {
		return artikelNummer;
	}
	public void setArtikelNummer(int artikelNummer) {
		this.artikelNummer = artikelNummer;
	}
	
	public String getGoederenCode() {
		return goederenCode;
	}
	public void setGoederenCode(String goederenCode) {
		this.goederenCode = goederenCode;
	}
	
	public String getGoederenBeschrijving() {
		return goederenBeschrijving;
	}
	public void setGoederenBeschrijving(String goederenBeschrijving) {
		this.goederenBeschrijving = goederenBeschrijving;
	}
	
	public int getBrutoGewicht() {
		return brutoGewicht;
	}
	public void setBrutoGewicht(int brutoGewicht) {
		this.brutoGewicht = brutoGewicht;
	}
	
}	// end class
