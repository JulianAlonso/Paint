

package paint.Res;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import paint.Paint;

/**
 *
 * @author julialonso
 */
public class Listeners {
    
    public static ActionListener getUndoListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Forms.undoForm();
            }  
        };
    }
    
    public static ActionListener getRedoListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Forms.redoForm();
            }
        };
    }
    
}
