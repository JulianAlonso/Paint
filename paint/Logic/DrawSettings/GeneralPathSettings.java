

package paint.Logic.DrawSettings;

import java.awt.Point;
import java.awt.geom.GeneralPath;

/**
 *
 * @author julialonso
 */
public class GeneralPathSettings {
    
    private static GeneralPath gp;
    
    public static void resetGP() {
        GeneralPathSettings.gp = new GeneralPath();
    }
    
    public static void moveTo(Point to) {
        GeneralPathSettings.gp.moveTo(to.getX(), to.getY());
    }
    
    public static void lineTo(Point to) {
        GeneralPathSettings.gp.lineTo(to.getX(), to.getY());
    }
    
    public static GeneralPath getGP() {
        return GeneralPathSettings.gp;
    }
}
