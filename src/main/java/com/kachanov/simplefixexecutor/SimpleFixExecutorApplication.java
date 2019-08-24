package com.kachanov.simplefixexecutor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import quickfix.examples.executor.Executor;

@SpringBootApplication
public class SimpleFixExecutorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimpleFixExecutorApplication.class, args);
	}

	@Override
	public void run( String... args ) throws Exception {
		Executor.main( args );
	}
	
}
