public class ConcretePlayer implements Player{
	private int age;
	private String name;
	public ConcretePlayer(){
		age = 0;
		name = "";
	}
	public ConcretePlayer(int a,String n){
		age = a;
		name = n;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
}

