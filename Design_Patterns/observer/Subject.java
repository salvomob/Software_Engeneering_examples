import java.util.*;
public class Subject{
	List<Observer> nomi = new ArrayList<>();
	int state;
	
	public void notifyAllObs(){
		for(Observer o : nomi){
			o.update(this);
		}
	}
	public void setState(int s){
		state = s;
		notifyAllObs();
	}
	public int getState(){
		return state;
	}
		
	public void attach(Observer o){
		nomi.add(o);
	}
	public void detach(Observer o){
		nomi.remove(o);
	}
}
