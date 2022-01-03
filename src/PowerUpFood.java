import java.awt.*;

public class PowerUpFood extends Food {

    public Point position;

    public PowerUpFood(int x,int y,int type){
        super(x, y);
        this.type = type;
    }

    public int type; //0-4

}
