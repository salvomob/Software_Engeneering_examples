import java.util.*;
public class Main{
	public static void main(String[] args){
		/*Coffeemachine cm = new Coffeemachine();
		cm.prepare();
		cm.turnOn();
		cm.prepare();
		cm.setLungo();
		cm.prepare();
		cm.turnOff();
		cm.prepare();
		Light l = new Light();
		Heater h = new Heater();
		l.check();
		l.turnOn();
		l.check();
		l.turnOff();
		l.check();
		/*h.check();
		h.turnOn();
		h.setMode();
		h.check();
		h.setTemperature();
		h.check();
		h.turnOff();
		h.check();
		Lounge lounge = new Lounge();
		lounge.turnOnLights();
		lounge.check();
		lounge.turnOffLights();
		lounge.check();
		Diningroom dr = new Diningroom();
		dr.check();
		dr.Espresso();
		Tv tv = new Tv();
		tv.check();
		tv.turnOn();
		tv.check();
		tv.setChannel();
		tv.check();*/
		Remote remote = new Remote();
		/*remote.turnAllLightsOn();
		remote.checkAll();
		remote.turnAllLightsOff();
		remote.checkAll();*/
		remote.turnAllHeaterOn();
		remote.setAllHeaterTemp();
		remote.checkAll();
		remote.setAllHeaterMode();
		remote.checkAll();
		/*remote.loungeCheck();
		remote.bathroomCheck();
		remote.bedroomCheck();
		remote.diningroomCheck();*/
	}
}
