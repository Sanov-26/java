package java_day3;
interface Camera1{
	void capturePhoto();
}

interface MusicPlayer1{
	void playMusic();
}

class Smartphone implements Camera1, MusicPlayer1{
	public void capturePhoto() {
		System.out.println("Photo captured using the camera.");
	}
	public void playMusic() {
		System.out.println("Playing music");
	}
}
public class MultipleInheritance {
	public static void main(String[]args) {
		Smartphone phone = new Smartphone();
		phone.capturePhoto();
		phone.playMusic();
	}

}
