import processing.core.PApplet;

public class MovingImages {
	
	int x;
	int y;
	
	
	public MovingImages(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public void draw(PApplet marker){
		
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
}
