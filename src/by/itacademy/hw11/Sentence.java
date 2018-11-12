package by.itacademy.hw11;

import java.util.List;

public class Sentence {
	List<Word> words;

	public Sentence(List<Word> words) {
		super();
		this.words = words;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}
	public void printSentence() {
		for(Word word: words) {
			word.printWord();
		}
		System.out.print("   ");
	}
}
