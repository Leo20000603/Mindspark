import java.util.ArrayList;

import processing.core.PImage;

public class Bullet extends MovingImage{
	
	private String owner;

	public Bullet(PImage img, int x, int y, int w, int h, String owner) {
		super(img, x, y, w, h);
		this.owner = owner;
	}
	
	public String toString(){
		return "bullet";
	}
	
	public MovingImage act(ArrayList<MovingImage> list){
		if(owner == "player"){
			this.moveByAmount(0, -12);
		}else{
			this.moveByAmount(0, 10);
		}
		if(!this.isInWindow()){
			return this;
		}
		for(MovingImage m : list){
			if(this!=m && this.intersects(m) &&! this.owner.equals(m.toString())&& !(m instanceof Bullet)){
				return m;
			}
		}
		return null;
		
	}

}
