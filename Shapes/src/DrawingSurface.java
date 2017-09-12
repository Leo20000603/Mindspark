import java.awt.event.KeyEvent;

import processing.core.PApplet;



public class DrawingSurface extends PApplet {

	private Line rp;
	private double perimeter, area;
	
	public DrawingSurface() {
		rp = new Line(7,200,200,100);
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
		size(600,480);
	}
	
	
	
	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() { 
		background(255);   // Clear the screen with a white background
		fill(255);
		textAlign(CENTER);
		textSize(12);
		
		perimeter = rp.getPerimeter(); //Modify this
		area = rp.getArea(); //Modify this
		
		if (rp != null) {
			rp.draw(this);
			fill(0);
			text("Perimeter: " + perimeter + "\nArea: " + area, (float)width/2,(float)20); //Last parameter is the location of the text
		}

	}
	
	
	
	public void keyPressed() {
		if(keyCode == KeyEvent.VK_W) {
			//Move the rectangle up
			rp.moveY(-10);
		}
		else if(keyCode == KeyEvent.VK_A) {
			//Move the rectangle left
			rp.moveX(-10);
		}
		else if(keyCode == KeyEvent.VK_S) {
			//Move the rectangle down
			rp.moveY(10);
		}
		else if(keyCode == KeyEvent.VK_D) {
			//Move the rectangle right
			rp.moveX(10);
		}
		else if(keyCode == KeyEvent.VK_UP) {
			//Increase rectangle size
			rp.scale(1.1);
		}
		else if(keyCode == KeyEvent.VK_DOWN) {
			//Decrease rectangle size
			rp.scale(0.9);
		}
	}
	
	
}










