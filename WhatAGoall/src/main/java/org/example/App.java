package org.example;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       JFrame window= new JFrame();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setResizable(true);
       window.setTitle("What a Goal!");

       GamePanel gamePanel = new GamePanel();
       window.add(gamePanel);

       window.pack();

       window.setLocationRelativeTo(null);
       window.setVisible(true);

       gamePanel.setupGame();
       gamePanel.startGameThread();
    }
}
