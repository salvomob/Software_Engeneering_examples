public class Profile implements IProfile{
	private Account account;
	private String name;
	private String surname;
	private int age;
	private String nationality;
	public Profile(String n,String s, int a,String na){
		name = n;
		surname = s;
		age = a;
		nationality = na;
	}
	
	public void setName(String n){
		name = n;
	}
	public void setSurname(String c){
		surname = c;
	}
	public void setAge(int e){
		age = e;
	}
	public void setNationality(String na){
		nationality = na;
	}
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public String getNationality(){
		return nationality;
	}
	public int getAge(){
		return age;
	}
	
	public void show(){
		if(account == null){
			account = new Account(name,surname,age,nationality);
			account.show();
		}
	}
}
