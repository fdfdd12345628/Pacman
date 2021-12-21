public class GhostData {
    private int x;
    private int y;
    private ghostType type;

    public GhostData(int x,int y,ghostType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ghostType getType() {
        return type;
    }

}


