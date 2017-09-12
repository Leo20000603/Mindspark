import java.util.ArrayList;

import processing.core.PImage;

public class Enemy extends MovingImage{
	
	private int vX;
	private int vY;
	private int counter;
	
	public Enemy(PImage image,int x, int y, int width, int height){
		super(image,x,y,width,height);
		vX = 0;
		vY = 0;
		counter = 0;
	}
	
	public String toString(){
		return "enemy";
	}
	
	public Bullet shoot(){
		return new Bullet(DrawingSurface.getBullet(),(int)this.getX(),(int)this.getY()+50,25,25,"enemy");
	}
	
	public void setvX(int x){
		vX = x;
	}
	
	public void setvY(int y){
		vY = y;
	}
	
	public MovingImage act(ArrayList<MovingImage> list){		
		if(counter%70==0){
			list.add(shoot());
		}else if(counter%20==0){
			vY = (int)(Math.random()*10+5);
			vX = (int)(Math.random()*10+10);
			double dir = Math.random();
			if(dir<0.5){
				this.moveByAmount(-vX, vY);
			}else{
				this.moveByAmount(vX, vY);
			}
		}
		counter++;
		if(!this.isInWindow()){
			return this;
		}	
		return null;
	}
	
}
