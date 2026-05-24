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

    public void move(int dx, int dy){
        x=x+dx;
        y=y+dy;
        if(x<0){
            x=0;
        }
        if(x>780-width){
            x=780-width;
        }
        if(y<0){
            y=0;
        }
        if(y>560-height){
            y=560-height;
        }
    }
}
