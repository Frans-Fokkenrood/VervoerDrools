package com.fokkenrood.antlr;

import org.antlr.v4.Tool;

public class Antlr4 {
	public static void main(String[] args) {
		String[] arguments = {
				"-package",
				"com.fokkenrood.antlr",
				"src\\main\\java\\com\\fokkenrood\\antlr\\ProfielSpraak.g4"
		};
		
		//	Compile G4 to Java:
		System.out.println("Start compileren van G4 grammar naar Java code...");
		Tool.main(arguments);
	}	// end main
	
}	// end class
