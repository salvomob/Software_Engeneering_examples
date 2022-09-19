/*
Data una lista di stringhe produrre unna stringa contenente le iniziali di ciascuna stringa della lista
*/
import java.util.*;
import java.util.stream.Collectors;
public class Esercizio8{
	public static void main(String[] args){
		List<String> myList = List.of("to", "speak", "the", "truth", "and", "pay","your", "debts");
		String myStr = myList.stream()
								.map(s-> s.substring(0,1))
								.collect(Collectors.joining());
		System.out.println(myStr);						
	}
}	
