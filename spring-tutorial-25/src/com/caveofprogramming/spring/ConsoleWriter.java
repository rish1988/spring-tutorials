package com.caveofprogramming.spring;

public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println(text);
	}

}
