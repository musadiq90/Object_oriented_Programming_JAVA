/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FlappyBird;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author User
 */
public class GamePlay implements ActionListener, KeyListener {
    boolean flg;
    String msg,imsg;
    InetAddress iad;
    int port;
    Exception exob;
    ServerSocket ss;
    Socket s;
    InputStream ips;
    OutputStream ops;
    conect cnt;
    Label lb1;
    Button bt;

    public static final int FPS = 60, WIDTH = 640, HEIGHT = 480;

    private Bird bird;
    private JFrame frame;
    private JPanel panel;
    private ArrayList<Rectangle> rects;
    private int time, scroll;
    private Timer t;
    private int counter=0;

    private boolean IsPaused;
    public void init()
    {

    }
    public void go() {
        GamePlay sob=new GamePlay();
        try
        {
            iad= InetAddress.getLocalHost(); // get the local host

        }
        catch(Exception e){
            System.out.println(e);
        }
        lb1=new Label("Server : "+iad.getHostName()+" ["+iad.getHostAddress()+"]");
        bt = new Button("connect");

        cnt=new conect(this);











        frame = new JFrame("Flappy Bird");
        sob.frame=frame;
        //t.start();
        bird = new Bird();
        rects = new ArrayList<Rectangle>();
        panel = new Interface(this, bird, rects);
        frame.add(panel);

        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addKeyListener(this);

        IsPaused= true;

        t = new Timer(1000/FPS, this);
        t.start();
    }
    public static void main(String[] args) {
        new GamePlay().go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.repaint();
        if(!IsPaused) {
            bird.physics();
            if(scroll % 90 == 0) {
                Rectangle r = new Rectangle(WIDTH, 0, Interface.PIPE_W, (int) ((Math.random()*HEIGHT)/5f + (0.2f)*HEIGHT));
                int h2 = (int) ((Math.random()*HEIGHT)/5f + (0.2f)*HEIGHT);
                Rectangle r2 = new Rectangle(WIDTH, HEIGHT - h2, Interface.PIPE_W, h2);
                rects.add(r);
                rects.add(r2);
            }
            ArrayList<Rectangle> toRemove = new ArrayList<Rectangle>();
            boolean game = true;
            for(Rectangle r : rects) {
                r.x-=3;
                if(r.x + r.width <= 0) {
                    toRemove.add(r);
                    System.out.println((int)(counter++/2));
                }
                if(r.contains(bird.x, bird.y)) {
                    JOptionPane.showMessageDialog(frame, "You lose!\n"+"Your score was: "+time+".");
                    game = false;
                }
            }
            rects.removeAll(toRemove);
            time++;
            scroll++;

            if(bird.y > HEIGHT || bird.y+bird.RAD < 0) {
                JOptionPane.showMessageDialog(frame, "You lose!\n"+"Your score was: "+time+".");
                game = false;

            }

            if(!game) {
                rects.clear();
                bird.reset();
                time = 0;
                scroll = 0;
                IsPaused = true;
            }
        }
        else {

        }
    }

    public int getScore() {
        return time;
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP) {
            bird.jump();
        }
        else if (e.getKeyCode()==KeyEvent.VK_U){

        }
        else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
            IsPaused = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_S){
            IsPaused = true;
        }

    }
    public void keyReleased(KeyEvent e) {

    }
    public void keyTyped(KeyEvent e) {

    }

    public boolean paused() {
        return IsPaused;
    }
}


class conect implements Runnable
{
    GamePlay sob;
    Thread t;
    //dialog dob;
    String msg;
    Exception exc;
    byte bt[];
    conect(GamePlay isob)
    {
        sob=isob;
    }

    public void run()
    {
        try
        {
            msg="Port is Already in Use.";
            exc=new Exception(msg);


            sob.ss=new ServerSocket(sob.port);

            sob.s=sob.ss.accept();



            sob.ops=sob.s.getOutputStream();
            sob.ips=sob.s.getInputStream();
            sob.flg=true;
            msg="IO Exception Occured.";
            exc=new Exception(msg);
            while(sob.flg)
            {
                try
                {
                    bt=new byte[100];
                    sob.ips.read(bt);
                    //sob.ta1.append("Client :  "+new String(bt)+"\n");
                }
                catch(Exception ex)
                {
                    sob.flg=false;


                }
            }
        }
        catch(Exception ex)
        {
            sob.flg=false;

        }
    }
}