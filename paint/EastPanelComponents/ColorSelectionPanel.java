

package paint.EastPanelComponents;

import paint.EastPanelComponents.MicroComponents.ColorSelectionButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author julialonso
 */
public class ColorSelectionPanel extends JPanel {
    
    public static Color selectedColor;
    
    private Color[] colors = {Color.BLACK, Color.WHITE, Color.RED, Color.BLUE,
                              Color.MAGENTA, Color.ORANGE, Color.GREEN, Color.PINK};
    
    private ArrayList<ColorSelectionButton> botones = new ArrayList<>();
    
    public ColorSelectionPanel() {
        super(new GridLayout(4, 2));
                
        generaButtons();
        addButtons();
        this.validate();
        this.setVisible(true);
    }
    
    
    private void addButtons() {
        for (ColorSelectionButton csb: botones) {
            this.add(csb);
        }
    }
    
    private void generaButtons() {
        ColorSelectionButton csb;
        for(Color color: colors) {
            csb = new ColorSelectionButton(color);
            botones.add(csb);
        }
    }
    
}
