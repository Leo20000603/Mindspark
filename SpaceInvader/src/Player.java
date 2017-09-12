import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Player extends MovingImage{
	
	private int vX;
	private int vY;
	private int hp;
	private boolean dead;
	
	public Player(PImage image,int x, int y, int width, int height){
		super(image,x,y,width,height);
		vX = 0;
		vY = 0;
		hp = 20;
		dead = false;
	}
	
	public Bullet shoot(){
		return new Bullet(DrawingSurface.getBullet(),(int)(this.getX()),(int)this.getY()-50,25,25,"player");
	}
	
	public void setvX(int x){
		vX = x;
	}
	
	public void setvY(int y){
		vY = y;
	}
	
	public void loseHP(){
		hp--;
		if(hp<=0){
			die();
		}
	}
	
	private void die(){
		dead = true;
	}
	
	public boolean isDead(){
		return dead;
	}
	
	public String toString(){
		return "player";
	}
	
	public void draw(PApplet marker){
		super.draw(marker);
		marker.fill(0, 255, 0);
		marker.rect((float)this.getX(), (float)(this.getCenterY()+15), (float)(40*hp/20.0), 10f);
	}
	
	public MovingImage act(ArrayList<MovingImage> list){
		if(this.getY()<DrawingSurface.HEIGHT/2 && vY<0){
			for (MovingImage m: list){
				m.moveByAmount(0, -vY);
			}
		}else{
			this.moveByAmount(vX, vY);
			if(!isInWindow()){
				this.moveByAmount(-vX, -vY);
			}
		}
		for(MovingImage s:list){
			if(this.intersects(s)){
				return s;
			}
		}
		return null;
		
		
	}

}
