import java.awt.*;

public class Wall extends GameObject{
    int sizeX;
    int sizeY;
    public Wall(int x, int y, ID id, int sx, int sy, Boolean vis){
        super(x, y, id, vis);
        sizeX = sx;
        sizeY = sy;
    }
    public void tick(){}
    public void render(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,sizeX,sizeY);
    }
}
