package com.fokkenrood.drools;

public class Aangifte {
	int		eventID						= -1;
	String	soortAangifte				= null;
	String	landVanVerzending			= null;
	String	landVanBestemming			= null;
	String	douanekantoorVanVertrek		= null;
	String	douanekantoorVanBestemming	= null;
	String	toegelatenLocatieAankomst	= null;
	Partij	ontvanger					= null;
	Partij	verzender					= null;
	Partij	aanbrenger					= null;
	Partij	aangever					= null;
	Partij	toegelatenGeadresseerde		= null;
	
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	
	public String getSoortAangifte() {
		return soortAangifte;
	}
	public void setSoortAangifte(String soortAangifte) {
		this.soortAangifte = soortAangifte;
	}
	
	public String getLandVanVerzending() {
		return landVanVerzending;
	}
	public void setLandVanVerzending(String landVanVerzending) {
		this.landVanVerzending = landVanVerzending;
	}
	
	public String getLandVanBestemming() {
		return landVanBestemming;
	}
	public void setLandVanBestemming(String landVanBestemming) {
		this.landVanBestemming = landVanBestemming;
	}
	
	public String getDouanekantoorVanVertrek() {
		return douanekantoorVanVertrek;
	}
	public void setDouanekantoorVanVertrek(String douanekantoorVanVertrek) {
		this.douanekantoorVanVertrek = douanekantoorVanVertrek;
	}
	
	public String getDouanekantoorVanBestemming() {
		return douanekantoorVanBestemming;
	}
	public void setDouanekantoorVanBestemming(String douanekantoorVanBestemming) {
		this.douanekantoorVanBestemming = douanekantoorVanBestemming;
	}
	
	public String getToegelatenLocatieAankomst() {
		return toegelatenLocatieAankomst;
	}
	public void setToegelatenLocatieAankomst(String toegelatenLocatieAankomst) {
		this.toegelatenLocatieAankomst = toegelatenLocatieAankomst;
	}
	
	public Partij getOntvanger() {
		return ontvanger;
	}
	public void setOntvanger(Partij ontvanger) {
		this.ontvanger = ontvanger;
	}
	
	public Partij getVerzender() {
		return verzender;
	}
	public void setVerzender(Partij verzender) {
		this.verzender = verzender;
	}
	
	public Partij getAanbrenger() {
		return aanbrenger;
	}
	public void setAanbrenger(Partij aanbrenger) {
		this.aanbrenger = aanbrenger;
	}
	
	public Partij getAangever() {
		return aangever;
	}
	public void setAangever(Partij aangever) {
		this.aangever = aangever;
	}
	
	public Partij getToegelatenGeadresseerde() {
		return toegelatenGeadresseerde;
	}
	public void setToegelatenGeadresseerde(Partij toegelatenGeadresseerde) {
		this.toegelatenGeadresseerde = toegelatenGeadresseerde;
	}
	
}	// end class
