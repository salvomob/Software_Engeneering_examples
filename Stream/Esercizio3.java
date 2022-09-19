/*
Data una lista di stringhe , contare quante di esse sono stringhe vuote
*/
import java.util.*;
public class Esercizio3{
	public static void main(String[] args){
		List<String> myList = List.of("io","tu","","","","egli","noi","voi","essi","","","");
		long counter = myList.stream()
							.filter(s->s.isEmpty())
							.count();
		System.out.println(counter);							
	}
}
