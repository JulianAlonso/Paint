

package paint.Res;

import java.awt.Graphics2D;
import java.awt.Point;
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
    private static Point antiguo;
    
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
            if (form.isVisible())
                Draw.drawForm(g2, form);
        }
    }
    
    public synchronized static void undoForm() {
        Forms.forms.get(Forms.forms.size()-1-invisibles).setVisible(false);
        Forms.invisibles++;
    }
    
    public synchronized static void redoForm() {
        Forms.invisibles--;
        Forms.forms.get(Forms.forms.size()-1-invisibles).setVisible(true);
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
    
    public synchronized static Form moveToLastForm(Point p) {
        for (Form form: Forms.forms) {
            if (p.x > form.getStart().x && p.y > form.getStart().y
                    && p.x < form.getEnd().x && p.y < form.getEnd().y) {
                Form temp = new Form(form);
                Forms.forms.remove(form);
                Forms.forms.add(temp);
                return temp;
            }
        }
        return null;
    }
    
    public static void setLastPoint(Point p) {
        Forms.antiguo = p;
    }
    
    public synchronized static void moveLastForm(Point p) {
        Form temp = forms.get(forms.size()-1);
        Point start = new Point(temp.getStart().x + p.x - antiguo.x, temp.getStart().y + p.y - antiguo.y);
        Point end = new Point(temp.getEnd().x + p.x - antiguo.x, temp.getEnd().y + p.y - antiguo.y);
        if(temp.getCurved() != null) {
            Point curved = new Point(temp.getCurved().x + p.x - antiguo.x, temp.getCurved().y + p.y - antiguo.y);
            temp.setCurved(curved);
        }
        temp.setStart(start);
        temp.setEnd(end);
    }
    
}
