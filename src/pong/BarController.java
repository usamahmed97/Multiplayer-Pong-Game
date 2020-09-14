//this is the ball
package pong;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class BarController implements KeyListener, Runnable {
    
   Bar barObj;
   BallView ballViewObj;
   int maxHieght;
   int minHieght;
    public BarController(BallView obj) {
   ballViewObj=obj;
   Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
   minHieght=0;
   maxHieght=d.height;
    }
  
    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    
        switch(ke.getExtendedKeyCode())
        {
            case 38: // up arrow key
            {
                if(ballViewObj.rightBar.getYy()>=minHieght)
                {
                    ballViewObj.rightBar.setYy(ballViewObj.rightBar.getYy()-30);
                    ballViewObj.repaint();
                }
                break;
            }
            case 40: //down arrow key
            {
                 if(ballViewObj.rightBar.getYy()<=maxHieght)
                {
                    ballViewObj.rightBar.setYy(ballViewObj.rightBar.getYy()+30);
                    ballViewObj.repaint();
                }
                 break;
            }
            
            
            case 68:
            { //d 68
             
             
                 if(ballViewObj.leftBar.getYy()<=maxHieght)
                {
                    ballViewObj.leftBar.setYy(ballViewObj.leftBar.getYy()+30);
                    ballViewObj.repaint();
                }
                 break;
            }  
            case 69:
            {//e 69
                 if(ballViewObj.leftBar.getYy()>=minHieght)
                {
                    ballViewObj.leftBar.setYy(ballViewObj.leftBar.getYy()-30);
                    ballViewObj.repaint();
                }
                 break;
            }
        }
    
    }

    

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
