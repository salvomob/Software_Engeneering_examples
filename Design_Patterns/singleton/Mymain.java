/*
Il singleton è un particolare design pattern creazionale.
Esso è necessario quando di una classe si deve instanziare un solo oggetto.
Fornisce un metodo efficace per il controllo e las gestione dell'oggetto in questione.
Qui verrà implementato un semplice esempio
*/

import java.util.*;
import java.lang.String;

public class Mymain{
	public static void main(String[] args){
		//List<ConcretePlayer> players = List.of(new ConcretePlayer(10,"Gio"),new ConcretePlayer(14,"Mer"),new ConcretePlayer(11,"Mar"),new ConcretePlayer(12,"Lun"));
		//inizializzando la lista come sopra non si possono inserire altri elementi all'interno
		List<ConcretePlayer> players = new ArrayList<ConcretePlayer>();
		players.add(new ConcretePlayer(10,"Gio"));
		ScoreBoard board = ScoreBoard.getInstance();
		board.addList(players);
		ConcretePlayer newMan = new ConcretePlayer(11,"Ven");
		board.addPlayer(newMan);
		board.addPlayer(newMan);
	}
}
