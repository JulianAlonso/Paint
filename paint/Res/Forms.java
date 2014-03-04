

package paint.Res;

import java.awt.Graphics2D;
import java.util.ArrayList;
import paint.Logic.Draw;
import paint.Logic.Entity.Form;

/**
 *
 * @author julialonso
 */
public final class Forms {
    
    private static ArrayList<Form> forms = new ArrayList<>();
    private static int invisibles = 0;
    
    public synchronized static void setLastForm(Form form){
        if(Forms.forms.size() < 1) 
            Forms.forms.add(form);
        else
            Forms.forms.set(Forms.forms.size()-1, form);
    }
    
    public synchronized static void addForm(Form form) {
        Forms.forms.add(form);
    }
    
    public synchronized static void paintAll(Graphics2D g2) {
        for(Form form: Forms.forms) {
            Draw.drawForm(g2, form);
        }
    }
    
    public synchronized static void undoForm() {
        Forms.forms.get(Forms.forms.size()-1-invisibles).setVisible(false);
        Forms.invisibles++;
    }
    
    public synchronized static void redoForm() {
        Forms.forms.get(Forms.forms.size()-1-invisibles).setVisible(true);
        Forms.invisibles--;
    }
    
    public synchronized static void resetInvisibles() {
        while(invisibles != 0) {
            Forms.forms.remove(forms.size()-1);
            invisibles--;
        }
    }
    
    public synchronized static void deleteAll() {
        Forms.forms.clear();
    }
}
