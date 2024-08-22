package com.github.sanchezih.di.sb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TextEditor textEditor = context.getBean(TextEditor.class); // Otra forma de obtener el bean
		textEditor.spellCheck();
	}
}