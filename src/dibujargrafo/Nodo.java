
package dibujargrafo;

import java.awt.Color;
import java.util.ArrayList;

public class Nodo {
    private int x;
    private int y;
    private int d;
    private Color color;
    private Character gen;
    private String name;
    private ArrayList<String> leng = new ArrayList<String>();

    public Nodo(int x, int y, int d, Color color, String name, Character gen, ArrayList<String> leng) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.color = color;
        this.gen = gen;
        this.name = name;
        this.leng = leng;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getD() {
        return d;
    }

    public Color getColor() {
        return color;
    }

    public Character getGen() {
        return gen;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getLeng() {
        return leng;
    }
    
    
    
    
}
