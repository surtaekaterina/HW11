package by.itacademy.hw11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainAppHW11 {

	public static void main(String[] args) {
		parseText();
	}

	public static void parseText() {
		BufferedReader br = null;
		int character;

		try {
			br = new BufferedReader(new FileReader("d:\\my\\HW11\\doc.txt "));
			Sentence sentence = null;
			List<Word> tempWords = null;
			tempWords = new ArrayList<Word>();
			while ((character = br.read()) != -1) {
				Symbol symbol = new Symbol((char) character);
				List<Symbol> tempSymbols = new ArrayList<Symbol>();
					do {
						tempSymbols.add(symbol);
						character = br.read();
						symbol = new Symbol((char) character);
					} while (symbol.getCh() != ' ' && symbol.getCh() != '.');
					if(symbol.getCh() == '.') {
						tempSymbols.add(symbol);
					}
					Word word = new Word(tempSymbols);
					tempWords.add(word);
					if(symbol.getCh() == '.') {
						sentence = new Sentence(tempWords);
					}
			}
			sentence.printSentence();

			/*
			 * while ((character = br.read()) != -1) { Symbol symbol = new Symbol((char)
			 * character); List<Symbol> tempSymbols = new ArrayList<Symbol>();
			 * if(symbol.getCh() != ' ' && symbol.getCh() != '.') {
			 * 
			 * } }
			 */

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
