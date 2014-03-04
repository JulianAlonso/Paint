

package paint.Graphics.TopPanelComponents.MicroComponents;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import paint.Res.Listeners;

/**
 *
 * @author julialonso
 */
public class UnDoButton extends JButton {
    
    public UnDoButton(ImageIcon icon) {
        super(icon);
        
        this.addActionListener(Listeners.getUndoListener());
    }
}
