package wiedermann;

import java.awt.*;

public class Zeichnen extends Figuren{
    private Figuren[] array;
    //Konstruktor
    public Zeichnen(int x, int y, Color farbe, Figuren[] array) {
        super(x, y, farbe);
        this.array = array;
    }

    @Override
    void draw(Graphics grafik) {
        this.array = new Figuren[5];
        //this.array[0] =
    }
}