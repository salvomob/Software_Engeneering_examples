/*
Data una lista di terne di numeri interi, verificare se essa costituisce un triangolo, Restituire la lista dei perimetri dei triangoli
*/
import java.util.*;
import java.util.stream.Collectors;
public class Esercizio9{
	public static void main(String[] args){
		List<int[]> terne = List.of(new int[]{2,3,4},new int[]{3,4,5},new int[]{2,3,6},new int[]{12,5,13},new int[]{20,21,29});
		List<Integer> perimetri = terne.stream()
										.filter(x->isTriangle(x))
										.map(x->perimetro(x))
										.collect(Collectors.toList());
		for(Integer i : perimetri){
			System.out.println(i);
		}								
						
	}
	public static boolean isTriangle(int[] terna){
		if(terna[0] > terna[1]+terna[2] || terna[1] > terna[0]+terna[2] || terna[2] > terna[0]+terna[1])
			return false;
		return true;	
	}
	public static int perimetro(int[] terna){
		return (terna[0]+terna[1]+terna[2]);
	}
}	
