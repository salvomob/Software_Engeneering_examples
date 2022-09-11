public class Ingredient{
	private String name;
	float price;
	public Ingredient(String n, float p){
		name = n;
		price = p;
	}
	public void setName(String n){
		name = n;
	}
	public void setPrice(float p){
		price = p;
	}
	public String getName(){
		return name;
	}
	public float getPrice(){
		return price;
	}
}
