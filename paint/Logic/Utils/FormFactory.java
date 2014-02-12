

package paint.Logic.Utils;

import paint.Logic.Coordinates;
import paint.Logic.Entity.Form;
import paint.Res.Colors;
import paint.Res.DrawElement;

/**
 *
 * @author julialonso
 */
public class FormFactory {
    
    public static Form getActualForm() {
        return new Form(DrawElement.getDrawElement(), Coordinates.getStart(),
                        Coordinates.getEnd(), Colors.getRelleno(),
                        Colors.getBorde());
    }
    
}
