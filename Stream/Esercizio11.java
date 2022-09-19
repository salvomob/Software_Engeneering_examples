/*
Data una lista di numeri interi positivi,verificare se la lista è ordinata
*/

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Esercizio11{
	public static boolean verifica(List<Integer> numbers){
		return IntStream.rangeClosed(0,numbers.size()-2)
						.filter(i-> numbers.get(i) > numbers.get(i+1))
						.peek(v -> System.out.print(numbers.get(v) + " > " + numbers.get(v+1)))
						.findAny()
						.isEmpty();
	}
	public static void main(String[] Args){
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		if(verifica(numbers) == true){
				for(Integer i : numbers){
					System.out.println(i);
				}									
		}
									
	}
	
}
