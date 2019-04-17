import java.awt.Graphics;
public abstract class GameObject {

    protected int x, y;
    protected ID id;
    protected int spdX, spdY;

    public GameObject(int x, int y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setId(ID id){
        this.id = id;
    }
    public ID getId(){
        return this.id;
    }
    public void setSpdX(int x){
        this.spdX = x;
    }
    public void setSpdY(int y){
        this.spdY = y;
    }
    public int getSpdX(){
        return this.spdX;
    }
    public int getSpdY(){
        return this.spdY;
    }
}

