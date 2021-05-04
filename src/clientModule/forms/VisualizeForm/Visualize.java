/*
 * Created by JFormDesigner on Wed May 05 00:38:26 MSK 2021
 */

package clientModule.forms.VisualizeForm;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Visualize extends JPanel {
    public Visualize() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        showPanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        backButton = new JButton();
        drawSpace = new JPanel();
        label1 = new JLabel();

        //======== showPanel ========
        {
            showPanel.setBackground(new Color(225, 183, 144));
            showPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,showPanel. getBorder( )) ); showPanel. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            showPanel.setLayout(new MigLayout(
                "insets 0,hidemode 3",
                // columns
                "[70,grow,fill]" +
                "[70,grow,fill]" +
                "[grow,fill]" +
                "[70,grow,fill]" +
                "[70,grow,fill]",
                // rows
                "[80,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[50,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 14));
            currentUser.setForeground(new Color(40, 61, 82));
            showPanel.add(currentUser, "cell 0 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 36));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            showPanel.add(name, "cell 2 0,align center center,grow 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setForeground(Color.white);
            backButton.setBorder(new EtchedBorder());
            showPanel.add(backButton, "cell 4 0,align center center,grow 0 0,width 70:70:100");

            //======== drawSpace ========
            {
                drawSpace.setBackground(new Color(225, 183, 144));
                drawSpace.setLayout(null);

                //---- label1 ----
                label1.setText("text");
                label1.setBackground(Color.black);
                label1.setForeground(Color.black);
                drawSpace.add(label1);
                label1.setBounds(new Rectangle(new Point(45, 60), label1.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < drawSpace.getComponentCount(); i++) {
                        Rectangle bounds = drawSpace.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = drawSpace.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    drawSpace.setMinimumSize(preferredSize);
                    drawSpace.setPreferredSize(preferredSize);
                }
            }
            showPanel.add(drawSpace, "cell 0 1 5 8");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel showPanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton backButton;
    private JPanel drawSpace;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
