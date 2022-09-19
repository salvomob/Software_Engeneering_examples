/*
Data una lista di persone (eta,nome) , calcolare il minimo delle età delle persone aventi più di 21 anni
*/
import java.util.*;
public class Esercizio6{
	public static void main(String[] args){
		List<Persona> people = List.of(new Persona(21,"Tizio"),new Persona(19,"Caio"),new Persona(23,"Sempronio"));
		Optional<Persona> pmin = people.stream()
				.filter(s-> s.getAge() >= 21)
				.reduce(Persona::getMin);
		if(pmin.isPresent())
			System.out.println(pmin.get().getName());
	}
}
