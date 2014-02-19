

package paint.Logic.Utils;

import java.awt.Point;
import paint.Logic.Entity.Form;

/**
 *
 * @author julialonso
 */
public class Check {
    
    public static void checkPoints(Form form) {
        if (form.getStart().x > form.getEnd().x 
         && form.getStart().y > form.getEnd().y) {
            Point temp = form.getStart();
            form.setStart(form.getEnd());
            form.setEnd(temp);
        } else if (form.getStart().x < form.getEnd().x
               && form.getStart().y > form.getEnd().y){
            int temp = form.getStart().y;
            form.setStart(new Point(form.getStart().x, form.getEnd().y));
            form.setEnd(new Point(form.getEnd().x, temp));
        } else if (form.getStart().x > form.getEnd().x
                && form.getStart().y < form.getEnd().y) {
            int temp = form.getStart().x;
            form.setStart(new Point(form.getEnd().x, form.getStart().y));
            form.setEnd(new Point(temp, form.getEnd().y));
        }
    }
    
}
