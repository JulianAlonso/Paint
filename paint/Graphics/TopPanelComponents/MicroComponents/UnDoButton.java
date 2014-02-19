

package paint.Graphics.TopPanelComponents.MicroComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import paint.Res.Forms;

/**
 *
 * @author julialonso
 */
public class UnDoButton extends JButton {
    
    public UnDoButton(ImageIcon icon) {
        super(icon);
        
        this.addActionListener(actionListener);
    }
    
    private ActionListener getListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Forms.undoForm();
            }
        };
    }
}
