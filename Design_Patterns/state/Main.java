public class Main{
	public static void main(String[] args){
		Photo photo = new Photo();
		photo.show();
		System.out.println(" ");
		photo.setMode(2);
		photo.show();
		System.out.println(" ");		
		photo.setMode(3);
		photo.show();
		System.out.println(" ");		
		photo.setMode(1);
		photo.show();
	}
}
