//Context
public class Photo{
	private Display mode = new ZoomIn();
	
	public void show(){
		mode.draw();
	}
	
	public void setMode(int s){
		switch(s){
			case 1:
				mode = new ZoomIn();
				break;
			case 2:
				mode = new ZoomOut();
				break;
			case 3:
				mode = new Blur();
				break;		
		}
	}
}
