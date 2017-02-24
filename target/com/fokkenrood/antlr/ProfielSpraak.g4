grammar ProfielSpraak;

statements
	:
	(	regel
	|	testcase
	)+
	;

regel
	:
	(	RREGEL rg=TEKST IN rs=TEKST LUIDT DUBBELE_PUNT
		maakscore[$rg.text]
		INDIEN AAN DE VOLGENDE VOORWAARDEN WORDT VOLDAAN DUBBELE_PUNT
		(	object[$rg.text]
		)+
		PUNT
	)
	;
	
maakscore[String rg]
	:
	(	MMAAK EEN SCORE MET DE VOLGENDE PARAMETERS DUBBELE_PUNT
		(	STREEPJE
			(	SCORE IS w2=waarde
			|	TOELICHTING IS w3=waarde
			|	BEGINDATUM IS w4=waarde
			|	EINDDATUM IS w5=waarde
			)
		)*
	)
	;

object[String rg]
	:
	(	STREEPJE
		( DE | HET ) 
		(	obj=AANGIFTE
		|	obj=ARTIKEL
		|	obj=PARTIJ
		)
		HEEFT RUBRIEK
		(	voorwaarde[rg]
		)+	
	)
	;
	
voorwaarde[String rg]	
	:
	(	eo=EN
	|	eo=OF
	)?
	(	f1=feit v=vergelijking w1=waarde
	|	f2=feit BEVAT ( not=NIET )? w2=waarde
	|	f3=feit UIT CONTRAINFORMATIE DIE ( not=NIET )? BESTAAT
	)
	;
		
testcase
	:
	(	TTESTCASE tc=TEKST IN rs=TEKST OMVAT DE VOLGENDE TESTGEVALLEN DUBBELE_PUNT
		(	testgeval
		)+
		PUNT
	)
	;

testgeval
	:
	(	STREEPJE tg=TEKST MET ALS INVOER DUBBELE_PUNT
		(	invoer
		)+
		WAARDOOR DE REGEL ( not=NIET )? ZAL VUREN
	)
	;

invoer
	:
	(	EEN
		(	(	obj=AANGIFTE
			|	obj=ARTIKEL
			)
			(	toekennen[$obj.text]
			)+
		|	obj=PARTIJ ZIJNDE att=WOORD
			(	toekennen[$att.text]
			)+
		)
	)
	;
	
toekennen[String obj]
	:
	(	WAARBIJ f=feit WORDT GESTELD OP w=waarde
	)
	;
	

waarde returns [String value]
	:
	(	WOORD										{ $value = $WOORD.text; }
	|	TEKST										{ $value = "\"" + $TEKST.text + "\""; }
	|	DATUM										{ $value = $DATUM.text; }
	|	GETAL										{ $value = $GETAL.text; }
	|	GETAL_NUL									{ $value = "0"; }
	|	FLOAT										{ $value = $FLOAT.text.replace(',','.'); }
	)
	;

vergelijking returns [String operator]
	:	
	(	IS GELIJK AAN								{ $operator = "=="; }
	|	IS NIET GELIJK AAN							{ $operator = "!="; }
	|	IS GROTER OF GELIJK AAN						{ $operator = ">="; }
	|	IS GROTER DAN								{ $operator = ">";  }
	|	IS KLEINER OF GELIJK AAN					{ $operator = "<="; }
	|	IS KLEINER DAN								{ $operator = "<";  }
	)
	;

feit returns [String signifier]
	:
	(	WOORD										{ $signifier  = $WOORD.text; }
		(	WOORD									{ $signifier += (" " + $WOORD.text); }
		)*
	) 
	;


BLOCKCOMMENT:			'/*' .*? '*/'					-> skip ;
LINECOMMENT:			'//' .*? '\r\n'					-> skip ;

fragment QUOTE:			'"' ;
fragment KOMMA:			',' ;
fragment LETTER:		[a-zA-Z] ;
fragment CIJFER:		[0-9] ;

TEKST:					QUOTE .*? QUOTE					{ setText(getText().replaceAll("\"","")); } ;

AANGIFTE:				'aangifte' ;
AAN:					'aan' ;
ALS:					'als' ;
ALLE:					'alle' ;
ARTIKEL:				'artikel' ;
BEGINDATUM:				'begindatum' ;
BESTAAT:				'bestaat' ;
BEVAT:					'bevat' ;
CONTRAINFORMATIE:		'contrainformatie' ;
DAN:					'dan' ;
DDE:					'De' ;
DE:						'de' ;
DIE:					'die' ;
EEEN:					'Een' ;
EEN:					'een' ;
EN:						'en' ;
EINDDATUM:				'einddatum' ;
GELIJK:					'gelijk' ;
GESTELD:				'gesteld' ;
GROTER:					'groter' ;
HEEFT:					'heeft' ;
HHET:					'Het' ;
HET:					'het' ;
IN:						'in' ;
INDIEN:					'indien' ;
INVOER:					'invoer' ;
IS:						'is' ;
KLEINER:				'kleiner' ;
LUIDT:					'luidt' ;
MMAAK:					'Maak' ;
MET:					'met' ;
NIET:					'niet' ;
OF:						'of' ;
OP:						'op' ;
OMVAT:					'omvat' ;
PARAMETERS:				'parameters' ;
PARTIJ:					'partij' ;
RREGEL:					'Regel' ;
REGEL:					'regel' ;
RUBRIEK:				'rubriek' ;
SCORE:					'score' ;
TTESTCASE:				'Testcase' ;
TESTGEVALLEN:			'testgevallen' ;
TOELICHTING:			'toelichting' ;
UIT:					'uit' ;
VOLDAAN:				'voldaan' ;
VOLGENDE:				'volgende' ;
VOORWAARDEN:			'voorwaarden' ;
VUREN:					'vuren' ;
WAARBIJ:				'waarbij' ;
WAARDOOR:				'waardoor' ;
WORDT:					'wordt' ;
ZAL:					'zal' ;
ZIJNDE:					'zijnde' ;

DUBBELE_PUNT:			':' ;
GETAL_NUL:				'0' ;
PUNT:					'.' ;
STREEPJE:				'-' ;

DATUM:					CIJFER CIJFER STREEPJE CIJFER CIJFER STREEPJE CIJFER CIJFER CIJFER CIJFER ;
FLOAT:					CIJFER* KOMMA CIJFER+ ;
GETAL:					( STREEPJE )? CIJFER+ ;
WOORD:					LETTER ( LETTER | STREEPJE )* ;

WS:						[ \t\r\n]+						-> skip ;
