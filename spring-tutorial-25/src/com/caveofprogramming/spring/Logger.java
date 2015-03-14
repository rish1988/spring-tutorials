package com.caveofprogramming.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logger {
	@Autowired(required=false)
	private ConsoleWriter consoleWriter;
	
	@Autowired
	private FileWriter fileWriter;

	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsole(String text) {
		if (consoleWriter != null)
			consoleWriter.write(text);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
