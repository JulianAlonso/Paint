

package paint.Logic.DrawSettings;

import java.awt.BasicStroke;
import java.awt.Stroke;

/**
 *
 * @author julialonso
 */
public class Strokes {
    
    private static Stroke stroke = new BasicStroke(0.0f);
   
    public static void setStroke(int grosor, int dash) {
        float fGrosor = new Float(grosor);
        float[] fDash = new float[] {dash};
        
        if (dash == 101)
            stroke = new BasicStroke(fGrosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, null, 0f);
        else
            stroke = new BasicStroke(fGrosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, fDash, 0f);
    }
    
    public static void setStroke(Stroke stroke) {
        Strokes.stroke = stroke;
    }
    
    public static Stroke getStroke() {
        return Strokes.stroke;
    }
    
}
