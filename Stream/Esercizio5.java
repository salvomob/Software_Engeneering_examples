/*
Data una lista di persone (eta,nome) , calcolare la somma delle età delle persone
*/
import java.util.*;
public class Esercizio5{
	public static void main(String[] args){
		List<Persona> people = List.of(new Persona(11,"Tizio"),new Persona(12,"Caio"),new Persona(13,"Sempronio"));
		people.stream()
				.map(Persona::getAge)
				.reduce(Integer::sum)
				.ifPresent(System.out::println);
	}
}
