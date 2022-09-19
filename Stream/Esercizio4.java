/*
Data una lista di valori, calcolare la somma di questi
*/
import java.util.*;
public class Esercizio4{
	public static void main(String[] args){
		List<Integer> myList = List.of(1,2,2,3,3,3,4,4,4,4);
		myList.stream()
					.reduce(Integer::sum)
					.ifPresent(System.out::println);	
	}
}
