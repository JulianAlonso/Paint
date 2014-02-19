/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import paint.Graphics.PaintZone;
import paint.Graphics.EastPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import paint.Graphics.TopPanel;
import paint.Graphics.WestPanel;

/**
 *
 * @author julialonso
 */
public class Paint {
    
    private static void createAndShowGUI() {  
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(800, 600));
        f.setLayout(new BorderLayout());
        //ADS ////////////////////////////////////////////
        f.add(new EastPanel(), BorderLayout.EAST);
        f.add(new PaintZone(), BorderLayout.CENTER);
        f.add(new TopPanel(), BorderLayout.NORTH);
        f.add(new WestPanel(), BorderLayout.WEST);
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
}
