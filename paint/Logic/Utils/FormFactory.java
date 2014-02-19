

package paint.Logic.Utils;

import paint.Logic.DrawSettings.Coordinates;
import paint.Logic.Entity.Form;
import paint.Logic.DrawSettings.Colors;
import paint.Logic.DrawSettings.Strokes;
import paint.Logic.DrawSettings.ElementToDraw;
import paint.Logic.DrawSettings.GeneralPathSettings;

/**
 *
 * @author julialonso
 */
public class FormFactory {
    
    public static Form getActualForm() {
        return new Form(ElementToDraw.getDrawElement(), Coordinates.getStart(),
                        Coordinates.getEnd(), Colors.getRelleno(),
                        Colors.getBorde(), Strokes.getStroke(), GeneralPathSettings.getGP());
    }
    
}
