package wiedermann;
import java.awt.*;
public abstract class Figuren {
    private int x;
    private int y;
    private Color farbe;
    //Konstruktor
    public Figuren(int x, int y, Color farbe) {
        this.x = x;
        this.y = y;
        this.farbe = farbe;
    }
    abstract void draw(Graphics grafik);

    public String toString(String text){
        return null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }
}
