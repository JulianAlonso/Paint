

package paint.Logic.DrawSettings;

import java.awt.Color;
import paint.Graphics.EastPanelComponents.ColorModeSelectionPanel;

/**
 *
 * @author julialonso
 */
public class Colors {
    
    private static Color relleno = Color.WHITE;
    private static Color borde = Color.BLACK;
    
    public static Color getRelleno() {
        return Colors.relleno;
    }
    
    public static Color getBorde() {
        return Colors.borde;
    }
    
    public static void setBorde(Color borde) {
        Colors.borde = borde;
    }

    public static void setRelleno(Color relleno) {
        Colors.relleno = relleno;
    }
    
    public static void setSelectedColor(Color color) {
        if(ColorModeSelectionPanel.selectedMode.equals("Relleno"))
            Colors.relleno = color;
        else
            Colors.borde = color;
    }
    
}
