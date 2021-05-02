/*
 * Created by JFormDesigner on Sun May 02 21:35:52 MSK 2021
 */

package clientModule.forms.ShowForm;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Show extends JPanel {
    public Show() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        showPanel = new JPanel();
        owner = new JLabel();
        backButton = new JButton();
        name = new JLabel();
        filterButton = new JButton();
        resetButton = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== showPanel ========
        {
            showPanel.setBackground(new Color(225, 183, 144));
            showPanel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,showPanel. getBorder () ) ); showPanel. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );
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

            //---- owner ----
            owner.setText("test");
            owner.setHorizontalAlignment(SwingConstants.CENTER);
            owner.setFont(new Font("Arial", Font.BOLD, 14));
            owner.setForeground(new Color(40, 61, 82));
            showPanel.add(owner, "cell 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setForeground(Color.white);
            backButton.setBorder(new EtchedBorder());
            showPanel.add(backButton, "cell 1 0,align center center,grow 0 0,width 70:70:100");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 36));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            showPanel.add(name, "cell 2 0,align center center,grow 0 0");

            //---- filterButton ----
            filterButton.setText("\u0424\u0438\u043b\u044c\u0442\u0440");
            filterButton.setForeground(Color.white);
            filterButton.setBackground(new Color(40, 61, 82));
            filterButton.setFont(new Font("Arial", Font.BOLD, 12));
            filterButton.setBorder(new EtchedBorder());
            showPanel.add(filterButton, "cell 3 0,align center center,grow 0 0,width 60:70:100");

            //---- resetButton ----
            resetButton.setText("\u0421\u0431\u0440\u043e\u0441");
            resetButton.setForeground(Color.white);
            resetButton.setBackground(new Color(40, 61, 82));
            resetButton.setFont(new Font("Arial", Font.BOLD, 12));
            resetButton.setBorder(new EtchedBorder());
            showPanel.add(resetButton, "cell 4 0,align center center,grow 0 0,width 70:70:100");

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, "", null, null, null, null, null, null, null, null, null, ""},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                    },
                    new String[] {
                        "id", "key", "name", "x", "y", "date", "health", "heart", "achieve", "weaponType", "chapterName", "chapterLegion", "user"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        Integer.class, Integer.class, String.class, Double.class, Float.class, Date.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                table1.setFont(new Font("Arial", Font.PLAIN, 12));
                scrollPane1.setViewportView(table1);
            }
            showPanel.add(scrollPane1, "cell 0 1 5 8");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel showPanel;
    private JLabel owner;
    private JButton backButton;
    private JLabel name;
    private JButton filterButton;
    private JButton resetButton;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
