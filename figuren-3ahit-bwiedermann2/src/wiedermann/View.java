package wiedermann;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    private Figuren[] button;
    private JLabel xKo, yKo;
    //Konstruktor
    public View (){
        this.setSize(new Dimension(400, 600));
        this.setDefaultCloseOperation(3);

        this.button = new Figuren[5];
        this.xKo = new JLabel("x-Koordinaten");
        this.yKo = new JLabel("y-Koordinaten");



        this.setVisible(true);
    }

    public static void main(String[] args) {
        new View();
    }
}
