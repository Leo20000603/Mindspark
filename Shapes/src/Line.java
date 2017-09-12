import processing.core.PApplet;

public class Line {
	//fields
		private int x1;
		private int y1;
		private int x2;
		private int y2;

		// constructors
		public Line() { //Default constructor - radius of 0
			x1 = 0;
			y1 = 0;
			x2 = 0;
			y2 = 0;
		}
		
		public Line(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
		public Line(int x1, int y1, int length,double angle){
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = (int) Math.cos(angle);
			this.y2 = (int) Math.sin(angle);
		}

		// methods
		// What kind of methods do you think the class Circle should have?
		public void moveX(int amount){
			x1+=amount;
			x2+=amount;
		}
		
		public void moveY(int amount){
			y1+=amount;
			y2+=amount;
		}
		
		public int getPerimeter(){
			return (int) (Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		}
		
		public int getArea(){
			return 0;
		}
		
		public void scale(double amount){
			x2 = (int)(x2*amount);
			y2 = (int)(y2*amount);
		}
		
		
		public void draw(PApplet marker) {
			//Replace each comment with fields
			marker.line(/*x coordinate1*/ x1, /*y coordinate1*/ y1, /*x coordinate2*/ x2, /*y coordinate 2*/ y2);
		}
		
		public int getX1(){
			return x1;
		}
		
		public int getY1(){
			return y1;
		}
		
		public int getX2(){
			return x2;
		}
		
		public int getY2(){
			return y2;
		}
}
