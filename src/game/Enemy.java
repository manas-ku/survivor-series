package game;
public class Enemy {
    private float x;
    private float y;
    private Hero hero;
    private int height=20;
    private int width=20;
    private int speed=3;
    private int health=10;
    private int damage=5;
    private boolean boss=false;
    private int xp=1;

    public Enemy(float x, float y, Hero hero){
        this.x = x;
        this.y =y;
        this.hero = hero;
    }

    public void move(){
        float relHeroX = hero.getX() - x;
        float relHeroY = hero.getY() - y;
        float displacementX = (relHeroX/(float)(Math.sqrt(relHeroY*relHeroY + relHeroX*relHeroX)))*speed;
        float displacementY = (relHeroY/(float)(Math.sqrt(relHeroY*relHeroY + relHeroX*relHeroX)))*speed;
        x+=displacementX;
        y+=displacementY;
    }



    //getters

    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getSpeed(){
        return speed;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public int getXp(){
        return xp;
    }
    public boolean isBoss(){
        return boss;
    }
}
