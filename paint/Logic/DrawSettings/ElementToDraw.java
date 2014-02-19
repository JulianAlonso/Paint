package paint.Logic.DrawSettings;

import paint.Res.DrawElementEnum;

/**
 *
 * @author julialonso
 */
public class ElementToDraw {
    
    private static DrawElementEnum type = DrawElementEnum.NOTINGH;
    
    public static void setDrawElement(DrawElementEnum element) {
        ElementToDraw.type = element;
    }
    
    public static DrawElementEnum getDrawElement() {
        return ElementToDraw.type;
    }
    
}
