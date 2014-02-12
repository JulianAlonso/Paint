

package paint.Logic.DrawUtils;

import java.awt.Graphics2D;
import paint.Logic.Entity.Form;

/**
 *
 * @author julialonso
 */
public class DrawLine {
    
    public static void DrawLine(Graphics2D g2, Form form) {
        g2.drawLine(form.getStart().x, form.getStart().y,
                    form.getEnd().x, form.getEnd().y);
    }
    
}
