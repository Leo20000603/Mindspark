import processing.core.PApplet;

public class RegularPolygon {
	private int numSides;
	private Line[] lines;
	private int x;
	private int y;
	private int size;
	
	public RegularPolygon(){
		numSides = 0;
		lines = new Line[0];
		x = 0;
		y = 0;
	}

	public RegularPolygon(int numSides, int x, int y, int size){
		this.numSides = numSides;
		lines = new Line[numSides];
		for(int i = 0;i<numSides;i++){
			lines[i] = new Line((int)(size*Math.cos(2*Math.PI*i/numSides)+x),(int)(size*Math.sin(2*Math.PI*i/numSides)+y),(int)(size*Math.cos(2*Math.PI*(i+1)/numSides)+x),(int)(size*Math.sin(2*Math.PI*(i+1)/numSides)+y));
		}
	}
	
	public void moveX(int amount){
		for(Line l:lines){
			l.moveX(amount);
		}
	}
	
	public void moveY(int amount){
		for(Line l:lines){
			l.moveY(amount);
		}
	}
	
	public int getPerimeter(){
		int sum = 0;
		for(Line l: lines){
			sum+=l.getPerimeter();
		}
		return sum;
	}
	
	public int getArea(){
		double apothem = size/(2*Math.tan(Math.PI/numSides));
		return (int)(apothem*numSides*size/2);
	}
	
	public void scale(double ratio){
		for(Line l: lines){
			l.scale(ratio);
		}
	}
	
	public void draw(PApplet marker) {
		//Replace each comment with fields
		for(Line l:lines){
			l.draw(marker);
		}
	}
	
	
}
