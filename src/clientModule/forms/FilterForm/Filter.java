/*
 * Created by JFormDesigner on Fri May 07 13:29:16 MSK 2021
 */

package clientModule.forms.FilterForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

import clientModule.App;
import clientModule.Client;
import common.utility.User;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Filter extends JPanel {
    public Filter(Client client) {
        initComponents();
        this.client = client;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.show.getShowPanel());
                App.mainFrame.validate();
            }
        });
        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chooseField.getItemAt(chooseField.getSelectedIndex()).equals("None")) {
                    JOptionPane.showMessageDialog(null, "Не выбрано поле!");
                    return;
                }
                if (argumentField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Не введен аргумент!");
                    return;
                }
                if (chooseTypeFilter.getItemAt(chooseTypeFilter.getSelectedIndex()).equals("None")) {
                    JOptionPane.showMessageDialog(null, "Не выбран тип фильтра!");
                    return;
                }
                App.show.setFilter(true);
                App.show.drawTable();
                App.mainFrame.setContentPane(App.show.getShowPanel());
                App.mainFrame.validate();
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        filterPanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        backButton = new JButton();
        label1 = new JLabel();
        chooseField = new JComboBox<>();
        label2 = new JLabel();
        argumentField = new JTextField();
        label3 = new JLabel();
        chooseTypeFilter = new JComboBox<>();
        filterButton = new JButton();

        //======== filterPanel ========
        {
            filterPanel.setBackground(new Color(225, 183, 144));
            filterPanel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,filterPanel. getBorder () ) ); filterPanel. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
            filterPanel.setLayout(new MigLayout(
                "insets 0,hidemode 3,align center center",
                // columns
                "[grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[grow,fill]",
                // rows
                "[80,grow,fill]" +
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[25,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setForeground(Color.white);
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 20));
            filterPanel.add(currentUser, "cell 1 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 40));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            filterPanel.add(name, "cell 2 0 4 1,align center center,grow 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(Color.white);
            backButton.setForeground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setBorder(new EtchedBorder());
            filterPanel.add(backButton, "cell 6 0,align center center,grow 0 0");

            //---- label1 ----
            label1.setText("\u041f\u043e\u043b\u0435 \u0444\u0438\u043b\u044c\u0442\u0440\u0430:");
            label1.setFont(new Font("Arial", Font.BOLD, 14));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setForeground(new Color(40, 61, 82));
            filterPanel.add(label1, "cell 2 1 4 1");

            //---- chooseField ----
            chooseField.setBorder(new EtchedBorder());
            chooseField.setBackground(Color.white);
            chooseField.setForeground(Color.black);
            chooseField.setModel(new DefaultComboBoxModel<>(new String[] {
                "None",
                "id",
                "key",
                "name",
                "x",
                "y",
                "date",
                "health",
                "heart",
                "achieve",
                "weapon",
                "chapterName",
                "chapterLegion",
                "user"
            }));
            filterPanel.add(chooseField, "cell 3 2 2 1,aligny center,grow 100 0,height 30:30:40");

            //---- label2 ----
            label2.setText("\u0410\u0440\u0433\u0443\u043c\u0435\u043d\u0442:");
            label2.setFont(new Font("Arial", Font.BOLD, 14));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setForeground(new Color(40, 61, 82));
            filterPanel.add(label2, "cell 2 3 4 1");

            //---- argumentField ----
            argumentField.setBackground(Color.white);
            argumentField.setBorder(new EtchedBorder());
            filterPanel.add(argumentField, "cell 3 4 2 1,aligny center,grow 100 0,height 30:30:40");

            //---- label3 ----
            label3.setText("\u0422\u0438\u043f \u0444\u0438\u043b\u044c\u0442\u0440\u0430:");
            label3.setFont(new Font("Arial", Font.BOLD, 14));
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setForeground(new Color(40, 61, 82));
            filterPanel.add(label3, "cell 3 5 2 1");

            //---- chooseTypeFilter ----
            chooseTypeFilter.setBorder(new EtchedBorder());
            chooseTypeFilter.setBackground(Color.white);
            chooseTypeFilter.setForeground(Color.black);
            chooseTypeFilter.setModel(new DefaultComboBoxModel<>(new String[] {
                "None",
                "=",
                ">",
                "<"
            }));
            filterPanel.add(chooseTypeFilter, "cell 3 6 2 1,aligny center,grow 100 0,height 30:30:40");

            //---- filterButton ----
            filterButton.setText("\u0424\u0438\u043b\u044c\u0442\u0440\u043e\u0432\u0430\u0442\u044c");
            filterButton.setBackground(new Color(40, 61, 82));
            filterButton.setFont(new Font("Arial", Font.BOLD, 12));
            filterButton.setForeground(Color.white);
            filterPanel.add(filterButton, "cell 3 8 2 1,aligny center,grow 100 0,height 30:30:40");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void setUser(User user) {
        this.client.setUser(user);
        this.currentUser.setText(user.getLogin());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel filterPanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton backButton;
    private JLabel label1;
    private JComboBox<String> chooseField;
    private JLabel label2;
    private JTextField argumentField;
    private JLabel label3;
    private JComboBox<String> chooseTypeFilter;
    private JButton filterButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client client;

    public JComboBox<String> getChooseField() {
        return chooseField;
    }

    public JTextField getArgumentField() {
        return argumentField;
    }

    public JComboBox<String> getChooseTypeFilter() {
        return chooseTypeFilter;
    }

    public JPanel getFilterPanel() {
        return filterPanel;
    }
}
