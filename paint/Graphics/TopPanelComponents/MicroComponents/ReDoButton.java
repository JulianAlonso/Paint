

package paint.Graphics.TopPanelComponents.MicroComponents;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import paint.Res.Listeners;

/**
 *
 * @author julialonso
 */
public class ReDoButton extends JButton {
    
    public ReDoButton(ImageIcon icon) {
        super(icon);
        
        this.addActionListener(Listeners.getRedoListener());
    }
    
}
