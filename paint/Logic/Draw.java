

package paint.Logic;

import java.awt.Graphics2D;
import paint.Logic.DrawUtils.Draws;
import paint.Logic.Entity.Form;
import static paint.Res.DrawElementEnum.*;

/**
 *
 * @author julialonso
 */
public class Draw {
    
    public static void drawForm(Graphics2D g2, Form form) {
        switch(form.getType()) {
            case FREELINE:
                Draws.drawFreeLine(g2, form);
                break;
            case LINE:
                Draws.drawLine(g2, form);
                break;
            case POLYGON:
                Draws.drawPolygon(g2, form);
                break;
            case ARC:
                Draws.drawArc(g2, form);
                break;
            case OVAL:
                Draws.drawOval(g2, form);
                break;
            case RECTANGLE:
                Draws.drawRectangle(g2, form);
                break;
            case CURVED_RECTANGLE:
                Draws.drawCurvedRectangle(g2, form);
                break;
            
        }
    }
    
}
