package com.sanchezih.di.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}