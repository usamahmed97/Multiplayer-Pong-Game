//this is the GUI class;
package pong;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class BallArena {
    
    JFrame frame1;
    BallView ballViewObj;
    BallController ballControllerObj;
    BarController barControllerObj;
    
    
    
    
    public BallArena()
    {System.out.println("Running Ball arena constructor");
     initGUI();}

public void initGUI()
{
    frame1=new JFrame("PONG GAME");
    frame1.setLayout(new BorderLayout());
    ballViewObj=new BallView();
    
    
    Container c=frame1.getContentPane();
        c.add(ballViewObj);
        frame1.add(ballViewObj);
        
        barControllerObj=new BarController(ballViewObj);
        frame1.addKeyListener(barControllerObj);
        
        ballControllerObj=new BallController(ballViewObj);
        Thread t=new Thread(ballControllerObj);
        t.start();
        
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int w, h;
    w=d.width;
    h=d.height;
    
        
         frame1.setLocation(0, 0);
         frame1.setSize(w,h);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}



}
