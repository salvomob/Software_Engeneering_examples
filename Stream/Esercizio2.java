/*
Data una lista di stringhe, contare quante di esse hanno una lunghezza maggiore o uguale a 3
*/
import java.util.*;
public class Esercizio2{
	public static void main(String[] args){
		List<String> myList = List.of("io","tu","egli","noi","voi","essi");
		long counter = myList.stream()
							.filter(s->s.length() >= 3)
							.count();
		System.out.println(counter);							
	}
}
