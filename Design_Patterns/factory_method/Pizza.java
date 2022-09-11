import java.util.*;

public class Pizza implements IPizza{
	private List<Ingredient> ingredients;
	private List<Ingredient> additions;
	private float price;
	private String name;
	private int id;
	public Pizza(String n,List<Ingredient> i,float p,int _id){
		name = n;
		ingredients = i;
		price = p;
		additions = new ArrayList<Ingredient>();
		id = _id;
	}
	public Pizza(){
		name = "NEW PIZZA";
		ingredients = new ArrayList<Ingredient>();
		additions = new ArrayList<Ingredient>();
		price = 0;
		id = 0;
	}
	public void setIngredients(List<Ingredient> i){
		ingredients = i;
	}
	public void setAdditions(List<Ingredient> i){
		additions = i;
	}
	public void setPrice(float p){
		price = p;
	}
	public void addIngredient(Ingredient i){
		additions.add(i);
	}
	public float getPrice(){
		float p1 = 0.0f;
		for(Ingredient i: additions) p1 += i.getPrice();
		return price+p1;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void show(){
		System.out.println("Pizza " + name);
		for(Ingredient i : ingredients) System.out.println(i.getName());
		System.out.println("Price : " + getPrice() + "$");
	}
	
}
