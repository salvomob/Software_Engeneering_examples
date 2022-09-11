import java.util.*;
public class Remote{
	private Lounge lounge;
	private Bathroom bathroom;
	private Bedroom bedroom;
	private Diningroom diningroom;
	public Remote(){
		lounge = new Lounge();
		bathroom = new Bathroom();
		bedroom = new Bedroom();
		diningroom = new Diningroom();
	}
	
	//Lounge management
	
	public void loungeLightsOn(){
		lounge.turnOnLights();
	}
	public void loungeLightsOff(){
		lounge.turnOffLights();
	}
	public void loungeHeaterOn(){
		lounge.turnOnHeater();
	}
	public void loungeHeaterOff(){
		lounge.turnOffHeater();
	}
	public void loungeHeaterTemp(){
		lounge.setHeaterTemp();
	}
	public void loungeHeaterMode(){
		lounge.setHeaterMode();
	}
	public void loungeTvOn(){
		lounge.turnTvOn();
	}
	public void loungeTvOff(){
		lounge.turnTvOff();
	}
	public void loungeTvCHannel(){
		lounge.setTvChannel();
	}
	public void loungeCheck(){
		lounge.check();
	}
	
	//Bathroom management
	
	public void bathroomLightsOn(){
		bathroom.turnOnLights();
	}
	public void bathroomLightsOff(){
		bathroom.turnOffLights();
	}
	public void bathroomCheck(){
		bathroom.check();
	}
	
	//Bedroom management
	
	public void bedroomLightsOn(){
		bedroom.turnOnLights();
	}
	public void bedroomLightsOff(){
		bedroom.turnOffLights();
	}
	public void bedroomHeaterOn(){
		bedroom.turnOnHeater();
	}
	public void bedroomHeaterOff(){
		bedroom.turnOffHeater();
	}
	public void bedroomHeaterTemp(){
		bedroom.setHeaterTemp();
	}
	public void bedroomHeaterMode(){
		bedroom.setHeaterMode();
	}
	public void bedroomTvOn(){
		bedroom.turnTvOn();
	}
	public void bedroomTvOff(){
		bedroom.turnTvOff();
	}
	public void bedroomTvCHannel(){
		bedroom.setTvChannel();
	}
	public void bedroomCheck(){
		bedroom.check();
	}
	
	//Diningroom management
	
	public void diningroomLightsOn(){
		diningroom.turnOnLights();
	}
	public void diningroomLightsOff(){
		diningroom.turnOffLights();
	}
	public void diningroomHeaterOn(){
		diningroom.turnOnHeater();
	}
	public void diningroomHeaterOff(){
		diningroom.turnOffHeater();
	}
	public void diningroomHeaterTemp(){
		diningroom.setHeaterTemp();
	}
	public void diningroomHeaterMode(){
		diningroom.setHeaterMode();
	}
	public void diningroomTvOn(){
		diningroom.turnTvOn();
	}
	public void diningroomTvOff(){
		diningroom.turnTvOff();
	}
	public void diningroomTvCHannel(){
		diningroom.setTvChannel();
	}		
	public void diningroomturnOnCoffeemachine(){
		diningroom.turnOnCoffeemachine();
	}
	public void diningroomturnOffCoffeemachine(){
		diningroom.turnOffCoffeemachine();
	}
	public void diningroomEspresso(){
		diningroom.Espresso();
	}
	public void diningroomLungo(){
		diningroom.Lungo();
	}
	public void diningroomCappuccino(){
		diningroom.Cappuccino();
	}
	public void diningroomCheck(){
		diningroom.check();
	}
	
	//All-in-one management
	public void turnAllLightsOn(){
		bedroomLightsOn();
		bathroomLightsOn();
		diningroomLightsOn();
		loungeLightsOn();
	}
	public void turnAllLightsOff(){
		bedroomLightsOff();
		bathroomLightsOff();
		diningroomLightsOff();
		loungeLightsOff();
	}
	public void turnAllHeaterOn(){
		diningroomHeaterOn();
		loungeHeaterOn();
		bedroomHeaterOn();
	}
	public void turnAllHeaterOff(){
		diningroomHeaterOff();
		loungeHeaterOff();
		bedroomHeaterOff();
	}
	public void setAllHeaterTemp(){
		System.out.print("Choose a temperature between 18°C and 30°C : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 18 || a > 30){
			System.out.print("\nInvalid choice, try again\n");
			return;
		}	
		diningroom.setFixedHeaterTemp(a);
		bedroom.setFixedHeaterTemp(a);
		lounge.setFixedHeaterTemp(a);
		return;
	}
	public void setAllHeaterMode(){
		System.out.print("Choose Mode:\n1->sun\n2->ice\n3->wind\n4->dehumidator\n");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 1 || a > 4){
			System.out.print("\nInvalid choice, try again\n");
			return;
		}	
		diningroom.setFixedHeaterMode(a);
		bedroom.setFixedHeaterMode(a);
		lounge.setFixedHeaterMode(a);
		return;
	}
	public void checkAll(){
		diningroomCheck();
		bedroomCheck();
		bathroomCheck();
		loungeCheck();
	}
}
