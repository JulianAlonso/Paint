package paint.Graphics;

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

    public WestPanel() {
        this.initComponents();
        this.addComponents();
    }

    private void initComponents() {
        this.sliderStrokeBar = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        this.sliderStrokeBar.setName("sliderStrokeBar");
        this.sliderStrokeBar.addChangeListener(new SliderListener());
        this.sliderStrokeBar.setPaintTicks(true);
        this.sliderStrokeBar.setMajorTickSpacing(10);
        this.sliderStrokeBar.setMinorTickSpacing(5);
    }
    
    private void addComponents() {
        this.add(this.sliderStrokeBar);
    }
    
    class SliderListener implements ChangeListener {

        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            if (!source.getValueIsAdjusting()) {
                int fps = (int) source.getValue();
                Strokes.setStroke(source.getValue());
            }
        }
    }
}
