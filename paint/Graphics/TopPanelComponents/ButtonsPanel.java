

package paint.Graphics.TopPanelComponents;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import paint.Graphics.TopPanelComponents.MicroComponents.DrawingElementButton;
import paint.Graphics.TopPanelComponents.MicroComponents.ReDoButton;
import paint.Graphics.TopPanelComponents.MicroComponents.UnDoButton;
import paint.Res.DrawElementEnum;
import paint.Res.Images;
import paint.Res.Listeners;

/**
 *
 * @author julialonso
 */
public class ButtonsPanel extends JPanel {
    
    private DrawingElementButton line, arc, rectangle, curvedRectangle,
                                 freeLine, polygon, oval, move, save, clear;
    
    private ReDoButton redoButton;
    private UnDoButton undoButton;
    
    public ButtonsPanel() {
        super(new GridLayout(1, 5));
        initComponents();
        addComponents();
    }
    
    private void initComponents() {
        this.save = new DrawingElementButton(
                Images.SAVE, DrawElementEnum.NOTINGH);
        this.save.addActionListener(Listeners.getSaveListener());
        this.move = new DrawingElementButton(
                Images.MOVE, DrawElementEnum.MOVE);
        this.freeLine = new DrawingElementButton(
                Images.PENCIL, DrawElementEnum.FREELINE);
        this.line = new DrawingElementButton(
                Images.LINE, DrawElementEnum.LINE);
        this.arc = new DrawingElementButton(
                Images.ARC, DrawElementEnum.ARC);
        this.oval = new DrawingElementButton(
                Images.OVAL, DrawElementEnum.OVAL);
        this.rectangle = new DrawingElementButton(
                Images.RECTANGLE, DrawElementEnum.RECTANGLE);
        this.curvedRectangle = new DrawingElementButton(
                Images.RECTANGLE_CURVED, DrawElementEnum.CURVED_RECTANGLE);
        this.polygon = new DrawingElementButton(
                Images.POLYGON, DrawElementEnum.POLYGON);
        this.clear = new DrawingElementButton(Images.RECTANGLE, DrawElementEnum.NOTINGH);
        this.clear.addActionListener(Listeners.getClearListener());
        
        this.redoButton = new ReDoButton(Images.REDO);
        this.undoButton = new UnDoButton(Images.UNDO);
    }
    
    private void addComponents() {
        this.add(this.save);
        this.add(this.undoButton);
        this.add(this.redoButton);
        this.add(this.move);
        this.add(this.freeLine);
        this.add(this.line);
        this.add(this.arc);
        this.add(this.oval);
        this.add(this.polygon);
        this.add(this.rectangle);
        this.add(this.curvedRectangle);
        this.add(this.clear);
    }
    
}
