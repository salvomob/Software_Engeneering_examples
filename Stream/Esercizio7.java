/*
Data una lista di stringhe produrre una lista che contiene solo le stringhe che cominciano con un determinato prefisso
*/
import java.util.*;
import java.util.stream.Collectors;
public class Esercizio7{
	public static void main(String[] args){
		List<String> strings = List.of("Autore","Augusto","Ciao","Si","No","Augello","Agnello","Aureo");
		List<String> newList = strings.stream()
										.filter(s->s.substring(0,2).equals("Au"))
										.collect(Collectors.toList());
		for(String s : newList){
			System.out.println(s);
		}								
	}	
}
