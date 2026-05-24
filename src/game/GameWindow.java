package game;

import java.awt.Color;

import javax.swing.JFrame;

public class GameWindow {
    JFrame frame;
    GamePanel panel = new GamePanel();
    public GameWindow(){
        frame = new JFrame("Survivor Series");
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.add(panel);

        panel.startGameThread();

        frame.setVisible(true);
    }
}
