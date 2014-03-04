

package paint.Graphics.TopPanelComponents;

import java.awt.GridLayout;
import javax.swing.JPanel;
import paint.Graphics.TopPanelComponents.MicroComponents.DrawingElementButton;
import paint.Graphics.TopPanelComponents.MicroComponents.ReDoButton;
import paint.Graphics.TopPanelComponents.MicroComponents.UnDoButton;
import paint.Res.DrawElementEnum;
import paint.Res.Images;

/**
 *
 * @author julialonso
 */
public class ButtonsPanel extends JPanel {
    
    private DrawingElementButton line, arc, rectangle, curvedRectangle,
                                 freeLine, polygon;
    
    private ReDoButton redoButton;
    private UnDoButton undoButton;
    
    public ButtonsPanel() {
        super(new GridLayout(1, 5));
        initComponents();
        addComponents();
    }
    
    private void initComponents() {
        this.freeLine = new DrawingElementButton(
                Images.PENCIL, DrawElementEnum.FREELINE);
        this.line = new DrawingElementButton(
                Images.LINE, DrawElementEnum.LINE);
        this.arc = new DrawingElementButton(
                Images.ARC, DrawElementEnum.ARC);
        this.rectangle = new DrawingElementButton(
                Images.RECTANGLE, DrawElementEnum.RECTANGLE);
        this.curvedRectangle = new DrawingElementButton(
                Images.RECTANGLE_CURVED, DrawElementEnum.CURVED_RECTANGLE);
        this.polygon = new DrawingElementButton(
                Images.POLYGON, DrawElementEnum.POLYGON);
        
        
        this.redoButton = new ReDoButton(Images.REDO);
        this.undoButton = new UnDoButton(Images.UNDO);
    }
    
    private void addComponents() {
        this.add(this.undoButton);
        this.add(this.redoButton);
        this.add(this.freeLine);
        this.add(this.line);
        this.add(this.arc);
        this.add(this.polygon);
        this.add(this.rectangle);
        this.add(this.curvedRectangle);
    }
    
}
