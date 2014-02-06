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

/**
 *
 * @author julialonso
 */
public class Paint {
    
    private static void createAndShowGUI() {
        System.out.println("Created Gui on EDT? " +
                SwingUtilities.isEventDispatchThread());
        
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(800, 600));
        f.setLayout(new BorderLayout());
        f.add(new EastPanel(), BorderLayout.EAST);
        f.add(new PaintZone(), BorderLayout.CENTER);
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
