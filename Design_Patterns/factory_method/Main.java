import java.util.*;

public class Main{
	public static void main(String[] args){
		MealCreator m = new MealCreator();
		IPizza p1 = m.getPizza(1);
		p1.show();
		IPizza c1 = m.getPizza(6);
		c1.show();
		p1.setPrice(1.4f);
		Ingredient tomato = new Ingredient("tomato",0.5f);
		Ingredient mozzarella = new Ingredient("mozzarella",0.5f);
		Ingredient oil = new Ingredient("oil",0.5f);
		List<Ingredient> base = new ArrayList<Ingredient>();
		base.add(mozzarella);
		base.add(oil);
		base.add(tomato);
		p1.setIngredients(base);
		p1.setAdditions(base);
		p1.show();
	}
}
