package taller2.persistence.singletons;



import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import taller2.persistence.Persona;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonaLombokSingleton{
	@Getter
	@Setter
	private Persona persona;
	
	@Getter(lazy = true)
	private static final PersonaLombokSingleton instance = new PersonaLombokSingleton(); 
}
