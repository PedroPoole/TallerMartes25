package taller2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import taller2.persistence.Persona;

@SpringBootApplication
public class PedroPooleSingletonApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PedroPooleSingletonApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
	}

}
