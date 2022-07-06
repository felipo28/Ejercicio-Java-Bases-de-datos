package modelo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class claseImagenMySQL extends javax.swing.JPanel{
    BufferedImage ruta;
    
    public claseImagenMySQL(int x, int y, BufferedImage ruta){
        this.setSize(x,y);
        this.ruta = ruta;
    }
    
    public void paint (Graphics g){
        Dimension height = getSize();
        BufferedImage img = ruta;
        
        g.drawImage(img, 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
