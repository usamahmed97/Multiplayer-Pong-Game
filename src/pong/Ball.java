//this is the model class.
package pong;

public class Ball {
    int x,y;
    
    public Ball(int xx, int yy)
    {
        this.x=xx;
        this.y=yy;
    }
    
    public void setx(int xx)
    {
        this.x=xx;
    }
    
    public void sety(int yy)
    {
        this.y=yy;
    }
    
    public int getx()
    {
        return this.x;
    }
    
    public int gety()
    {
        return this.y;
    }
}
    
