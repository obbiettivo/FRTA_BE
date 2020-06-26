package it.lispa.entges.frta.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("it.lispa")
public class Application {
	public static void main(String[] args) {
		SpringApplicationBuilder app = new SpringApplicationBuilder(Application.class);

		app.build().addListeners(new ApplicationPidFileWriter("./shutdown.pid"));
		app.run(args);
	}
}