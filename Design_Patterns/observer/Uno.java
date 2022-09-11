public class Uno implements Observer{
	private int statodiinteresse = 1;
	public void update(Subject s){
		if(statodiinteresse == s.getState()){
			System.out.print("Uno è interessato\n");
			return;
		}
		else{
			System.out.print("Uno non è interessato\n");
			return;
		}
	}
}
