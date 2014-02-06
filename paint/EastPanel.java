

package paint;

import paint.EastPanelComponents.ColorSelectionPanel;
import paint.EastPanelComponents.ColorModeSelectionPanel;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author julialonso
 */
public class EastPanel extends JPanel {
    
    private ColorSelectionPanel csp;
    private ColorModeSelectionPanel cmsp;
    
    public EastPanel() {
        super(new BorderLayout());
        
        generaComponentes();
        addComponents();
    }
    
    private void generaComponentes() {
        this.csp = new ColorSelectionPanel();
        this.cmsp = new ColorModeSelectionPanel();
    }
    
    private void addComponents() {
        this.add (cmsp, BorderLayout.NORTH);
        this.add (csp, BorderLayout.CENTER);
    }
    
}
