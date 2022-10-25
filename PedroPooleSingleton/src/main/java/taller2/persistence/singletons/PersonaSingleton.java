package taller2.persistence.singletons;

import taller2.persistence.Persona;

public class PersonaSingleton {
	private static PersonaSingleton	INSTANCE;
	private Persona					persona;

	private PersonaSingleton() {
	}

	public static PersonaSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PersonaSingleton();
		}

		return INSTANCE;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	

}
