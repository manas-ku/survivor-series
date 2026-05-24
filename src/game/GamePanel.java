package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Duration;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener{
    private Thread thread;
    private boolean running = false;

    private static final int FPS = 100;
    private static final long FRAME_TIME = 1000000000/FPS;

    private Hero hero = new Hero(400,300);

    private boolean wPressed=false, sPressed=false, aPressed=false, dPressed=false, spacePressed=false, shiftPressed=false;

    public GamePanel(){
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);
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
        int dx = 0;
        int dy = 0;
        if(wPressed){
            dy-=hero.getSpeed();
        }
        if(sPressed){
            dy+=hero.getSpeed();
        }
        if(aPressed){
            dx-=hero.getSpeed();
        }
        if(dPressed){
            dx+=hero.getSpeed();
        }
        hero.move(dx,dy);
    }


    private void render(){
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(hero.getX(),hero.getY(),hero.getWidth(),hero.getHeight());
    }
    @Override
    public void keyTyped(KeyEvent e) {
        //
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W){
            wPressed = true;
        }
        else if(e.getKeyCode()==KeyEvent.VK_S){
            sPressed = true;
        }
        else if(e.getKeyCode()==KeyEvent.VK_D){
            dPressed = true;
        }
        else if(e.getKeyCode()==KeyEvent.VK_A){
            aPressed = true;
        }
        else if(e.getKeyCode()==KeyEvent.VK_SHIFT){
            shiftPressed = true;
        }
        else if(e.getKeyCode()==KeyEvent.VK_SPACE){
            spacePressed = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W){
            wPressed = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_S){
            sPressed = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_D){
            dPressed = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_A){
            aPressed = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_SHIFT){
            shiftPressed = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_SPACE){
            spacePressed = false;
        }
    }
}
