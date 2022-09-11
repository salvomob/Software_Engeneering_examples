import java.util.*;
public class Diningroom{
	private List<Light> lights;
	private Heater heater;
	Coffeemachine cm;
	Tv tv;
	public Diningroom(){
		lights = new ArrayList<Light>();
		for(int i = 0; i < 6; i++){
			Light l = new Light();
			lights.add(l);
		}	
		heater = new Heater();
		cm = new Coffeemachine();
		tv = new Tv();
	}
	public void turnOnLights(){
		for(Light light: lights)
			light.turnOn();
	}
	public void turnOffLights(){
		for(Light light: lights)
			light.turnOff();
	}
	public void turnOnHeater(){
		heater.turnOn();
	}
	public void turnOffHeater(){
		heater.turnOff();
	}
	public void setHeaterTemp(){
		heater.setTemperature();
	}
	public void setFixedHeaterTemp(int a){
		heater.setFixedTemp(a);
	}
	public void setFixedHeaterMode(int a){
		heater.setFixedMode(a);
	}
	public void setHeaterMode(){
		heater.setMode();
	}
	public void turnOnCoffeemachine(){
		cm.turnOn();
	}
	public void turnOffCoffeemachine(){
		cm.turnOff();
	}
	public void Espresso(){
		cm.setEspresso();
		cm.prepare();
	}
	public void Lungo(){
		cm.setLungo();
		cm.prepare();
	}
	public void Cappuccino(){
		cm.setCappuccino();
		cm.prepare();
	}
	public void turnTvOn(){
		tv.turnOn();
	}
	public void turnTvOff(){
		tv.turnOff();
	}
	public void setTvChannel(){
		tv.setChannel();
	}
	public void check(){
		System.out.print("CHECKING DININGROOM:\n");
		heater.check();	
		for(Light l:lights){
			l.check();
		}	
		cm.check();
		tv.check();
	}
}
