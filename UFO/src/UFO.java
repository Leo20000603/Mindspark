public class UFO {
    //Fields
    int x;
    int y;
    double speed;
    double maxSpeed;
    String color;
   
 
 
    //Constructor
    public UFO() {
        x = 0;
        y = 0;
        speed = 0.004;
        maxSpeed = 2.4;
        color = "Purple";
    }
 
    public UFO(int x, int y, int speed, int maxSpeed, String color) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }
 
    public void land() {
        speed = 0;
    }
 
    public void fly(int amount) {
        x = x + amount;
    }
 
    public double getX() {
        return this.x;
    }
 
    public boolean isFlying() {
        if(y <= 0) {
          return false;
       } else {
          return true;
       }
    }
}