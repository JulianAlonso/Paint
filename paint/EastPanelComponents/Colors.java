

package paint.EastPanelComponents;

import java.awt.Color;

/**
 *
 * @author julialonso
 */
public class Colors {   
    
    public static Color relleno = Color.WHITE;
    public static Color borde = Color.BLACK;
    
    
    public static void setSelectedColor(Color color) {
        if(ColorModeSelectionPanel.selectedMode.equals("Relleno"))
            Colors.relleno = color;
        else
            Colors.borde = color;
    }
    
}
