import java.util.*;
import java.lang.String;
public class ScoreBoard{
	List<ConcretePlayer> list;
	private static ScoreBoard instance = null;
	private ScoreBoard(){}
	public static ScoreBoard getInstance(){
		if(instance == null){
			instance = new ScoreBoard();
		}
		return instance;
	}
	public void addList(List<ConcretePlayer> l){
		list = l;
		System.out.println("Initial list added\n");
	}
	public void addPlayer(ConcretePlayer p){
		if(list.contains(p)){
			System.out.println("Player already exists\n");
			return;
		}
		list.add(p);
		System.out.println("Player added\n");
		return;
	}
}


