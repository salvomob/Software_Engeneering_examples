import java.util.*;
public class Lounge{
	private List<Light> lights;
	private Heater heater;
	Tv tv;
	public Lounge(){
		lights = new ArrayList<Light>();
		for(int i = 0; i < 8; i++){
			Light l = new Light();
			lights.add(l);
		}	
		heater = new Heater();
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
		System.out.print("CHECKING LOUNGE:\n");
		heater.check();	
		for(Light l:lights){
			l.check();
		}
		tv.check();	
	}
}
