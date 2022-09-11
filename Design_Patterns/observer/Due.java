public class Due implements Observer{
	private int statodiinteresse = 2;
	public void update(Subject s){
		if(statodiinteresse == s.getState()){
			System.out.print("Due è interessato\n");
			return;
		}
		else{
			System.out.print("Due non è interessato\n");
			return;
		}
	}
}
