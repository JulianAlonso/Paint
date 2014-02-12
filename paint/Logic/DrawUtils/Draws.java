

package paint.Logic.DrawUtils;

import java.awt.Graphics2D;
import paint.Logic.Entity.Form;

/**
 *
 * @author julialonso
 */
public class Draws {
    
    public static void DrawLine(Graphics2D g2, Form form) {
        g2.setColor(form.getColorBorde());
        g2.drawLine(form.getStart().x, form.getStart().y,
                    form.getEnd().x, form.getEnd().y);
    }
    
    public static void DrawRectangle(Graphics2D g2, Form form) {
        g2.setColor(form.getColorRelleno());
        g2.fillRect(form.getStart().x, form.getStart().y, 
                    form.getEnd().x - form.getStart().x,
                    form.getEnd().y - form.getStart().y);
        
        g2.setColor(form.getColorBorde());
        g2.drawRect(form.getStart().x, form.getStart().y, 
                    form.getEnd().x - form.getStart().x, 
                    form.getEnd().y - form.getStart().y);
    }
}
