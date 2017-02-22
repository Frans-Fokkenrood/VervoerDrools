// Generated from src\main\java\com\fokkenrood\antlr\ProfielSpraak.g4 by ANTLR 4.2
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProfielSpraakParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCKCOMMENT=1, LINECOMMENT=2, TEKST=3, AANGIFTE=4, AAN=5, ALS=6, ALLE=7, 
		ARTIKEL=8, BEGINDATUM=9, BESTAAT=10, BEVAT=11, CONTRAINFORMATIE=12, DAN=13, 
		DDE=14, DE=15, DIE=16, EEEN=17, EEN=18, EN=19, EINDDATUM=20, GELIJK=21, 
		GESTELD=22, GROTER=23, HEEFT=24, HHET=25, HET=26, IN=27, INDIEN=28, INVOER=29, 
		IS=30, KLEINER=31, LUIDT=32, MMAAK=33, MET=34, NIET=35, OF=36, OP=37, 
		OMVAT=38, PARAMETERS=39, PARTIJ=40, RREGEL=41, REGEL=42, RUBRIEK=43, SCORE=44, 
		TTESTCASE=45, TESTGEVALLEN=46, TOELICHTING=47, UIT=48, VOLDAAN=49, VOLGENDE=50, 
		VOORWAARDEN=51, VUREN=52, WAARBIJ=53, WAARDOOR=54, WORDT=55, ZAL=56, ZIJNDE=57, 
		DUBBELE_PUNT=58, GETAL_NUL=59, PUNT=60, STREEPJE=61, DATUM=62, FLOAT=63, 
		GETAL=64, WOORD=65, WS=66;
	public static final String[] tokenNames = {
		"<INVALID>", "BLOCKCOMMENT", "LINECOMMENT", "TEKST", "'aangifte'", "'aan'", 
		"'als'", "'alle'", "'artikel'", "'begindatum'", "'bestaat'", "'bevat'", 
		"'contrainformatie'", "'dan'", "'De'", "'de'", "'die'", "'Een'", "'een'", 
		"'en'", "'einddatum'", "'gelijk'", "'gesteld'", "'groter'", "'heeft'", 
		"'Het'", "'het'", "'in'", "'indien'", "'invoer'", "'is'", "'kleiner'", 
		"'luidt'", "'Maak'", "'met'", "'niet'", "'of'", "'op'", "'omvat'", "'parameters'", 
		"'partij'", "'Regel'", "'regel'", "'rubriek'", "'score'", "'Testcase'", 
		"'testgevallen'", "'toelichting'", "'uit'", "'voldaan'", "'volgende'", 
		"'voorwaarden'", "'vuren'", "'waarbij'", "'waardoor'", "'wordt'", "'zal'", 
		"'zijnde'", "':'", "'0'", "'.'", "'-'", "DATUM", "FLOAT", "GETAL", "WOORD", 
		"WS"
	};
	public static final int
		RULE_statements = 0, RULE_regel = 1, RULE_maakscore = 2, RULE_object = 3, 
		RULE_voorwaarde = 4, RULE_testcase = 5, RULE_testgeval = 6, RULE_invoer = 7, 
		RULE_toekennen = 8, RULE_waarde = 9, RULE_vergelijking = 10, RULE_feit = 11;
	public static final String[] ruleNames = {
		"statements", "regel", "maakscore", "object", "voorwaarde", "testcase", 
		"testgeval", "invoer", "toekennen", "waarde", "vergelijking", "feit"
	};

	@Override
	public String getGrammarFileName() { return "ProfielSpraak.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProfielSpraakParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public TestcaseContext testcase(int i) {
			return getRuleContext(TestcaseContext.class,i);
		}
		public List<TestcaseContext> testcase() {
			return getRuleContexts(TestcaseContext.class);
		}
		public List<RegelContext> regel() {
			return getRuleContexts(RegelContext.class);
		}
		public RegelContext regel(int i) {
			return getRuleContext(RegelContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				switch (_input.LA(1)) {
				case RREGEL:
					{
					setState(24); regel();
					}
					break;
				case TTESTCASE:
					{
					setState(25); testcase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RREGEL || _la==TTESTCASE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegelContext extends ParserRuleContext {
		public Token rg;
		public Token rs;
		public TerminalNode WORDT() { return getToken(ProfielSpraakParser.WORDT, 0); }
		public TerminalNode DE() { return getToken(ProfielSpraakParser.DE, 0); }
		public TerminalNode VOLGENDE() { return getToken(ProfielSpraakParser.VOLGENDE, 0); }
		public TerminalNode AAN() { return getToken(ProfielSpraakParser.AAN, 0); }
		public TerminalNode DUBBELE_PUNT(int i) {
			return getToken(ProfielSpraakParser.DUBBELE_PUNT, i);
		}
		public TerminalNode IN() { return getToken(ProfielSpraakParser.IN, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public TerminalNode PUNT() { return getToken(ProfielSpraakParser.PUNT, 0); }
		public TerminalNode INDIEN() { return getToken(ProfielSpraakParser.INDIEN, 0); }
		public List<TerminalNode> DUBBELE_PUNT() { return getTokens(ProfielSpraakParser.DUBBELE_PUNT); }
		public TerminalNode TEKST(int i) {
			return getToken(ProfielSpraakParser.TEKST, i);
		}
		public TerminalNode VOLDAAN() { return getToken(ProfielSpraakParser.VOLDAAN, 0); }
		public List<TerminalNode> TEKST() { return getTokens(ProfielSpraakParser.TEKST); }
		public TerminalNode VOORWAARDEN() { return getToken(ProfielSpraakParser.VOORWAARDEN, 0); }
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode RREGEL() { return getToken(ProfielSpraakParser.RREGEL, 0); }
		public MaakscoreContext maakscore() {
			return getRuleContext(MaakscoreContext.class,0);
		}
		public TerminalNode LUIDT() { return getToken(ProfielSpraakParser.LUIDT, 0); }
		public RegelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterRegel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitRegel(this);
		}
	}

	public final RegelContext regel() throws RecognitionException {
		RegelContext _localctx = new RegelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(30); match(RREGEL);
			setState(31); ((RegelContext)_localctx).rg = match(TEKST);
			setState(32); match(IN);
			setState(33); ((RegelContext)_localctx).rs = match(TEKST);
			setState(34); match(LUIDT);
			setState(35); match(DUBBELE_PUNT);
			setState(36); maakscore((((RegelContext)_localctx).rg!=null?((RegelContext)_localctx).rg.getText():null));
			setState(37); match(INDIEN);
			setState(38); match(AAN);
			setState(39); match(DE);
			setState(40); match(VOLGENDE);
			setState(41); match(VOORWAARDEN);
			setState(42); match(WORDT);
			setState(43); match(VOLDAAN);
			setState(44); match(DUBBELE_PUNT);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45); object((((RegelContext)_localctx).rg!=null?((RegelContext)_localctx).rg.getText():null));
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(50); match(PUNT);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaakscoreContext extends ParserRuleContext {
		public String rg;
		public WaardeContext w2;
		public WaardeContext w3;
		public WaardeContext w4;
		public WaardeContext w5;
		public TerminalNode MET() { return getToken(ProfielSpraakParser.MET, 0); }
		public TerminalNode BEGINDATUM(int i) {
			return getToken(ProfielSpraakParser.BEGINDATUM, i);
		}
		public TerminalNode DE() { return getToken(ProfielSpraakParser.DE, 0); }
		public TerminalNode VOLGENDE() { return getToken(ProfielSpraakParser.VOLGENDE, 0); }
		public TerminalNode IS(int i) {
			return getToken(ProfielSpraakParser.IS, i);
		}
		public List<WaardeContext> waarde() {
			return getRuleContexts(WaardeContext.class);
		}
		public WaardeContext waarde(int i) {
			return getRuleContext(WaardeContext.class,i);
		}
		public TerminalNode TOELICHTING(int i) {
			return getToken(ProfielSpraakParser.TOELICHTING, i);
		}
		public TerminalNode EEN() { return getToken(ProfielSpraakParser.EEN, 0); }
		public List<TerminalNode> BEGINDATUM() { return getTokens(ProfielSpraakParser.BEGINDATUM); }
		public TerminalNode EINDDATUM(int i) {
			return getToken(ProfielSpraakParser.EINDDATUM, i);
		}
		public List<TerminalNode> TOELICHTING() { return getTokens(ProfielSpraakParser.TOELICHTING); }
		public TerminalNode SCORE(int i) {
			return getToken(ProfielSpraakParser.SCORE, i);
		}
		public List<TerminalNode> IS() { return getTokens(ProfielSpraakParser.IS); }
		public TerminalNode DUBBELE_PUNT() { return getToken(ProfielSpraakParser.DUBBELE_PUNT, 0); }
		public List<TerminalNode> STREEPJE() { return getTokens(ProfielSpraakParser.STREEPJE); }
		public TerminalNode MMAAK() { return getToken(ProfielSpraakParser.MMAAK, 0); }
		public List<TerminalNode> SCORE() { return getTokens(ProfielSpraakParser.SCORE); }
		public TerminalNode PARAMETERS() { return getToken(ProfielSpraakParser.PARAMETERS, 0); }
		public TerminalNode STREEPJE(int i) {
			return getToken(ProfielSpraakParser.STREEPJE, i);
		}
		public List<TerminalNode> EINDDATUM() { return getTokens(ProfielSpraakParser.EINDDATUM); }
		public MaakscoreContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaakscoreContext(ParserRuleContext parent, int invokingState, String rg) {
			super(parent, invokingState);
			this.rg = rg;
		}
		@Override public int getRuleIndex() { return RULE_maakscore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterMaakscore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitMaakscore(this);
		}
	}

	public final MaakscoreContext maakscore(String rg) throws RecognitionException {
		MaakscoreContext _localctx = new MaakscoreContext(_ctx, getState(), rg);
		enterRule(_localctx, 4, RULE_maakscore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52); match(MMAAK);
			setState(53); match(EEN);
			setState(54); match(SCORE);
			setState(55); match(MET);
			setState(56); match(DE);
			setState(57); match(VOLGENDE);
			setState(58); match(PARAMETERS);
			setState(59); match(DUBBELE_PUNT);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STREEPJE) {
				{
				{
				setState(60); match(STREEPJE);
				setState(73);
				switch (_input.LA(1)) {
				case SCORE:
					{
					setState(61); match(SCORE);
					setState(62); match(IS);
					setState(63); ((MaakscoreContext)_localctx).w2 = waarde();
					}
					break;
				case TOELICHTING:
					{
					setState(64); match(TOELICHTING);
					setState(65); match(IS);
					setState(66); ((MaakscoreContext)_localctx).w3 = waarde();
					}
					break;
				case BEGINDATUM:
					{
					setState(67); match(BEGINDATUM);
					setState(68); match(IS);
					setState(69); ((MaakscoreContext)_localctx).w4 = waarde();
					}
					break;
				case EINDDATUM:
					{
					setState(70); match(EINDDATUM);
					setState(71); match(IS);
					setState(72); ((MaakscoreContext)_localctx).w5 = waarde();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public String rg;
		public Token obj;
		public TerminalNode DE() { return getToken(ProfielSpraakParser.DE, 0); }
		public TerminalNode STREEPJE() { return getToken(ProfielSpraakParser.STREEPJE, 0); }
		public TerminalNode AANGIFTE() { return getToken(ProfielSpraakParser.AANGIFTE, 0); }
		public List<VoorwaardeContext> voorwaarde() {
			return getRuleContexts(VoorwaardeContext.class);
		}
		public TerminalNode HET() { return getToken(ProfielSpraakParser.HET, 0); }
		public TerminalNode PARTIJ() { return getToken(ProfielSpraakParser.PARTIJ, 0); }
		public TerminalNode ARTIKEL() { return getToken(ProfielSpraakParser.ARTIKEL, 0); }
		public TerminalNode HEEFT() { return getToken(ProfielSpraakParser.HEEFT, 0); }
		public TerminalNode RUBRIEK() { return getToken(ProfielSpraakParser.RUBRIEK, 0); }
		public VoorwaardeContext voorwaarde(int i) {
			return getRuleContext(VoorwaardeContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ObjectContext(ParserRuleContext parent, int invokingState, String rg) {
			super(parent, invokingState);
			this.rg = rg;
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object(String rg) throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState(), rg);
		enterRule(_localctx, 6, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80); match(STREEPJE);
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==DE || _la==HET) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(85);
			switch (_input.LA(1)) {
			case AANGIFTE:
				{
				setState(82); ((ObjectContext)_localctx).obj = match(AANGIFTE);
				}
				break;
			case ARTIKEL:
				{
				setState(83); ((ObjectContext)_localctx).obj = match(ARTIKEL);
				}
				break;
			case PARTIJ:
				{
				setState(84); ((ObjectContext)_localctx).obj = match(PARTIJ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87); match(HEEFT);
			setState(88); match(RUBRIEK);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89); voorwaarde(rg);
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (EN - 19)) | (1L << (OF - 19)) | (1L << (WOORD - 19)))) != 0) );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoorwaardeContext extends ParserRuleContext {
		public String rg;
		public Token eo;
		public FeitContext f1;
		public VergelijkingContext v;
		public WaardeContext w1;
		public FeitContext f2;
		public Token not;
		public WaardeContext w2;
		public FeitContext f3;
		public TerminalNode BEVAT() { return getToken(ProfielSpraakParser.BEVAT, 0); }
		public TerminalNode UIT() { return getToken(ProfielSpraakParser.UIT, 0); }
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public TerminalNode OF() { return getToken(ProfielSpraakParser.OF, 0); }
		public TerminalNode CONTRAINFORMATIE() { return getToken(ProfielSpraakParser.CONTRAINFORMATIE, 0); }
		public FeitContext feit() {
			return getRuleContext(FeitContext.class,0);
		}
		public TerminalNode NIET() { return getToken(ProfielSpraakParser.NIET, 0); }
		public TerminalNode EN() { return getToken(ProfielSpraakParser.EN, 0); }
		public TerminalNode DIE() { return getToken(ProfielSpraakParser.DIE, 0); }
		public TerminalNode BESTAAT() { return getToken(ProfielSpraakParser.BESTAAT, 0); }
		public VergelijkingContext vergelijking() {
			return getRuleContext(VergelijkingContext.class,0);
		}
		public VoorwaardeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VoorwaardeContext(ParserRuleContext parent, int invokingState, String rg) {
			super(parent, invokingState);
			this.rg = rg;
		}
		@Override public int getRuleIndex() { return RULE_voorwaarde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterVoorwaarde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitVoorwaarde(this);
		}
	}

	public final VoorwaardeContext voorwaarde(String rg) throws RecognitionException {
		VoorwaardeContext _localctx = new VoorwaardeContext(_ctx, getState(), rg);
		enterRule(_localctx, 8, RULE_voorwaarde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			switch (_input.LA(1)) {
			case EN:
				{
				setState(94); ((VoorwaardeContext)_localctx).eo = match(EN);
				}
				break;
			case OF:
				{
				setState(95); ((VoorwaardeContext)_localctx).eo = match(OF);
				}
				break;
			case WOORD:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(98); ((VoorwaardeContext)_localctx).f1 = feit();
				setState(99); ((VoorwaardeContext)_localctx).v = vergelijking();
				setState(100); ((VoorwaardeContext)_localctx).w1 = waarde();
				}
				break;

			case 2:
				{
				setState(102); ((VoorwaardeContext)_localctx).f2 = feit();
				setState(103); match(BEVAT);
				setState(105);
				_la = _input.LA(1);
				if (_la==NIET) {
					{
					setState(104); ((VoorwaardeContext)_localctx).not = match(NIET);
					}
				}

				setState(107); ((VoorwaardeContext)_localctx).w2 = waarde();
				}
				break;

			case 3:
				{
				setState(109); ((VoorwaardeContext)_localctx).f3 = feit();
				setState(110); match(UIT);
				setState(111); match(CONTRAINFORMATIE);
				setState(112); match(DIE);
				setState(114);
				_la = _input.LA(1);
				if (_la==NIET) {
					{
					setState(113); ((VoorwaardeContext)_localctx).not = match(NIET);
					}
				}

				setState(116); match(BESTAAT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestcaseContext extends ParserRuleContext {
		public Token tc;
		public Token rs;
		public TerminalNode PUNT() { return getToken(ProfielSpraakParser.PUNT, 0); }
		public TerminalNode DE() { return getToken(ProfielSpraakParser.DE, 0); }
		public TerminalNode VOLGENDE() { return getToken(ProfielSpraakParser.VOLGENDE, 0); }
		public TerminalNode DUBBELE_PUNT() { return getToken(ProfielSpraakParser.DUBBELE_PUNT, 0); }
		public List<TestgevalContext> testgeval() {
			return getRuleContexts(TestgevalContext.class);
		}
		public TerminalNode TTESTCASE() { return getToken(ProfielSpraakParser.TTESTCASE, 0); }
		public TerminalNode TEKST(int i) {
			return getToken(ProfielSpraakParser.TEKST, i);
		}
		public List<TerminalNode> TEKST() { return getTokens(ProfielSpraakParser.TEKST); }
		public TestgevalContext testgeval(int i) {
			return getRuleContext(TestgevalContext.class,i);
		}
		public TerminalNode OMVAT() { return getToken(ProfielSpraakParser.OMVAT, 0); }
		public TerminalNode IN() { return getToken(ProfielSpraakParser.IN, 0); }
		public TerminalNode TESTGEVALLEN() { return getToken(ProfielSpraakParser.TESTGEVALLEN, 0); }
		public TestcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterTestcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitTestcase(this);
		}
	}

	public final TestcaseContext testcase() throws RecognitionException {
		TestcaseContext _localctx = new TestcaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_testcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120); match(TTESTCASE);
			setState(121); ((TestcaseContext)_localctx).tc = match(TEKST);
			setState(122); match(IN);
			setState(123); ((TestcaseContext)_localctx).rs = match(TEKST);
			setState(124); match(OMVAT);
			setState(125); match(DE);
			setState(126); match(VOLGENDE);
			setState(127); match(TESTGEVALLEN);
			setState(128); match(DUBBELE_PUNT);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129); testgeval();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(134); match(PUNT);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestgevalContext extends ParserRuleContext {
		public Token tg;
		public Token not;
		public TerminalNode MET() { return getToken(ProfielSpraakParser.MET, 0); }
		public TerminalNode DE() { return getToken(ProfielSpraakParser.DE, 0); }
		public TerminalNode ZAL() { return getToken(ProfielSpraakParser.ZAL, 0); }
		public TerminalNode INVOER() { return getToken(ProfielSpraakParser.INVOER, 0); }
		public TerminalNode WAARDOOR() { return getToken(ProfielSpraakParser.WAARDOOR, 0); }
		public List<InvoerContext> invoer() {
			return getRuleContexts(InvoerContext.class);
		}
		public TerminalNode DUBBELE_PUNT() { return getToken(ProfielSpraakParser.DUBBELE_PUNT, 0); }
		public TerminalNode STREEPJE() { return getToken(ProfielSpraakParser.STREEPJE, 0); }
		public TerminalNode TEKST() { return getToken(ProfielSpraakParser.TEKST, 0); }
		public TerminalNode REGEL() { return getToken(ProfielSpraakParser.REGEL, 0); }
		public TerminalNode NIET() { return getToken(ProfielSpraakParser.NIET, 0); }
		public TerminalNode ALS() { return getToken(ProfielSpraakParser.ALS, 0); }
		public InvoerContext invoer(int i) {
			return getRuleContext(InvoerContext.class,i);
		}
		public TerminalNode VUREN() { return getToken(ProfielSpraakParser.VUREN, 0); }
		public TestgevalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testgeval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterTestgeval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitTestgeval(this);
		}
	}

	public final TestgevalContext testgeval() throws RecognitionException {
		TestgevalContext _localctx = new TestgevalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_testgeval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136); match(STREEPJE);
			setState(137); ((TestgevalContext)_localctx).tg = match(TEKST);
			setState(138); match(MET);
			setState(139); match(ALS);
			setState(140); match(INVOER);
			setState(141); match(DUBBELE_PUNT);
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142); invoer();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EEN );
			setState(147); match(WAARDOOR);
			setState(148); match(DE);
			setState(149); match(REGEL);
			setState(151);
			_la = _input.LA(1);
			if (_la==NIET) {
				{
				setState(150); ((TestgevalContext)_localctx).not = match(NIET);
				}
			}

			setState(153); match(ZAL);
			setState(154); match(VUREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvoerContext extends ParserRuleContext {
		public Token obj;
		public Token att;
		public TerminalNode ZIJNDE() { return getToken(ProfielSpraakParser.ZIJNDE, 0); }
		public TerminalNode WOORD() { return getToken(ProfielSpraakParser.WOORD, 0); }
		public TerminalNode AANGIFTE() { return getToken(ProfielSpraakParser.AANGIFTE, 0); }
		public List<ToekennenContext> toekennen() {
			return getRuleContexts(ToekennenContext.class);
		}
		public TerminalNode PARTIJ() { return getToken(ProfielSpraakParser.PARTIJ, 0); }
		public TerminalNode ARTIKEL() { return getToken(ProfielSpraakParser.ARTIKEL, 0); }
		public TerminalNode EEN() { return getToken(ProfielSpraakParser.EEN, 0); }
		public ToekennenContext toekennen(int i) {
			return getRuleContext(ToekennenContext.class,i);
		}
		public InvoerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterInvoer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitInvoer(this);
		}
	}

	public final InvoerContext invoer() throws RecognitionException {
		InvoerContext _localctx = new InvoerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_invoer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156); match(EEN);
			setState(174);
			switch (_input.LA(1)) {
			case AANGIFTE:
			case ARTIKEL:
				{
				setState(159);
				switch (_input.LA(1)) {
				case AANGIFTE:
					{
					setState(157); ((InvoerContext)_localctx).obj = match(AANGIFTE);
					}
					break;
				case ARTIKEL:
					{
					setState(158); ((InvoerContext)_localctx).obj = match(ARTIKEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161); toekennen((((InvoerContext)_localctx).obj!=null?((InvoerContext)_localctx).obj.getText():null));
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WAARBIJ );
				}
				break;
			case PARTIJ:
				{
				setState(166); ((InvoerContext)_localctx).obj = match(PARTIJ);
				setState(167); match(ZIJNDE);
				setState(168); ((InvoerContext)_localctx).att = match(WOORD);
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169); toekennen((((InvoerContext)_localctx).att!=null?((InvoerContext)_localctx).att.getText():null));
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WAARBIJ );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToekennenContext extends ParserRuleContext {
		public String obj;
		public FeitContext f;
		public WaardeContext w;
		public TerminalNode WORDT() { return getToken(ProfielSpraakParser.WORDT, 0); }
		public TerminalNode GESTELD() { return getToken(ProfielSpraakParser.GESTELD, 0); }
		public TerminalNode OP() { return getToken(ProfielSpraakParser.OP, 0); }
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public TerminalNode WAARBIJ() { return getToken(ProfielSpraakParser.WAARBIJ, 0); }
		public FeitContext feit() {
			return getRuleContext(FeitContext.class,0);
		}
		public ToekennenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ToekennenContext(ParserRuleContext parent, int invokingState, String obj) {
			super(parent, invokingState);
			this.obj = obj;
		}
		@Override public int getRuleIndex() { return RULE_toekennen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterToekennen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitToekennen(this);
		}
	}

	public final ToekennenContext toekennen(String obj) throws RecognitionException {
		ToekennenContext _localctx = new ToekennenContext(_ctx, getState(), obj);
		enterRule(_localctx, 16, RULE_toekennen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176); match(WAARBIJ);
			setState(177); ((ToekennenContext)_localctx).f = feit();
			setState(178); match(WORDT);
			setState(179); match(GESTELD);
			setState(180); match(OP);
			setState(181); ((ToekennenContext)_localctx).w = waarde();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaardeContext extends ParserRuleContext {
		public String value;
		public Token WOORD;
		public Token TEKST;
		public Token DATUM;
		public Token GETAL;
		public Token FLOAT;
		public TerminalNode DATUM() { return getToken(ProfielSpraakParser.DATUM, 0); }
		public TerminalNode GETAL_NUL() { return getToken(ProfielSpraakParser.GETAL_NUL, 0); }
		public TerminalNode WOORD() { return getToken(ProfielSpraakParser.WOORD, 0); }
		public TerminalNode TEKST() { return getToken(ProfielSpraakParser.TEKST, 0); }
		public TerminalNode GETAL() { return getToken(ProfielSpraakParser.GETAL, 0); }
		public TerminalNode FLOAT() { return getToken(ProfielSpraakParser.FLOAT, 0); }
		public WaardeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waarde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterWaarde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitWaarde(this);
		}
	}

	public final WaardeContext waarde() throws RecognitionException {
		WaardeContext _localctx = new WaardeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_waarde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch (_input.LA(1)) {
			case WOORD:
				{
				setState(183); ((WaardeContext)_localctx).WOORD = match(WOORD);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).WOORD!=null?((WaardeContext)_localctx).WOORD.getText():null); 
				}
				break;
			case TEKST:
				{
				setState(185); ((WaardeContext)_localctx).TEKST = match(TEKST);
				 ((WaardeContext)_localctx).value =  "\"" + (((WaardeContext)_localctx).TEKST!=null?((WaardeContext)_localctx).TEKST.getText():null) + "\""; 
				}
				break;
			case DATUM:
				{
				setState(187); ((WaardeContext)_localctx).DATUM = match(DATUM);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).DATUM!=null?((WaardeContext)_localctx).DATUM.getText():null); 
				}
				break;
			case GETAL:
				{
				setState(189); ((WaardeContext)_localctx).GETAL = match(GETAL);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).GETAL!=null?((WaardeContext)_localctx).GETAL.getText():null); 
				}
				break;
			case GETAL_NUL:
				{
				setState(191); match(GETAL_NUL);
				 ((WaardeContext)_localctx).value =  "0"; 
				}
				break;
			case FLOAT:
				{
				setState(193); ((WaardeContext)_localctx).FLOAT = match(FLOAT);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).FLOAT!=null?((WaardeContext)_localctx).FLOAT.getText():null).replace(',','.'); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VergelijkingContext extends ParserRuleContext {
		public String operator;
		public TerminalNode DAN() { return getToken(ProfielSpraakParser.DAN, 0); }
		public TerminalNode IS() { return getToken(ProfielSpraakParser.IS, 0); }
		public TerminalNode GELIJK() { return getToken(ProfielSpraakParser.GELIJK, 0); }
		public TerminalNode AAN() { return getToken(ProfielSpraakParser.AAN, 0); }
		public TerminalNode OF() { return getToken(ProfielSpraakParser.OF, 0); }
		public TerminalNode KLEINER() { return getToken(ProfielSpraakParser.KLEINER, 0); }
		public TerminalNode NIET() { return getToken(ProfielSpraakParser.NIET, 0); }
		public TerminalNode GROTER() { return getToken(ProfielSpraakParser.GROTER, 0); }
		public VergelijkingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergelijking; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterVergelijking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitVergelijking(this);
		}
	}

	public final VergelijkingContext vergelijking() throws RecognitionException {
		VergelijkingContext _localctx = new VergelijkingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vergelijking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(197); match(IS);
				setState(198); match(GELIJK);
				setState(199); match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "=="; 
				}
				break;

			case 2:
				{
				setState(201); match(IS);
				setState(202); match(NIET);
				setState(203); match(GELIJK);
				setState(204); match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "!="; 
				}
				break;

			case 3:
				{
				setState(206); match(IS);
				setState(207); match(GROTER);
				setState(208); match(OF);
				setState(209); match(GELIJK);
				setState(210); match(AAN);
				 ((VergelijkingContext)_localctx).operator =  ">="; 
				}
				break;

			case 4:
				{
				setState(212); match(IS);
				setState(213); match(GROTER);
				setState(214); match(DAN);
				 ((VergelijkingContext)_localctx).operator =  ">";  
				}
				break;

			case 5:
				{
				setState(216); match(IS);
				setState(217); match(KLEINER);
				setState(218); match(OF);
				setState(219); match(GELIJK);
				setState(220); match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "<="; 
				}
				break;

			case 6:
				{
				setState(222); match(IS);
				setState(223); match(KLEINER);
				setState(224); match(DAN);
				 ((VergelijkingContext)_localctx).operator =  "<";  
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeitContext extends ParserRuleContext {
		public String signifier;
		public Token WOORD;
		public List<TerminalNode> WOORD() { return getTokens(ProfielSpraakParser.WOORD); }
		public TerminalNode WOORD(int i) {
			return getToken(ProfielSpraakParser.WOORD, i);
		}
		public FeitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).enterFeit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProfielSpraakListener ) ((ProfielSpraakListener)listener).exitFeit(this);
		}
	}

	public final FeitContext feit() throws RecognitionException {
		FeitContext _localctx = new FeitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_feit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228); ((FeitContext)_localctx).WOORD = match(WOORD);
			 ((FeitContext)_localctx).signifier =  (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null); 
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WOORD) {
				{
				{
				setState(230); ((FeitContext)_localctx).WOORD = match(WOORD);
				 _localctx.signifier += (" " + (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null)); 
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3D\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\61\n\3\r\3\16\3\62\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\7\4N\n\4\f\4\16\4Q\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5X\n\5\3\5\3\5\3\5\6\5]\n\5\r\5\16\5^\3\6\3\6\5\6c\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6\3\6"+
		"\3\6\5\6y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0085\n\7\r"+
		"\7\16\7\u0086\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0092\n\b\r\b\16"+
		"\b\u0093\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00a2"+
		"\n\t\3\t\6\t\u00a5\n\t\r\t\16\t\u00a6\3\t\3\t\3\t\3\t\6\t\u00ad\n\t\r"+
		"\t\16\t\u00ae\5\t\u00b1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c6\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3\r\3\r\3\r\3\r\7"+
		"\r\u00eb\n\r\f\r\16\r\u00ee\13\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\2\3\4\2\21\21\34\34\u0105\2\34\3\2\2\2\4 \3\2\2\2\6\66\3\2\2\2\bR"+
		"\3\2\2\2\nb\3\2\2\2\fz\3\2\2\2\16\u008a\3\2\2\2\20\u009e\3\2\2\2\22\u00b2"+
		"\3\2\2\2\24\u00c5\3\2\2\2\26\u00e4\3\2\2\2\30\u00e6\3\2\2\2\32\35\5\4"+
		"\3\2\33\35\5\f\7\2\34\32\3\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37\3\3\2\2\2 !\7+\2\2!\"\7\5\2\2\"#\7\35\2\2#$\7\5"+
		"\2\2$%\7\"\2\2%&\7<\2\2&\'\5\6\4\2\'(\7\36\2\2()\7\7\2\2)*\7\21\2\2*+"+
		"\7\64\2\2+,\7\65\2\2,-\79\2\2-.\7\63\2\2.\60\7<\2\2/\61\5\b\5\2\60/\3"+
		"\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7"+
		">\2\2\65\5\3\2\2\2\66\67\7#\2\2\678\7\24\2\289\7.\2\29:\7$\2\2:;\7\21"+
		"\2\2;<\7\64\2\2<=\7)\2\2=O\7<\2\2>K\7?\2\2?@\7.\2\2@A\7 \2\2AL\5\24\13"+
		"\2BC\7\61\2\2CD\7 \2\2DL\5\24\13\2EF\7\13\2\2FG\7 \2\2GL\5\24\13\2HI\7"+
		"\26\2\2IJ\7 \2\2JL\5\24\13\2K?\3\2\2\2KB\3\2\2\2KE\3\2\2\2KH\3\2\2\2L"+
		"N\3\2\2\2M>\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3\2\2\2"+
		"RS\7?\2\2SW\t\2\2\2TX\7\6\2\2UX\7\n\2\2VX\7*\2\2WT\3\2\2\2WU\3\2\2\2W"+
		"V\3\2\2\2XY\3\2\2\2YZ\7\32\2\2Z\\\7-\2\2[]\5\n\6\2\\[\3\2\2\2]^\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_\t\3\2\2\2`c\7\25\2\2ac\7&\2\2b`\3\2\2\2ba\3\2"+
		"\2\2bc\3\2\2\2cx\3\2\2\2de\5\30\r\2ef\5\26\f\2fg\5\24\13\2gy\3\2\2\2h"+
		"i\5\30\r\2ik\7\r\2\2jl\7%\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\24\13"+
		"\2ny\3\2\2\2op\5\30\r\2pq\7\62\2\2qr\7\16\2\2rt\7\22\2\2su\7%\2\2ts\3"+
		"\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2wy\3\2\2\2xd\3\2\2\2xh\3\2\2\2xo\3"+
		"\2\2\2y\13\3\2\2\2z{\7/\2\2{|\7\5\2\2|}\7\35\2\2}~\7\5\2\2~\177\7(\2\2"+
		"\177\u0080\7\21\2\2\u0080\u0081\7\64\2\2\u0081\u0082\7\60\2\2\u0082\u0084"+
		"\7<\2\2\u0083\u0085\5\16\b\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7>"+
		"\2\2\u0089\r\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c\7\5\2\2\u008c\u008d"+
		"\7$\2\2\u008d\u008e\7\b\2\2\u008e\u008f\7\37\2\2\u008f\u0091\7<\2\2\u0090"+
		"\u0092\5\20\t\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\78\2\2\u0096"+
		"\u0097\7\21\2\2\u0097\u0099\7,\2\2\u0098\u009a\7%\2\2\u0099\u0098\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7:\2\2\u009c"+
		"\u009d\7\66\2\2\u009d\17\3\2\2\2\u009e\u00b0\7\24\2\2\u009f\u00a2\7\6"+
		"\2\2\u00a0\u00a2\7\n\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a5\5\22\n\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b1\3\2\2\2\u00a8"+
		"\u00a9\7*\2\2\u00a9\u00aa\7;\2\2\u00aa\u00ac\7C\2\2\u00ab\u00ad\5\22\n"+
		"\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b1"+
		"\21\3\2\2\2\u00b2\u00b3\7\67\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\79\2"+
		"\2\u00b5\u00b6\7\30\2\2\u00b6\u00b7\7\'\2\2\u00b7\u00b8\5\24\13\2\u00b8"+
		"\23\3\2\2\2\u00b9\u00ba\7C\2\2\u00ba\u00c6\b\13\1\2\u00bb\u00bc\7\5\2"+
		"\2\u00bc\u00c6\b\13\1\2\u00bd\u00be\7@\2\2\u00be\u00c6\b\13\1\2\u00bf"+
		"\u00c0\7B\2\2\u00c0\u00c6\b\13\1\2\u00c1\u00c2\7=\2\2\u00c2\u00c6\b\13"+
		"\1\2\u00c3\u00c4\7A\2\2\u00c4\u00c6\b\13\1\2\u00c5\u00b9\3\2\2\2\u00c5"+
		"\u00bb\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9"+
		"\7\27\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00e5\b\f\1\2\u00cb\u00cc\7 \2\2\u00cc"+
		"\u00cd\7%\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\7\7\2\2\u00cf\u00e5\b\f"+
		"\1\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\7\31\2\2\u00d2\u00d3\7&\2\2\u00d3"+
		"\u00d4\7\27\2\2\u00d4\u00d5\7\7\2\2\u00d5\u00e5\b\f\1\2\u00d6\u00d7\7"+
		" \2\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\7\17\2\2\u00d9\u00e5\b\f\1\2\u00da"+
		"\u00db\7 \2\2\u00db\u00dc\7!\2\2\u00dc\u00dd\7&\2\2\u00dd\u00de\7\27\2"+
		"\2\u00de\u00df\7\7\2\2\u00df\u00e5\b\f\1\2\u00e0\u00e1\7 \2\2\u00e1\u00e2"+
		"\7!\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e5\b\f\1\2\u00e4\u00c7\3\2\2\2\u00e4"+
		"\u00cb\3\2\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e4\u00da\3\2"+
		"\2\2\u00e4\u00e0\3\2\2\2\u00e5\27\3\2\2\2\u00e6\u00e7\7C\2\2\u00e7\u00ec"+
		"\b\r\1\2\u00e8\u00e9\7C\2\2\u00e9\u00eb\b\r\1\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\31\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\27\34\36\62KOW^bktx\u0086\u0093\u0099\u00a1\u00a6"+
		"\u00ae\u00b0\u00c5\u00e4\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}