import java.util.*;
public class Bathroom{
	private List<Light> lights;
	public Bathroom(){
		lights = new ArrayList<Light>();
		for(int i = 0; i < 4; i++){
			Light l = new Light();
			lights.add(l);
		}
	}
	public void turnOnLights(){
		for(Light light: lights)
			light.turnOn();
	}
	public void turnOffLights(){
		for(Light light: lights)
			light.turnOff();
	}
	public void check(){
		System.out.print("CHECKING BATHROOM:\n");
		for(Light l:lights){
			l.check();
		}	
	}
}
