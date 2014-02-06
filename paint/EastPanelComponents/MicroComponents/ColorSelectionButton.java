

package paint.EastPanelComponents.MicroComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import paint.EastPanelComponents.Colors;

/**
 *
 * @author julialonso
 */
public class ColorSelectionButton extends JButton {
    
    private Color color;
    
    public ColorSelectionButton(Color color) {
        super();
        
        this.setPreferredSize(new Dimension(40, 40));
        this.setBackground(color);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setOpaque(true);
        this.color = color;
        this.addActionListener(getListener());
    }
    
    private ActionListener getListener() {
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Colors.setSelectedColor(color);
            }
        };
    }
    
}
