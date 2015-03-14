package com.caveofprogramming.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class Logger {
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}
	
	@Autowired
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	public FileWriter getFileWriter() {
		return fileWriter;
	}
	
	@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
	
}
