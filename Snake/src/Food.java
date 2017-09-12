import processing.core.PApplet;

public class Food extends MovingImages{

	public Food(int x, int y) {
		super(x, y);
	}
	
	
	//DO THIS
	public void draw(PApplet marker){
		marker.fill(0, 255, 0);
		marker.ellipse(x*50+25, y*50+25, 50, 50);
		marker.noFill();
	}

}
