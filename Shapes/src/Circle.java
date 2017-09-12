import processing.core.PApplet;	// for Processing

public class Circle {

	//fields
	private int x;
	private int y;
	private int radius;

	// constructors
	public Circle() { //Default constructor - radius of 0
		x= 0;
		y = 0;
		radius = 0;
	}
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// methods
	// What kind of methods do you think the class Circle should have?
	public void moveX(int amount){
		x+=amount;
	}
	
	public void moveY(int amount){
		y+=amount;
	}
	
	public int getPerimeter(){
		return (int) (2*radius*Math.PI);
	}
	
	public int getArea(){
		return (int)(Math.PI*radius*radius);
	}
	
	public void scale(double amount){
		radius = (int) (radius*amount);
	}
	
	
	public void draw(PApplet marker) {
		//Replace each comment with fields
		marker.ellipse(/*x coordinate*/ x, /*y coordinate*/ y, /*radius*/ radius, /*radius*/ radius);
	}
	
	/*
	 * Need the value of pi? Do 'double pi = Math.PI;'
	 */
}
