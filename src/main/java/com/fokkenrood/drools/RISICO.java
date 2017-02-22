package com.fokkenrood.drools;

public class RISICO {
	public static int		LAAG		= 11;
	public static int		MIDDEN		= 22;
	public static int		HOOG		= 33;
	public static int		EXTREEM		= 99;

	public static boolean	VERBOSE		= false;

	public static void maakScore(String regel, int score, String opmerking, String begindatum, String einddatum) {
		if (VERBOSE) {
			System.out.println("- Regel '" + regel + "', met score " + score
					+ ", '" + opmerking + "';  begin:" + begindatum + ", eind:" + einddatum);
		}	// end if
	}	// end maakScore

}	// end class
