

package paint.Logic.DrawSettings;

import java.awt.BasicStroke;
import java.awt.Stroke;

/**
 *
 * @author julialonso
 */
public class Strokes {
    
    private static Stroke stroke = new BasicStroke(0.0f);
    
    public static void setStroke(int grosor) {
        Float fGrosor = new Float(grosor);
        Strokes.stroke = new BasicStroke(fGrosor);
    }
    
    public static Stroke getStroke() {
        return Strokes.stroke;
    }
    
}
