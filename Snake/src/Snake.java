import processing.core.PApplet;

public class Snake extends MovingImages{

	public Snake(int x, int y) {
		super(x, y);
	}
	
	
	//DO THIS
	public void draw(PApplet marker){
		marker.fill(255, 0, 0);
		marker.ellipse(x*50+25, y*50+25, 50, 50);
		marker.noFill();
	}

}
