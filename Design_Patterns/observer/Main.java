public class Main{
	public static void main(String[] args){
		Observer uno = new Uno();
		Observer due = new Due();
		Observer tre = new Tre();
		Subject s = new Subject();
		s.attach(uno);
		s.attach(due);
		s.attach(tre);
		s.setState(1);
		s.setState(2);
		s.setState(3);
		s.detach(uno);
		s.setState(1);
		s.setState(2);
		s.setState(3);
	}
}
