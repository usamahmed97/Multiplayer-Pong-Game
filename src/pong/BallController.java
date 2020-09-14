//this is the handler class
package pong;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BallController implements Runnable {

   BallView BallViewObj;
   Dimension d;
   int screenWidth;
   int screenHieght;
   int minX, minY, maxX,maxY;
   boolean right=false, left=true, up=true, down=false;
   int xSpeed=1;
   int ySpeed=1;
   Dimension s;

    public BallController(BallView obj) {
    BallViewObj=obj;
    d=Toolkit.getDefaultToolkit().getScreenSize();
    screenWidth=d.width;
    screenHieght=d.height;
    
    minX=0;
    minY=0;
    
    maxX=screenWidth;
    maxY=screenHieght;
   
    }
 
    @Override
    public void run() {
        while(true)
        {
            if(right)
            {
                if(BallViewObj.BallObj.getx()>=BallViewObj.rightBar.getXx()&& BallViewObj.BallObj.gety()>=BallViewObj.rightBar.getYy())
                {
                    xSpeed=-xSpeed;
                right=false;
                left=true;
                }
            }
            if(left)
            {}
            if(up)
            {}
            if(down)
            {}
            
            
            
            
            BallViewObj.repaint();
            
            
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(BallController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
}
