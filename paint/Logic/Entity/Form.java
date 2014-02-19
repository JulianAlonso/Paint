

package paint.Logic.Entity;

import java.awt.Color;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
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
    private Stroke stroke;
    private boolean visible;
    
    private GeneralPath gp;
    
    public Form(DrawElementEnum type, Point start, Point end, 
            Color colorRelleno, Color colorBorde, Stroke stroke,
            GeneralPath gp) {
        this.type = type;
        this.start = start;
        this.end = end;
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
        this.stroke = stroke;
        this.gp = gp;
        this.visible = true;
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
    
    public Stroke getStroke() {
        return this.stroke;
    }
    
    public GeneralPath getGP() {
        return this.gp;
    }
    
    public boolean isVisible() {
        return this.visible;
    }
    
    public void setStart(Point start) {
        this.start = start;
    }
    
    public void setEnd(Point end) {
        this.end = end;
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
}
