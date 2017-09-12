import java.util.Scanner;

public class UFOTester {
	
	public static void main(String[] args){
		UFO ufo = new UFO();
		boolean quit = false;
		Scanner in = new Scanner(System.in);
		while (!quit){
			String command = in.next();
			if(command.equals("land")){
				System.out.println("UFO Speed Before: " + ufo.speed);
				ufo.land();
				System.out.println("UFO Speed After: "+ ufo.speed);
			}else if(command.equals("fly")){
				System.out.println("UFO Location Before flying 50 pixels: " + ufo.x);
				ufo.fly(50);
				System.out.println("UFO Location After flying 50 pixels: "+ ufo.x);
			}else if(command.equals("getX")){
				System.out.println("UFO x Location: " + ufo.getX());
			}else if(command.equals("isFlying")){
				System.out.println("UFO is flying?: " + ufo.isFlying());
			}else if(command.equals("quit")){
				quit = !quit;
			}
		}
		in.close();
	}

}
