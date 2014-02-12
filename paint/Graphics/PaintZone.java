

package paint.Graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import paint.Logic.Coordinates;
import paint.Logic.Utils.FormFactory;
import paint.Res.Colors;
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
    
    public PaintZone() {
        this.setBackground(Color.WHITE);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                Coordinates.setStartAndEnd(me.getPoint());
                Forms.addForm(FormFactory.getActualForm());
            }
            @Override
            public void mouseClicked(MouseEvent me) {
                //moveSquare(me.getX(), me.getY());
            }
        });
        
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                Coordinates.setEnd(me.getPoint());
                Forms.setLastForm(FormFactory.getActualForm());
                repaint();
            };
        });
        
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }
    
    @Override
    public void paint(Graphics g) {
        Forms.paintAll((Graphics2D)g);
        //g.setColor(Colors.relleno);
        //g.fillRect(squareX, squareY, squareW, squareH);
        //g.setColor(Colors.borde);
        //g.drawRect(squareX, squareY, squareW, squareH);
    }
    
}
