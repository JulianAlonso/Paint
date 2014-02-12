

package paint.Graphics;

import javax.swing.JPanel;
import paint.Graphics.TopPanelComponents.ButtonsPanel;

/**
 *
 * @author julialonso
 */
public class TopPanel  extends JPanel {
    
    private ButtonsPanel buttonsPanel;
    
    public TopPanel() {
        initComponents();
        addComponents();
    }
    
    private void initComponents() {
        this.buttonsPanel = new ButtonsPanel();
    }
    
    private void addComponents() {
        this.add(this.buttonsPanel);
    }
}
