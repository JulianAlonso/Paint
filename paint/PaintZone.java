

package paint;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import paint.EastPanelComponents.Colors;

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
                moveSquare(me.getX(), me.getY());
            }
            @Override
            public void mouseClicked(MouseEvent me) {
                moveSquare(me.getX(), me.getY());
            }
        });
        
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                moveSquare(me.getX(), me.getY());
            };
        });
        
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }
    
    private void moveSquare(int x, int y) {
        int OFFSET = 1;
        if ((squareX!=x) || (squareY!=y)) {
            repaint(squareX, squareY, squareW+OFFSET, squareH+OFFSET);
            squareX = x;
            squareY=y;
            repaint();
        }
    }
    
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Colors.relleno);
        g.fillRect(squareX, squareY, squareW, squareH);
        g.setColor(Colors.borde);
        g.drawRect(squareX, squareY, squareW, squareH);
    }
}
