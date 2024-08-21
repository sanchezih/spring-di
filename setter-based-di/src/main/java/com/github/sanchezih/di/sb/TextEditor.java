package com.github.sanchezih.di.sb;

public class TextEditor {

	private SpellChecker spellChecker;

	/**
	 * Metodo setter para inyectar la dependencia
	 * 
	 * @param spellChecker
	 */
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	/**
	 * Metodo getter que retorna el spellChecker
	 * 
	 * @return
	 */
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	/**
	 * 
	 */
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}