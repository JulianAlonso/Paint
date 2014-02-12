

package paint.Res;

import java.awt.Graphics2D;
import java.util.ArrayList;
import paint.Logic.Draw;
import paint.Logic.Entity.Form;

/**
 *
 * @author julialonso
 */
public class Forms {
    
    private static ArrayList<Form> forms = new ArrayList<>();
    
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
    
}
