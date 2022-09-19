/*
Data una lista di numeri interi Verificare se ciascuna terna formata prendendo dalla lista tre numeri contigui costituisce un triangolo, Restituire la lista delle terne 
che rappresentano triangoli
*/

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Esercizio10{
	public static void main(String[] Args){
		List<Integer> numbers = List.of(2,2,4,6,3,6,3,3,4,5);
		List<int[]> newList = IntStream.rangeClosed(0,numbers.size()-3)
									.mapToObj(i-> new int[]{numbers.get(i),numbers.get(i+1),numbers.get(i+2)})
									.filter(t-> t[0] < t[1] + t[2])
									.filter(t-> t[1] < t[0] + t[2])
									.filter(t-> t[2] < t[0] + t[1])
									.collect(Collectors.toList());
		for(int[] terna : newList){
			System.out.println("Terna (" + terna[0] + "," + terna[1] + "," + terna[2] + ") è un triangolo");
		}									
	}
}
