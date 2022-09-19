/*
Data una lista di valori, contare quante volte è presente il valore al suo interno
*/
import java.util.*;
public class Esercizio1{
	public static void main(String[] args){
		List<Integer> myList = List.of(1,2,2,3,3,3,4,4,4,4);
		long counter = myList.stream()
							.filter(s->s == 4)
							.count();
		System.out.println(counter);							
	}
}
