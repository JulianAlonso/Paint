

package paint.Graphics.EastPanelComponents;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author julialonso
 */
public class ColorModeSelectionPanel extends JPanel {
    
    public static String selectedMode = "Borde";
    
    private JButton relleno, borde;
    
    public ColorModeSelectionPanel() {
        super(new GridLayout(2, 1));
        
        generaBotones();
        addButtons();
        this.validate();
        this.setVisible(true);
    }
    
    private void generaBotones() {
        this.relleno = new JButton("Relleno");
        this.relleno.setName("Relleno");
        this.relleno.addActionListener(getListener());
        
        this.borde = new JButton("Borde");
        this.borde.setName("Borde");
        this.borde.addActionListener(getListener());
    }
    
    private void addButtons() {
        this.add(relleno);
        this.add(borde);
    }
    
    private ActionListener getListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton selected = (JButton)e.getSource();
                if(selected.getName().equals("Relleno")) {
                    selectedMode = "Relleno";
                } else {
                    selectedMode = "Borde";
                }
            }
        };
    }    
}
