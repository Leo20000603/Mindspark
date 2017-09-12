import java.awt.event.KeyEvent;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet{
	
	private PImage bg;
	public static final int WIDTH = 1080;
	public static final int HEIGHT = 750;
	
	private static PImage bullet;
	private static PImage enemy;
	private Player p1;
	private ArrayList<MovingImage> list;
	private int spawnRate;
	private int score;
	
	public DrawingSurface(){
		bg = loadImage("assets\\space.jpg");
		bg.resize(WIDTH, HEIGHT);
		PImage p = loadImage("assets\\player.jpg");
		p1 = new Player(p,270,650,40,40);
		list = new ArrayList<MovingImage>();
		list.add(new Enemy(loadImage("assets\\images.png"),270,0,40,40));
		bullet = loadImage("assets\\images.png");
		enemy = loadImage("assets\\images.png");
		list.add(p1);
		spawnRate = 0;
		score = 0;
	}
	
	public static PImage getBullet(){
		return bullet;
	}
	
	public void setup(){
		size(WIDTH,HEIGHT);
		this.frameRate(60);
	}
	
	public void draw(){
		background(255,255,255);
		this.image(bg, 0, 0);
		for(MovingImage m: list){
			m.draw(this);
		}
		textSize(30);
		fill(200);
		this.text("Score: "+score, WIDTH-200, 40);
		if(!p1.isDead()){
			runGame();
		}
		else{
			textSize(30);
			fill(255,0,0);
			this.text("You are DEAD", WIDTH/2-100, HEIGHT/2);
		}
	}
	
	public void spawnEnemy(){
		for(int i = 1;i<=5;i++){
			int x = (int)(Math.random()*200+i*200);
			list.add(new Enemy(enemy,x,0,40,40));
		}
	}
	
	public void runGame(){
		if(list.size()<3){
			spawnEnemy();
		}
		spawnRate++;
		if(spawnRate %400 == 0){
			spawnEnemy();
		}
		for(int i = 0;i<list.size();i++){
			MovingImage image = list.get(i);
			MovingImage y = image.act(list);
			if(y!=null){
				if(y instanceof Bullet){
					if(image instanceof Player){
						((Player) image).loseHP();
					}
					list.remove(y);
					i--;
				}else if(image instanceof Bullet){
					if(y instanceof Player){
						((Player) y).loseHP();
						list.remove(image);
						i--;
					}else{
						list.remove(y);
						i--;
						list.remove(image);
						i--;
						score++;
					}
				}else if(image instanceof Player && y instanceof Enemy){
					list.remove(y);
					((Player)image).loseHP();
					i--;
				}else if (image == y && y instanceof Enemy){
					list.remove(y);
					i--;
				}
			}
		}
	}
	
	public void keyPressed(){
		if(keyCode == KeyEvent.VK_W) {
			p1.setvY(-8);
		}
		else if(keyCode == KeyEvent.VK_A) {
			p1.setvX(-8);;
		}
		else if(keyCode == KeyEvent.VK_S) {
			p1.setvY(8);
		}
		else if(keyCode == KeyEvent.VK_D) {
			p1.setvX(8);
		}else if(keyCode == KeyEvent.VK_1) {
			spawnEnemy();
		}else if(keyCode == KeyEvent.VK_SPACE){
			list.add(p1.shoot());
		}
	}
	
	public void keyReleased(){
		if(keyCode == KeyEvent.VK_W) {
			p1.setvY(0);
		}
		else if(keyCode == KeyEvent.VK_A) {
			p1.setvX(0);
		}
		else if(keyCode == KeyEvent.VK_S) {
			p1.setvY(0);
		}
		else if(keyCode == KeyEvent.VK_D) {
			p1.setvX(0);
		}
	}

}
