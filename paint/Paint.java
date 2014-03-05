/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import paint.Graphics.PaintZone;
import paint.Graphics.EastPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import paint.Graphics.BottomPanel;
import paint.Graphics.TopPanel;
import paint.Graphics.WestPanel;

/**
 *
 * @author julialonso
 */
public class Paint {

    private static EastPanel east = new EastPanel();
    private static PaintZone paint = new PaintZone();
    private static TopPanel top = new TopPanel();
    private static WestPanel west = new WestPanel();
    private static BottomPanel bottom = new BottomPanel();

    private static void createAndShowGUI() {
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(800, 600));
        f.setLayout(new BorderLayout());
        //ADS ////////////////////////////////////////////
        f.add(east, BorderLayout.EAST);
        f.add(paint, BorderLayout.CENTER);
        f.add(top, BorderLayout.NORTH);
        f.add(west, BorderLayout.WEST);
        f.add(bottom, BorderLayout.SOUTH);
        //END ADDS ///////////////////////////////////////
        f.pack();
        f.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void repaint() {
        paint.paintComponents(paint.getGraphics());
        
    }
    
    public static JPanel getPaint() {
        return paint;
    }
}
