package game;

import java.awt.Color;
import java.awt.Graphics;
import java.time.Duration;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    private Thread thread;
    private boolean running = false;

    private static final int FPS = 100;
    private static final long FRAME_TIME = 1000000000/FPS;

    private Hero hero = new Hero(400,300);

    public GamePanel(){
        setBackground(Color.BLACK);
    }
    public void run(){
        while(running){
            long startTime = System.nanoTime();

            update();
            render();

            long elapsedTime = System.nanoTime()-startTime;
            long sleepTime = (FRAME_TIME-elapsedTime);
            if(sleepTime>0){
                try {
                    Thread.sleep(Duration.ofNanos(sleepTime));
                } 
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void startGameThread(){
        thread = new Thread(this);
        running = true;
        thread.start();
    }
    private void update(){

    }
    private void render(){
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(hero.getX(),hero.getY(),hero.getWidth(),hero.getHeight());
    }
}
