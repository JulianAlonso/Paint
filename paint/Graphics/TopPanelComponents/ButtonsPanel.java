

package paint.Graphics.TopPanelComponents;

import java.awt.GridLayout;
import javax.swing.JPanel;
import paint.Graphics.TopPanelComponents.MicroComponents.DrawingElementButton;
import paint.Res.DrawElementEnum;
import paint.Res.Images;

/**
 *
 * @author julialonso
 */
public class ButtonsPanel extends JPanel {
    
    private DrawingElementButton line, arc, rectangle, curvedRectangle;
    
    public ButtonsPanel() {
        super(new GridLayout(1, 4));
        initComponents();
        addComponents();
    }
    
    private void initComponents() {
        this.line = new DrawingElementButton(
                Images.LINE, DrawElementEnum.LINE);
        this.arc = new DrawingElementButton(
                Images.ARC, DrawElementEnum.ARC);
        this.rectangle = new DrawingElementButton(
                Images.RECTANGLE, DrawElementEnum.RECTANGLE);
        this.curvedRectangle = new DrawingElementButton(
                Images.RECTANGLE_CURVED, DrawElementEnum.CURVED_RECTANGLE);
    }
    
    private void addComponents() {
        this.add(this.line);
        this.add(this.arc);
        this.add(this.rectangle);
        this.add(this.curvedRectangle);
    }
    
}
