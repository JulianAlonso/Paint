

package paint.Logic.Entity;

import java.awt.Color;
import java.awt.Point;
import paint.Res.DrawElementEnum;

/**
 *
 * @author julialonso
 */
public class Form {
    
    private DrawElementEnum type;
    private Point start;
    private Point end;
    private Color colorRelleno;
    private Color colorBorde;
    
    public Form(DrawElementEnum type, Point start, Point end, Color colorRelleno, Color colorBorde) {
        this.type = type;
        this.start = start;
        this.end = end;
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
    }
    
    public DrawElementEnum getType() {
        return this.type;
    }
    
    public Point getStart() {
        return this.start;
    }
    
    public Point getEnd() {
        return this.end;
    }
    
    public Color getColorRelleno() {
        return this.colorRelleno;
    }
    
    public Color getColorBorde() {
        return this.colorBorde;
    }
    
}
