

package paint.Logic.Threads;

import java.awt.Canvas;
import paint.Res.Repaint;

/**
 *
 * @author julialonso
 */
public class RepaintThread extends Thread {
    
    private Canvas canvas;
    
    public RepaintThread(Canvas canvas) {
        this.canvas = canvas;
    }
    
    @Override
    public void run() {
        Boolean boo;
        while(true) {
            boo = Repaint.getRepaint();
            if (boo) {
                canvas.repaint();
                Repaint.setRepaint(false);
            } else {
                System.out.println("");
            }
        }
    }
    
}
