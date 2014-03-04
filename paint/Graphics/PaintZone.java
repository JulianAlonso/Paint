

package paint.Graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import paint.Logic.DrawSettings.Coordinates;
import paint.Logic.DrawSettings.ElementToDraw;
import paint.Logic.Utils.FormFactory;
import paint.Res.DrawElementEnum;
import paint.Res.Forms;

/**
 *
 * @author julialonso
 */
public class PaintZone extends Canvas {
    
    private int squareX = 50;
    private int squareY = 50;
    private int squareW = 20;
    private int squareH = 20;
    
    private int clicks = 0;
    
    public PaintZone() {
        this.setBackground(Color.WHITE);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (clicks == 0) {
                    Coordinates.setStartAndEnd(me.getPoint());
                    Forms.resetInvisibles();
                    Forms.addForm(FormFactory.getActualForm());
                }
            }
            @Override
            public void mouseClicked(MouseEvent me) {
                if (ElementToDraw.getDrawElement() == DrawElementEnum.POLYGON) {
                    clicks++;
                    Forms.setLastForm(FormFactory.getActualForm());
                    Coordinates.setEnd(me.getPoint());
                    repaint();
                }
                
                if (me.getClickCount() == 2 && 
                        ElementToDraw.getDrawElement() == DrawElementEnum.POLYGON) {
                    Coordinates.closeGP();
                    clicks = 0;
                }
                
                if (ElementToDraw.getDrawElement() == DrawElementEnum.ARC) {
                    Coordinates.setCurved(me.getPoint());
                    Forms.setLastForm(FormFactory.getActualForm());
                    repaint();
                }
                
                if(ElementToDraw.getDrawElement() == DrawElementEnum.ARC
                        && me.getClickCount() == 2) {
                    clicks = 0;
                }
                
            }
            
        });
        
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                if (ElementToDraw.getDrawElement() != DrawElementEnum.POLYGON) {
                    if(ElementToDraw.getDrawElement() == DrawElementEnum.ARC 
                            && clicks > 0) {
                        Coordinates.setCurved(me.getPoint());
                        Forms.setLastForm(FormFactory.getActualForm());
                        repaint();
                    } else {
                        Forms.setLastForm(FormFactory.getActualForm());
                        Coordinates.setEnd(me.getPoint());
                        repaint();
                    }
                }
            };
            
            @Override
            public void mouseReleased(MouseEvent me) {
                clicks++;
            }
            
        });
                
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }
    
    @Override
    public void paint(Graphics g) {
        Forms.paintAll((Graphics2D)g);
    }
    
}
