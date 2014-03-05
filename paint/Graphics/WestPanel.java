package paint.Graphics;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import paint.Logic.DrawSettings.Strokes;

/**
 *
 * @author julialonso
 */
public class WestPanel extends JPanel {

    private JSlider sliderStrokeBar, sliderDashBar;
    
    int width;
    int dash;
    
    public WestPanel() {
        super(new GridLayout(2, 1));
        this.initComponents();
        this.addComponents();
    }

    private void initComponents() {
        this.sliderStrokeBar = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        this.sliderStrokeBar.setName("sliderStrokeBar");
        this.sliderStrokeBar.addChangeListener(new SliderStrokeListener());
        this.sliderStrokeBar.setPaintTicks(true);
        this.sliderStrokeBar.setMajorTickSpacing(10);
        this.sliderStrokeBar.setMinorTickSpacing(5);
        
        this.sliderDashBar = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        this.sliderDashBar.setName("sliderDashBar");
        this.sliderDashBar.addChangeListener(new SliderDashListener());
        this.sliderDashBar.setPaintTicks(true);
        this.sliderDashBar.setMajorTickSpacing(10);
        this.sliderDashBar.setMinorTickSpacing(5);
        
        this.width = 0;
        this.dash = 101;
    }
    
    private void addComponents() {
        this.add(this.sliderStrokeBar);
        this.add(this.sliderDashBar);
    }
    
    class SliderStrokeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            if (!source.getValueIsAdjusting()) {
                width = source.getValue();
                setSettings();
            }
        }
    }
    class SliderDashListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            if (!source.getValueIsAdjusting()) {
                dash = 101 - source.getValue();
                setSettings();
            }
        }
    }
    
    private void setSettings() {
        Strokes.setStroke(width, dash);
    }
    
}
