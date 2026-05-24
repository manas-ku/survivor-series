package game;

public class Hero {
    private int x,y;
    private int width=10, height=10;
    private int health=100;
    private int speed=5;
    
    public Hero(){

    }
    public Hero(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
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
}
