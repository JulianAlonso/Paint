

package paint.Logic.DrawUtils;

import java.awt.Graphics2D;
import paint.Logic.Entity.Form;
import paint.Logic.Utils.Check;

/**
 *
 * @author julialonso
 */
public class Draws {
    
    public static void drawFreeLine(Graphics2D g2, Form form) {
        g2.setColor(form.getColorBorde());
        g2.setStroke(form.getStroke());
        g2.draw(form.getGP());
    }
    
    public static void drawLine(Graphics2D g2, Form form) {
        g2.setColor(form.getColorBorde());
        g2.setStroke(form.getStroke());
        g2.drawLine(form.getStart().x, form.getStart().y,
                    form.getEnd().x, form.getEnd().y);
    }
    
    public static void drawPolygon(Graphics2D g2, Form form) {
        
    }
    
    public static void drawRectangle(Graphics2D g2, Form form) {
        Check.checkPoints(form);
        g2.setStroke(form.getStroke());
        g2.setColor(form.getColorRelleno());
        g2.fillRect(form.getStart().x, form.getStart().y, 
                    form.getEnd().x - form.getStart().x,
                    form.getEnd().y - form.getStart().y);
        
        g2.setColor(form.getColorBorde());
        g2.drawRect(form.getStart().x, form.getStart().y, 
                    form.getEnd().x - form.getStart().x, 
                    form.getEnd().y - form.getStart().y);
    }
    
    public static void drawCurvedRectangle(Graphics2D g2, Form form) {
        Check.checkPoints(form);
        g2.setStroke(form.getStroke());
        g2.setColor(form.getColorRelleno());
        g2.fillRoundRect(form.getStart().x, form.getStart().y, 
                    form.getEnd().x - form.getStart().x,
                    form.getEnd().y - form.getStart().y,
                    20, 20);
        
        g2.setColor(form.getColorBorde());
        g2.drawRoundRect(form.getStart().x, form.getStart().y, 
                    form.getEnd().x - form.getStart().x, 
                    form.getEnd().y - form.getStart().y,
                    20, 20);
    }
}
