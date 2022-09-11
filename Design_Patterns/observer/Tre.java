public class Tre implements Observer{
	private int statodiinteresse = 3;
	public void update(Subject s){
		if(statodiinteresse == s.getState()){
			System.out.print("Tre è interessato\n");
			return;
		}
		else{
			System.out.print("Tre non è interessato\n");
			return;
		}
	}
}
