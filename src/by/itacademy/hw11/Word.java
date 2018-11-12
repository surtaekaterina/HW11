package by.itacademy.hw11;

import java.util.List;

public class Word {
	List<Symbol> symbols;

	public Word(List<Symbol> symbols) {
		super();
		this.symbols = symbols;
	}

	public List<Symbol> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}
	
public void printWord() {
	for(Symbol symbol: symbols) {
		System.out.print(symbol.getCh());
	}
	System.out.print("   ");
}
}
