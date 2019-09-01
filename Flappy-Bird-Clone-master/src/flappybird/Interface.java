/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Interface extends JPanel {

    private Bird bird;
    private ArrayList<Rectangle> obs;
    private GamePlay fb;
    private Font scoreFont, pauseFont;
    public static final Color bg = new Color(2, 252, 194);
    public static final int PIPE_W = 50, PIPE_H = 30;
    private Image pipeHead, pipeLength;

    public Interface(GamePlay fb, Bird bird, ArrayList<Rectangle> obs) {
        this.fb = fb;
        this.bird = bird;
        this.obs = obs;
        scoreFont = new Font("Comic Sans MS", Font.BOLD, 20);
        pauseFont = new Font("Italic", Font.BOLD, 50);

        try {
        	pipeHead = ImageIO.read(new File("78px-Pipe.png"));
        	pipeLength = ImageIO.read(new File("pipe_part.png"));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(bg);
        g.fillRect(0,0,GamePlay.WIDTH,GamePlay.HEIGHT);
        bird.update(g);
        g.setColor(Color.RED);
        for(Rectangle r : obs) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.MAGENTA);
            //g2d.fillRect(r.x, r.y, r.width, r.height);
            AffineTransform old = g2d.getTransform();
            g2d.translate(r.x+PIPE_W/2, r.y+PIPE_H/2);
            if(r.y < GamePlay.HEIGHT/2) {
                g2d.translate(0, r.height);
                g2d.rotate(Math.PI);
            }
            g2d.drawImage(pipeHead, -PIPE_W/2, -PIPE_H/2, Interface.PIPE_W, Interface.PIPE_H, null);
            g2d.drawImage(pipeLength, -PIPE_W/2, PIPE_H/2, Interface.PIPE_W, r.height, null);
            g2d.setTransform(old);
        }
        g.setFont(scoreFont);
        g.setColor(Color.BLACK);
        g.drawString("Score: "+fb.getScore(), 10, 20);

        if(fb.paused()) {
            g.setFont(pauseFont);
            g.setColor(new Color(0,0,0,170));
            g.drawString("PAUSED", GamePlay.WIDTH/2-100, GamePlay.HEIGHT/2-100);
            g.drawString("PRESS SPACE TO START GAME", GamePlay.WIDTH/2-300, GamePlay.HEIGHT/2+50);
        }
    }
}
