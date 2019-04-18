import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
public class Player extends GameObject{
    Random r = new Random();
    public Player(int x, int y, ID id, Boolean vis){
        super(x, y, id, vis);

    }
    public void tick(){
        x+= spdX;
        y+= spdY;
    }
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x,y,32,32);
    }
}

