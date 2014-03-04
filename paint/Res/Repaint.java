

package paint.Res;

/**
 *
 * @author julialonso
 */
public class Repaint {
    
    private static boolean needRepaint = false;
    
    public static void setRepaint(boolean repaint) {
        Repaint.needRepaint = repaint;
    }
    
    public static boolean getRepaint() {
        return Repaint.needRepaint;
    }
    
}
