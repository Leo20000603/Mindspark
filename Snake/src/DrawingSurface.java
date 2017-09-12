import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

public class DrawingSurface extends PApplet{
	Food food;
	int size;
	ArrayList<Snake> snakes;
	int time = 0;
	private boolean ateFood = false;
	private boolean gameStart = false;
	private String direction;
	private boolean death = false;
	
		
	public DrawingSurface(){
		snakes = new ArrayList<Snake>();//DO EVERYTHING  BELOW THIS
		int foodX = (int)(Math.random()*size);
		int foodY = (int)(Math.random()*size);
		food = new Food(foodX,foodY);
		this.size = 10;
		direction = "up";
		int snakeStartX = 5;
		int snakeStartY = 5;
		while(!isLegal(snakeStartX,snakeStartY)){
			snakeStartX = (int)(Math.random()*size);
			snakeStartY = (int)(Math.random()*size);
		}
		snakes.add(new Snake(snakeStartX,snakeStartY));
	}
	//DO THIS
	
	public void paintComponent(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(0, 0, 500, 500);
	}
	public void mousePressed(){
		
		gameStart = true;
	}
	//DO THIS
	private boolean isLegal(int x, int y){
		if(x<0||x>=10||y<0||y>=10){
			return false;
		}
		for(Snake s:snakes){
			if(s.getX() == x && s.getY() == y){
				return false;
			}
		}
		return true;
	}
	
	
	//DO THIS
	private void createBoard(){
		for(int i = 0;i<size;i++){
			for(int j = 0;j<size;j++){
				this.rect(i*50, j*50, 50, 50);
			}
		}
	}
	
	//DO THIS
		private void generateFood(){
			int x = (int)(Math.random()*size);
			int y = (int)(Math.random()*size);
			if(isLegal(x,y)){
				food = new Food(x,y);
			}else{
				generateFood();
			}
		}
	
	//Prob do this
	public void runGame(){
		boolean canMove = step();
		if(!canMove){
			death =true;
		}
	}
	
	public void drawBackground(){
		this.fill(0);
		this.rect(0, 0, 500, 500);
		this.fill(255,0,0);
		this.rect(0, 0, 30, 50);
		this.fill(255,0,0);
		this.rect(234, 123, 30, 50);
		this.fill(255,0,0);
		this.rect(40, 90, 30, 50);
		this.fill(255,0,0);
		this.rect(430, 250, 30, 50);
		this.fill(255,0,0);
		this.rect(320, 124, 30, 50);
		this.fill(255,0,0);
		this.rect(123, 350, 30, 50);
		this.fill(255,0,0);
		this.rect(450, 450, 30, 50);

	}
	
	//DO PART OF THIS 
	public void draw(){
		if(!death){
			background(255);//this part before the for loop
			drawBackground();
			this.noFill();
			createBoard();
			food.draw(this);
			for(Snake s: snakes){
				s.draw(this);
			}
			if(time%15==0 && gameStart){
				runGame();
			}
			time++;
		}else{//this part
			fill(0,0,0);
			textSize(30);
			text("GAME OVER", 165,250);
		}
		
	}

	//DO THIS
	public void keyPressed(){
		if(keyCode == KeyEvent.VK_LEFT) {
			direction = "left";
		}else if(keyCode == KeyEvent.VK_RIGHT) {
			direction = "right";
		}else if(keyCode == KeyEvent.VK_UP) {
			direction = "up";
		}else if(keyCode == KeyEvent.VK_DOWN) {
			direction = "down";
		}
	}
		
	//idk about this one...
	public boolean step(){
		if(direction.equals("left")){
			int x = snakes.get(0).getX();
			x-=1;
			int y = snakes.get(0).getY();
			if(!ateFood){
				Snake s = snakes.remove(snakes.size()-1);
				snakes.add(0, s);
				if(isLegal(x,y)){
					s.move(x, y);
					ateFood = tryEatFood(x,y);
					ateFood = false;
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else if(direction.equals("right")){
			int x = snakes.get(0).getX();
			x+=1;
			int y = snakes.get(0).getY();
			if(!ateFood){
				Snake s = snakes.remove(snakes.size()-1);
				snakes.add(0, s);
				if(isLegal(x,y)){
					s.move(x, y);
					ateFood = tryEatFood(x,y);
					ateFood = false;
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else if(direction.equals("up")){
			int x = snakes.get(0).getX();
			int y = snakes.get(0).getY();
			y-=1;
			if(!ateFood){
				Snake s = snakes.remove(snakes.size()-1);
				snakes.add(0, s);
				if(isLegal(x,y)){
					s.move(x, y);
					ateFood = tryEatFood(x,y);
					ateFood = false;
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else if(direction.equals("down")){
			int x = snakes.get(0).getX();
			int y = snakes.get(0).getY();
			y+=1;
			if(!ateFood){
				Snake s = snakes.remove(snakes.size()-1);
				snakes.add(0, s);
				if(isLegal(x,y)){
					s.move(x, y);
					ateFood = tryEatFood(x,y);
					ateFood = false;
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}
		return false;
	}
	
	private boolean tryEatFood(int x, int y){
		if(x == food.getX() && y == food.getY()){
			Snake s = snakes.get(snakes.size()-1);
			snakes.add(new Snake(s.getX(),s.getY()));
			generateFood();
			return true;
		}
		return false;
	}
	
	public void setup(){
		size(size*50,size*50);
	}
}