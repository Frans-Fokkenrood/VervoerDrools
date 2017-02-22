// Generated from src\main\java\com\fokkenrood\antlr\ProfielSpraak.g4 by ANTLR 4.2
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProfielSpraakLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BLOCKCOMMENT", "LINECOMMENT", "TEKST", "'aangifte'", "'aan'", "'als'", 
		"'alle'", "'artikel'", "'begindatum'", "'bestaat'", "'bevat'", "'contrainformatie'", 
		"'dan'", "'De'", "'de'", "'die'", "'Een'", "'een'", "'en'", "'einddatum'", 
		"'gelijk'", "'gesteld'", "'groter'", "'heeft'", "'Het'", "'het'", "'in'", 
		"'indien'", "'invoer'", "'is'", "'kleiner'", "'luidt'", "'Maak'", "'met'", 
		"'niet'", "'of'", "'op'", "'omvat'", "'parameters'", "'partij'", "'Regel'", 
		"'regel'", "'rubriek'", "'score'", "'Testcase'", "'testgevallen'", "'toelichting'", 
		"'uit'", "'voldaan'", "'volgende'", "'voorwaarden'", "'vuren'", "'waarbij'", 
		"'waardoor'", "'wordt'", "'zal'", "'zijnde'", "':'", "'0'", "'.'", "'-'", 
		"DATUM", "FLOAT", "GETAL", "WOORD", "WS"
	};
	public static final String[] ruleNames = {
		"BLOCKCOMMENT", "LINECOMMENT", "QUOTE", "KOMMA", "LETTER", "CIJFER", "TEKST", 
		"AANGIFTE", "AAN", "ALS", "ALLE", "ARTIKEL", "BEGINDATUM", "BESTAAT", 
		"BEVAT", "CONTRAINFORMATIE", "DAN", "DDE", "DE", "DIE", "EEEN", "EEN", 
		"EN", "EINDDATUM", "GELIJK", "GESTELD", "GROTER", "HEEFT", "HHET", "HET", 
		"IN", "INDIEN", "INVOER", "IS", "KLEINER", "LUIDT", "MMAAK", "MET", "NIET", 
		"OF", "OP", "OMVAT", "PARAMETERS", "PARTIJ", "RREGEL", "REGEL", "RUBRIEK", 
		"SCORE", "TTESTCASE", "TESTGEVALLEN", "TOELICHTING", "UIT", "VOLDAAN", 
		"VOLGENDE", "VOORWAARDEN", "VUREN", "WAARBIJ", "WAARDOOR", "WORDT", "ZAL", 
		"ZIJNDE", "DUBBELE_PUNT", "GETAL_NUL", "PUNT", "STREEPJE", "DATUM", "FLOAT", 
		"GETAL", "WOORD", "WS"
	};


	public ProfielSpraakLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProfielSpraak.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: TEKST_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void TEKST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  setText(getText().replaceAll("\"",""));  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u0255\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\7\3\u00a2\n\3\f\3\16\3\u00a5\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>"+
		"\3>\3>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3D\7D\u0234\nD\fD\16D\u0237\13D\3D\3D\6D\u023b\nD\rD\16D\u023c\3E\5E"+
		"\u0240\nE\3E\6E\u0243\nE\rE\16E\u0244\3F\3F\3F\7F\u024a\nF\fF\16F\u024d"+
		"\13F\3G\6G\u0250\nG\rG\16G\u0251\3G\3G\5\u0095\u00a3\u00b7\2H\3\3\5\4"+
		"\7\2\t\2\13\2\r\2\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17"+
		"%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36"+
		"C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65q\66s\67"+
		"u8w9y:{;}<\177=\u0081>\u0083?\u0085@\u0087A\u0089B\u008bC\u008dD\3\2\5"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u025a\2\3\3\2\2\2\2\5\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\3\u008f\3\2\2\2\5\u009d\3\2\2\2\7\u00ab\3\2\2\2\t\u00ad\3\2\2\2\13\u00af"+
		"\3\2\2\2\r\u00b1\3\2\2\2\17\u00b3\3\2\2\2\21\u00bd\3\2\2\2\23\u00c6\3"+
		"\2\2\2\25\u00ca\3\2\2\2\27\u00ce\3\2\2\2\31\u00d3\3\2\2\2\33\u00db\3\2"+
		"\2\2\35\u00e6\3\2\2\2\37\u00ee\3\2\2\2!\u00f4\3\2\2\2#\u0105\3\2\2\2%"+
		"\u0109\3\2\2\2\'\u010c\3\2\2\2)\u010f\3\2\2\2+\u0113\3\2\2\2-\u0117\3"+
		"\2\2\2/\u011b\3\2\2\2\61\u011e\3\2\2\2\63\u0128\3\2\2\2\65\u012f\3\2\2"+
		"\2\67\u0137\3\2\2\29\u013e\3\2\2\2;\u0144\3\2\2\2=\u0148\3\2\2\2?\u014c"+
		"\3\2\2\2A\u014f\3\2\2\2C\u0156\3\2\2\2E\u015d\3\2\2\2G\u0160\3\2\2\2I"+
		"\u0168\3\2\2\2K\u016e\3\2\2\2M\u0173\3\2\2\2O\u0177\3\2\2\2Q\u017c\3\2"+
		"\2\2S\u017f\3\2\2\2U\u0182\3\2\2\2W\u0188\3\2\2\2Y\u0193\3\2\2\2[\u019a"+
		"\3\2\2\2]\u01a0\3\2\2\2_\u01a6\3\2\2\2a\u01ae\3\2\2\2c\u01b4\3\2\2\2e"+
		"\u01bd\3\2\2\2g\u01ca\3\2\2\2i\u01d6\3\2\2\2k\u01da\3\2\2\2m\u01e2\3\2"+
		"\2\2o\u01eb\3\2\2\2q\u01f7\3\2\2\2s\u01fd\3\2\2\2u\u0205\3\2\2\2w\u020e"+
		"\3\2\2\2y\u0214\3\2\2\2{\u0218\3\2\2\2}\u021f\3\2\2\2\177\u0221\3\2\2"+
		"\2\u0081\u0223\3\2\2\2\u0083\u0225\3\2\2\2\u0085\u0227\3\2\2\2\u0087\u0235"+
		"\3\2\2\2\u0089\u023f\3\2\2\2\u008b\u0246\3\2\2\2\u008d\u024f\3\2\2\2\u008f"+
		"\u0090\7\61\2\2\u0090\u0091\7,\2\2\u0091\u0095\3\2\2\2\u0092\u0094\13"+
		"\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7,"+
		"\2\2\u0099\u009a\7\61\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\2\2\2\u009c"+
		"\4\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7\61\2\2\u009f\u00a3\3\2\2"+
		"\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7\17\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\b\3\2\2\u00aa\6\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\b\3\2\2\2\u00ad"+
		"\u00ae\7.\2\2\u00ae\n\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0\f\3\2\2\2\u00b1"+
		"\u00b2\t\3\2\2\u00b2\16\3\2\2\2\u00b3\u00b7\5\7\4\2\u00b4\u00b6\13\2\2"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5\7\4\2\u00bb"+
		"\u00bc\b\b\3\2\u00bc\20\3\2\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7c\2\2"+
		"\u00bf\u00c0\7p\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\22\3\2\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7p\2\2\u00c9\24\3\2\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\26\3\2\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\30\3\2\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7m\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7n\2\2"+
		"\u00da\32\3\2\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7"+
		"i\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7o\2\2\u00e5"+
		"\34\3\2\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7u\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2"+
		"\u00ed\36\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7"+
		"x\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7v\2\2\u00f3 \3\2\2\2\u00f4\u00f5"+
		"\7e\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2"+
		"\u00fc\u00fd\7h\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100"+
		"\7o\2\2\u0100\u0101\7c\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2\u0103"+
		"\u0104\7g\2\2\u0104\"\3\2\2\2\u0105\u0106\7f\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7p\2\2\u0108$\3\2\2\2\u0109\u010a\7F\2\2\u010a\u010b\7g\2\2\u010b"+
		"&\3\2\2\2\u010c\u010d\7f\2\2\u010d\u010e\7g\2\2\u010e(\3\2\2\2\u010f\u0110"+
		"\7f\2\2\u0110\u0111\7k\2\2\u0111\u0112\7g\2\2\u0112*\3\2\2\2\u0113\u0114"+
		"\7G\2\2\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2\u0116,\3\2\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a.\3\2\2\2\u011b\u011c"+
		"\7g\2\2\u011c\u011d\7p\2\2\u011d\60\3\2\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7k\2\2\u0120\u0121\7p\2\2\u0121\u0122\7f\2\2\u0122\u0123\7f\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125\u0126\7w\2\2\u0126\u0127\7o\2\2"+
		"\u0127\62\3\2\2\2\u0128\u0129\7i\2\2\u0129\u012a\7g\2\2\u012a\u012b\7"+
		"n\2\2\u012b\u012c\7k\2\2\u012c\u012d\7l\2\2\u012d\u012e\7m\2\2\u012e\64"+
		"\3\2\2\2\u012f\u0130\7i\2\2\u0130\u0131\7g\2\2\u0131\u0132\7u\2\2\u0132"+
		"\u0133\7v\2\2\u0133\u0134\7g\2\2\u0134\u0135\7n\2\2\u0135\u0136\7f\2\2"+
		"\u0136\66\3\2\2\2\u0137\u0138\7i\2\2\u0138\u0139\7t\2\2\u0139\u013a\7"+
		"q\2\2\u013a\u013b\7v\2\2\u013b\u013c\7g\2\2\u013c\u013d\7t\2\2\u013d8"+
		"\3\2\2\2\u013e\u013f\7j\2\2\u013f\u0140\7g\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7h\2\2\u0142\u0143\7v\2\2\u0143:\3\2\2\2\u0144\u0145\7J\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7v\2\2\u0147<\3\2\2\2\u0148\u0149\7j\2\2\u0149"+
		"\u014a\7g\2\2\u014a\u014b\7v\2\2\u014b>\3\2\2\2\u014c\u014d\7k\2\2\u014d"+
		"\u014e\7p\2\2\u014e@\3\2\2\2\u014f\u0150\7k\2\2\u0150\u0151\7p\2\2\u0151"+
		"\u0152\7f\2\2\u0152\u0153\7k\2\2\u0153\u0154\7g\2\2\u0154\u0155\7p\2\2"+
		"\u0155B\3\2\2\2\u0156\u0157\7k\2\2\u0157\u0158\7p\2\2\u0158\u0159\7x\2"+
		"\2\u0159\u015a\7q\2\2\u015a\u015b\7g\2\2\u015b\u015c\7t\2\2\u015cD\3\2"+
		"\2\2\u015d\u015e\7k\2\2\u015e\u015f\7u\2\2\u015fF\3\2\2\2\u0160\u0161"+
		"\7m\2\2\u0161\u0162\7n\2\2\u0162\u0163\7g\2\2\u0163\u0164\7k\2\2\u0164"+
		"\u0165\7p\2\2\u0165\u0166\7g\2\2\u0166\u0167\7t\2\2\u0167H\3\2\2\2\u0168"+
		"\u0169\7n\2\2\u0169\u016a\7w\2\2\u016a\u016b\7k\2\2\u016b\u016c\7f\2\2"+
		"\u016c\u016d\7v\2\2\u016dJ\3\2\2\2\u016e\u016f\7O\2\2\u016f\u0170\7c\2"+
		"\2\u0170\u0171\7c\2\2\u0171\u0172\7m\2\2\u0172L\3\2\2\2\u0173\u0174\7"+
		"o\2\2\u0174\u0175\7g\2\2\u0175\u0176\7v\2\2\u0176N\3\2\2\2\u0177\u0178"+
		"\7p\2\2\u0178\u0179\7k\2\2\u0179\u017a\7g\2\2\u017a\u017b\7v\2\2\u017b"+
		"P\3\2\2\2\u017c\u017d\7q\2\2\u017d\u017e\7h\2\2\u017eR\3\2\2\2\u017f\u0180"+
		"\7q\2\2\u0180\u0181\7r\2\2\u0181T\3\2\2\2\u0182\u0183\7q\2\2\u0183\u0184"+
		"\7o\2\2\u0184\u0185\7x\2\2\u0185\u0186\7c\2\2\u0186\u0187\7v\2\2\u0187"+
		"V\3\2\2\2\u0188\u0189\7r\2\2\u0189\u018a\7c\2\2\u018a\u018b\7t\2\2\u018b"+
		"\u018c\7c\2\2\u018c\u018d\7o\2\2\u018d\u018e\7g\2\2\u018e\u018f\7v\2\2"+
		"\u018f\u0190\7g\2\2\u0190\u0191\7t\2\2\u0191\u0192\7u\2\2\u0192X\3\2\2"+
		"\2\u0193\u0194\7r\2\2\u0194\u0195\7c\2\2\u0195\u0196\7t\2\2\u0196\u0197"+
		"\7v\2\2\u0197\u0198\7k\2\2\u0198\u0199\7l\2\2\u0199Z\3\2\2\2\u019a\u019b"+
		"\7T\2\2\u019b\u019c\7g\2\2\u019c\u019d\7i\2\2\u019d\u019e\7g\2\2\u019e"+
		"\u019f\7n\2\2\u019f\\\3\2\2\2\u01a0\u01a1\7t\2\2\u01a1\u01a2\7g\2\2\u01a2"+
		"\u01a3\7i\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7n\2\2\u01a5^\3\2\2\2\u01a6"+
		"\u01a7\7t\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9\7d\2\2\u01a9\u01aa\7t\2\2"+
		"\u01aa\u01ab\7k\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7m\2\2\u01ad`\3\2\2"+
		"\2\u01ae\u01af\7u\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2"+
		"\7t\2\2\u01b2\u01b3\7g\2\2\u01b3b\3\2\2\2\u01b4\u01b5\7V\2\2\u01b5\u01b6"+
		"\7g\2\2\u01b6\u01b7\7u\2\2\u01b7\u01b8\7v\2\2\u01b8\u01b9\7e\2\2\u01b9"+
		"\u01ba\7c\2\2\u01ba\u01bb\7u\2\2\u01bb\u01bc\7g\2\2\u01bcd\3\2\2\2\u01bd"+
		"\u01be\7v\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7u\2\2\u01c0\u01c1\7v\2\2"+
		"\u01c1\u01c2\7i\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7x\2\2\u01c4\u01c5"+
		"\7c\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c8\7g\2\2\u01c8"+
		"\u01c9\7p\2\2\u01c9f\3\2\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7q\2\2\u01cc"+
		"\u01cd\7g\2\2\u01cd\u01ce\7n\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7e\2\2"+
		"\u01d0\u01d1\7j\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4"+
		"\7p\2\2\u01d4\u01d5\7i\2\2\u01d5h\3\2\2\2\u01d6\u01d7\7w\2\2\u01d7\u01d8"+
		"\7k\2\2\u01d8\u01d9\7v\2\2\u01d9j\3\2\2\2\u01da\u01db\7x\2\2\u01db\u01dc"+
		"\7q\2\2\u01dc\u01dd\7n\2\2\u01dd\u01de\7f\2\2\u01de\u01df\7c\2\2\u01df"+
		"\u01e0\7c\2\2\u01e0\u01e1\7p\2\2\u01e1l\3\2\2\2\u01e2\u01e3\7x\2\2\u01e3"+
		"\u01e4\7q\2\2\u01e4\u01e5\7n\2\2\u01e5\u01e6\7i\2\2\u01e6\u01e7\7g\2\2"+
		"\u01e7\u01e8\7p\2\2\u01e8\u01e9\7f\2\2\u01e9\u01ea\7g\2\2\u01ean\3\2\2"+
		"\2\u01eb\u01ec\7x\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7q\2\2\u01ee\u01ef"+
		"\7t\2\2\u01ef\u01f0\7y\2\2\u01f0\u01f1\7c\2\2\u01f1\u01f2\7c\2\2\u01f2"+
		"\u01f3\7t\2\2\u01f3\u01f4\7f\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7p\2\2"+
		"\u01f6p\3\2\2\2\u01f7\u01f8\7x\2\2\u01f8\u01f9\7w\2\2\u01f9\u01fa\7t\2"+
		"\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7p\2\2\u01fcr\3\2\2\2\u01fd\u01fe\7"+
		"y\2\2\u01fe\u01ff\7c\2\2\u01ff\u0200\7c\2\2\u0200\u0201\7t\2\2\u0201\u0202"+
		"\7d\2\2\u0202\u0203\7k\2\2\u0203\u0204\7l\2\2\u0204t\3\2\2\2\u0205\u0206"+
		"\7y\2\2\u0206\u0207\7c\2\2\u0207\u0208\7c\2\2\u0208\u0209\7t\2\2\u0209"+
		"\u020a\7f\2\2\u020a\u020b\7q\2\2\u020b\u020c\7q\2\2\u020c\u020d\7t\2\2"+
		"\u020dv\3\2\2\2\u020e\u020f\7y\2\2\u020f\u0210\7q\2\2\u0210\u0211\7t\2"+
		"\2\u0211\u0212\7f\2\2\u0212\u0213\7v\2\2\u0213x\3\2\2\2\u0214\u0215\7"+
		"|\2\2\u0215\u0216\7c\2\2\u0216\u0217\7n\2\2\u0217z\3\2\2\2\u0218\u0219"+
		"\7|\2\2\u0219\u021a\7k\2\2\u021a\u021b\7l\2\2\u021b\u021c\7p\2\2\u021c"+
		"\u021d\7f\2\2\u021d\u021e\7g\2\2\u021e|\3\2\2\2\u021f\u0220\7<\2\2\u0220"+
		"~\3\2\2\2\u0221\u0222\7\62\2\2\u0222\u0080\3\2\2\2\u0223\u0224\7\60\2"+
		"\2\u0224\u0082\3\2\2\2\u0225\u0226\7/\2\2\u0226\u0084\3\2\2\2\u0227\u0228"+
		"\5\r\7\2\u0228\u0229\5\r\7\2\u0229\u022a\5\u0083B\2\u022a\u022b\5\r\7"+
		"\2\u022b\u022c\5\r\7\2\u022c\u022d\5\u0083B\2\u022d\u022e\5\r\7\2\u022e"+
		"\u022f\5\r\7\2\u022f\u0230\5\r\7\2\u0230\u0231\5\r\7\2\u0231\u0086\3\2"+
		"\2\2\u0232\u0234\5\r\7\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u023a\5\t\5\2\u0239\u023b\5\r\7\2\u023a\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0088\3\2"+
		"\2\2\u023e\u0240\5\u0083B\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0242\3\2\2\2\u0241\u0243\5\r\7\2\u0242\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u008a\3\2\2\2\u0246"+
		"\u024b\5\13\6\2\u0247\u024a\5\13\6\2\u0248\u024a\5\u0083B\2\u0249\u0247"+
		"\3\2\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u008c\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\t\4"+
		"\2\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\bG\2\2\u0254\u008e\3\2"+
		"\2\2\r\2\u0095\u00a3\u00b7\u0235\u023c\u023f\u0244\u0249\u024b\u0251\4"+
		"\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}