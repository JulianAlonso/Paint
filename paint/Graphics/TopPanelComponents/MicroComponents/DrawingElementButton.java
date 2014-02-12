

package paint.Graphics.TopPanelComponents.MicroComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import paint.Res.DrawElement;
import paint.Res.DrawElementEnum;

/**
 *
 * @author julialonso
 */
public class DrawingElementButton extends JButton {
    
    private DrawElementEnum type;
    
    public DrawingElementButton(ImageIcon icon, DrawElementEnum type) {
        super(icon);
        this.type = type;
        setListener();
    }
    
    private void setListener() {
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawElement.setDrawElement(type);
            }
        });
    }
    
}
