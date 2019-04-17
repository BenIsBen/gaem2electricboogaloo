import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private Handler handler;
    private boolean uP = false;
    private boolean dP = false;
    private boolean lP = false;
    private boolean rP = false;
    public KeyInput(Handler handler){
        this.handler = handler;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        for(int i = 0; i < handler.object.size(); i++){
            GameObject tempObj = handler.object.get(i);
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) {
                    uP = true;
                    tempObj.setSpdY(-5);
                }
            }
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_A) {
                    lP = true;
                    tempObj.setSpdX(-5);
                }
            }
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_S) {
                    dP = true;
                    tempObj.setSpdY(5);
                }
            }
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_D) {
                    rP = true;
                    tempObj.setSpdX(5);
                }
            }
        }
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        for(int i = 0; i < handler.object.size(); i++) {
            GameObject tempObj = handler.object.get(i);
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) {
                    uP = false;
                    if (dP) {
                        tempObj.setSpdY(5);
                    } else {
                        tempObj.setSpdY(0);
                    }
                }
            }
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_S) {
                    dP = false;
                    if (uP) {
                        tempObj.setSpdY(-5);
                    } else {
                        tempObj.setSpdY(0);
                    }
                }
            }
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_A) {
                    lP = false;
                    if (rP) {
                        tempObj.setSpdX(-5);
                    } else {
                        tempObj.setSpdX(0);
                    }
                }
            }
            if(tempObj.getId() == ID.Player) {
                if (key == KeyEvent.VK_D) {
                    rP = false;
                    if (lP) {
                        tempObj.setSpdX(5);
                    } else {
                        tempObj.setSpdX(0);
                    }
                }
            }
        }
    }
}
