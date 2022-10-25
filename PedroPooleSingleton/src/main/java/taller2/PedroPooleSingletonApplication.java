package taller2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import taller2.persistence.House;
import taller2.persistence.Persona;
import taller2.services.HouseBuilder;

@SpringBootApplication
public class PedroPooleSingletonApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PedroPooleSingletonApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		HouseBuilder houseBuilder=new HouseBuilder();
		
		House casa1=houseBuilder
				.addWalls(9, "blue")
				.addDoors(5, "wooden")
				.definePorch(5, 9)
				.addGarden("grass", 1)
				.build();
		
		
		System.out.println(casa1.toString());
		
		House casa2=houseBuilder
				.addWalls(4, "silver")
				.addDoors(1, "metallic")
				.build();
		
		System.out.println(casa2.toString());
		
	}

}
