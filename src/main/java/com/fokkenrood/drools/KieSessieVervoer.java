package com.fokkenrood.drools;

import java.util.Calendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieSessieVervoer {

	public static void main(String[] args) {
		System.out.println("Start KIE sessie voor Douane Vervoer...");
		RISICO.VERBOSE = true;
		
		//	maak koppeling met Contra-Informatie tabellen:
		ContraInformatieLezer lezer = new ContraInformatieLezer();
		lezer.openWerkboek("data\\ContraInformatie.xls", Calendar.getInstance());
		
		//	setup a KIE-service and a KIE-session:	
		KieServices ks = KieServices.Factory.get();
		KieContainer kc = ks.getKieClasspathContainer();
		KieSession ksession = kc.newKieSession("sessionVervoersAangifteRisico");
		ksession.setGlobal("lezer", lezer);
		
		//	voeg feiten toe aan de sessie:
		Partij verzender = new Partij();
		verzender.setNaam("SHENZHEN JINMAIFU");
		
		Aangifte aangifte = new Aangifte();
		aangifte.setEventID(13);
		aangifte.setVerzender(verzender);
		ksession.insert(aangifte);
		
//		Artikel artikel = new Artikel();
//		artikel.setGoederenCode("00009303300");
//		artikel.setGoederenBeschrijving("ONE BULLET IN THE POCKET");
//		ksession.insert(artikel);
		
		//	execute rule engine:
		ksession.fireAllRules();
		ksession.dispose();
		
		lezer.sluitWerkboek();
		System.out.println("Ready!");
	}	// end main

}	// end class
