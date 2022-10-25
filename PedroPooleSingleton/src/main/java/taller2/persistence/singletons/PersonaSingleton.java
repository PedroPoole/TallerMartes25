package taller2.persistence.singletons;

import taller2.persistence.Persona;

public class PersonaSingleton {
	private static Persona	INSTANCE;
	private Persona					persona;

	private PersonaSingleton() {
	}

	public static Persona getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Persona();
		}

		return INSTANCE;
	}

	

	

}
