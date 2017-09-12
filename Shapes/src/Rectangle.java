import processing.core.PApplet;	// for Processing

public class Rectangle {

	//fields
	private int x;
	private int y;
	private int width;
	private int height;

	// constructors
	public Rectangle() { //Default constructor - width and height of 0
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// methods
	// What kind of methods do you think the class Rectangle should have?
	// Look at DrawingSurface.java, and determine what you need to include in order to complete all tasks listed.
	public void moveX(int amount){
		this.x+=amount;
	}
	
	public void moveY(int amount){
		this.y+= amount;
	}
	
	public int getPerimeter(){
		return (width+height)*2;
	}
	
	public int getArea(){
		return width*height;
	}
	
	public void scale(double ratio){
		this.width = (int)(width*ratio);
		this.height = (int)(height*ratio);
	}
	
	public void draw(PApplet marker) {
		//Replace each comment with fields
		marker.rect(/*x coordinate*/ x, /*y coordinate*/ y, /*width*/ width, /*height*/ height);
	}
}
