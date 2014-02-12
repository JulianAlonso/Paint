package paint.Res;

/**
 *
 * @author julialonso
 */
public class DrawElement {
    
    private static DrawElementEnum type = DrawElementEnum.NOTINGH;
    
    public static void setDrawElement(DrawElementEnum element) {
        DrawElement.type = element;
    }
    
    public static DrawElementEnum getDrawElement() {
        return DrawElement.type;
    }
    
}
