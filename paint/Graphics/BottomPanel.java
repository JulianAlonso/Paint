/*
 * To change BottomPanel template, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.Graphics;

import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class BottomPanel extends JPanel{
    
    private static JLabel coordinatex, coordinatey;
    private static JLabel coordinatexLabel, coordinateyLabel;
    
    public BottomPanel() {
        initComponents();
        addComponents();
    }
    
    public static void setCoordinates(Point p) {
        BottomPanel.coordinatex.setText(String.valueOf(p.x));
        BottomPanel.coordinatey.setText(String.valueOf(p.y));
    }
    
    private void initComponents() {
        BottomPanel.coordinatexLabel = new JLabel("Coordinate X:");
        BottomPanel.coordinateyLabel = new JLabel("Coordinate Y:");
        
        BottomPanel.coordinatex = new JLabel("0");
        BottomPanel.coordinatey = new JLabel("0");
        
        //BottomPanel.coordinatexLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //BottomPanel.coordinateyLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    private void addComponents() {
        add(BottomPanel.coordinatexLabel);
        add(BottomPanel.coordinatex);
        add(BottomPanel.coordinateyLabel);
        add(BottomPanel.coordinatey);
    }
    
}
