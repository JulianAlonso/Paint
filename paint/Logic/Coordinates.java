

package paint.Logic;

import java.awt.Point;

/**
 *
 * @author julialonso
 */
public class Coordinates {
    
    private static Point start;
    private static Point end;
    
    public static void setStartAndEnd(Point start) {
        Coordinates.start = start;
        Coordinates.end = start;
    }
    
    public static void setStart(Point start) {
        Coordinates.start = start;
    }
    
    public static void setEnd(Point end) {
        Coordinates.end = end;
    }
    
    public static void setStart(int x, int y) {
        Coordinates.start.x = x;
        Coordinates.start.y = y;
    }
    
    public static void setEnd(int x, int y) {
        Coordinates.end.x = x;
        Coordinates.end.y = y;
    }
    
    public static void invert() {
        Point temp = new Point(Coordinates.start);
        Coordinates.start = Coordinates.end;
        Coordinates.end = temp;
    }
    
    public static Point getStart() {
        return Coordinates.start;
    }
    
    public static Point getEnd() {
        return Coordinates.end;
    }
}
