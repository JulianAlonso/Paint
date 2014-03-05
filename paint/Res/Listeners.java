package paint.Res;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import paint.Logic.Utils.ToImage;
import paint.Paint;

/**
 *
 * @author julialonso
 */
public class Listeners {

    
    
    public static ActionListener getClearListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Forms.deleteAll();
                Paint.getPaint().repaint();
            }
        };
    }
    public static ActionListener getUndoListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Forms.undoForm();
                Paint.getPaint().repaint();
            }
        };
    }

    public static ActionListener getRedoListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Forms.redoForm();
                Paint.getPaint().repaint();
            }
        };
    }

    public static ActionListener getSaveListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog(null, "Nombre para guardar: ", 
                "Imagen", 1);
                if (str == null) {
                    str = "imagen";
                }
                File dir = ToImage.getJFDirectory();
                if (dir != null) {
                    try {
                        File outputfile = new File(dir.getAbsolutePath() + "/" + str + ".jpg");
                        ImageIO.write(ToImage.createImage(Paint.getPaint()), "jpg", outputfile);
                    } catch (IOException ex) {
                        
                    }
                }
            }
        };
    }

}
