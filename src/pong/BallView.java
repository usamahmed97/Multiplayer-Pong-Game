//this is the graphics class.

package pong;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JPanel;



public class BallView extends JPanel{
 Ball BallObj;
 Bar leftBar, rightBar;
 
 int screenWidth, screenHieght;
    public BallView() {
    
        initializeBall();
    }
    
    void initializeBall()
    {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int xx =(int) ((Math.random()*1000)%d.height -0); 
            int yy =(int) ((Math.random()*1000)%d.width-200); 
        
        
         screenWidth=d.width;
         screenHieght=d.height;
        Ball ballObj=new Ball(xx, yy);
        leftBar=new Bar(20,50 );
        rightBar=new Bar(d.width-30-30,d.height-120-120);
        
        
        
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    grphcs.setColor(Color.red);
    grphcs.drawOval(BallObj.getx(), BallObj.gety(), screenWidth, screenHieght);
    grphcs.fillOval(BallObj.getx(), BallObj.gety(), screenWidth, screenHieght);
    
    
    grphcs.drawRect(leftBar.getXx(), leftBar.getYy(), 30, 100);
    grphcs.fillRect(leftBar.getXx(), leftBar.getYy(), 30, 100);
    grphcs.setColor(Color.BLACK);
    
    grphcs.drawRect(rightBar.getXx(), rightBar.getYy(), 30, 100);
    grphcs.fillRect(rightBar.getXx(), rightBar.getYy(), 30, 100);
    grphcs.setColor(Color.BLACK);
    
    
    }
    
    
}
