public class Light{
	private boolean power;
	public Light(){
		power = false;
	}
	
	public void turnOn(){
		power = true;
	}
	
	public void turnOff(){
		power = false;
	}
	
	public void check(){
		if(power == false)
			System.out.print("OFF\n");
		else
			System.out.print("ON\n");
	}
}
