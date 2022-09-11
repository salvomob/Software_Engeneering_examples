import java.util.*;

public interface IPizza{
	public void setIngredients(List<Ingredient> ingredients);
	public float getPrice();
	public void setPrice(float p);
	public void setAdditions(List<Ingredient> additions);
	public void addIngredient(Ingredient i);
	void show();
}
