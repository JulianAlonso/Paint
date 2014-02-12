

package paint.Logic;

import java.awt.Graphics2D;
import paint.Logic.DrawUtils.Draws;
import paint.Logic.Entity.Form;
import static paint.Res.DrawElementEnum.ARC;
import static paint.Res.DrawElementEnum.CURVED_RECTANGLE;
import static paint.Res.DrawElementEnum.LINE;
import static paint.Res.DrawElementEnum.RECTANGLE;

/**
 *
 * @author julialonso
 */
public class Draw {
    
    public static void drawForm(Graphics2D g2, Form form) {
        switch(form.getType()) {
            case LINE:
                Draws.DrawLine(g2, form);
                break;
            case ARC:
                break;
            case RECTANGLE:
                break;
            case CURVED_RECTANGLE:
                break;
        }
    }
    
}
