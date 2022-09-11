import java.util.*;

public class MealCreator{
	public static IPizza getPizza(int id){
		if(id <= 5){
			return new Pizza();
		}
		return new Calzone();
	}
}
