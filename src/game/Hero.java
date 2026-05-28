package game;

public class Hero {
    private float x,y;
    private int width=10, height=10;
    private int health=100;
    private int speed=5;
    
    public Hero(){

    }

    public Hero(float x, float y){
        this.x = x;
        this.y = y;
    }


    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getHealth(){
        return health;
    }
    public int getSpeed(){
        return speed;
    }

    public void move(float dx, float dy){
        x=x+dx;
        y=y+dy;
    }
}
