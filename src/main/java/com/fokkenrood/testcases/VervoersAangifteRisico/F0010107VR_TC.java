package com.fokkenrood.testcases.VervoersAangifteRisico;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Calendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.fokkenrood.drools.Aangifte;
import com.fokkenrood.drools.Partij;
import com.fokkenrood.drools.ContraInformatieLezer;
import com.fokkenrood.drools.RISICO;

public class F0010107VR_TC {
	private int						count		= -1;
	private Calendar				TODAY		= Calendar.getInstance();
	private ContraInformatieLezer	lezer		= null;
	private KieServices				ks			= null;
	private KieContainer			kc			= null;
	private KieSession				ksession	= null;

	public F0010107VR_TC() {
		RISICO.VERBOSE = true;
		TODAY.set(2017, 1, 16);
		lezer = new ContraInformatieLezer();
		ks = KieServices.Factory.get();
		kc = ks.getKieClasspathContainer();
		ksession = kc.newKieSession("sessionVervoersAangifteRisico");
		ksession.setGlobal("lezer", lezer);
	}	// end constructor

	@Test
	public void testcase_001() {
		Partij verzender = new Partij();
		verzender.setNaam("SHENZHEN JINMAIFU");

		Aangifte aangifte = new Aangifte();
		aangifte.setEventID(13);
		aangifte.setVerzender(verzender);
		ksession.insert(aangifte);

		lezer.openWerkboek("data\\ContraInformatie.xls", TODAY);
		count = ksession.fireAllRules();
		ksession.dispose();
		lezer.sluitWerkboek();
		assertTrue("Geen enkele regel heeft gevuurd", count > 0);
	}	 // end testcase_001

	@Test
	public void testcase_002() {
		Partij verzender = new Partij();
		verzender.setNaam("WENZHOU");

		Aangifte aangifte = new Aangifte();
		aangifte.setEventID(13);
		aangifte.setVerzender(verzender);
		ksession.insert(aangifte);

		lezer.openWerkboek("data\\ContraInformatie.xls", TODAY);
		count = ksession.fireAllRules();
		ksession.dispose();
		lezer.sluitWerkboek();
		assertTrue("Een regel heeft gevuurd", count == 0);
	}	 // end testcase_002

}	// end class