public class Persona{
	private String name;
	private Integer age;
	public Persona(Integer a,String n){
		name = n;
		age = a;
	}
	public Integer getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(Integer a){
		age = a;
	}
	public void setAge(String n){
		name = n;
	}
	public static Persona getMax(Persona p1,Persona p2){
		if(p1.getAge() > p2.getAge())
			return p1;
		return p2;	
	}
	public static Persona getMin(Persona p1,Persona p2){
		if(p1.getAge() < p2.getAge())
			return p1;
		return p2;	
	}
}
