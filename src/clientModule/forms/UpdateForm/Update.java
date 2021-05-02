/*
 * Created by JFormDesigner on Sun May 02 21:36:33 MSK 2021
 */

package clientModule.forms.UpdateForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

import clientModule.Client;
import clientModule.forms.MainMenuForm.MainMenu;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Update extends JPanel {
    public Update(JFrame mainFrame, Client client) {
        initComponents();
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setContentPane(new MainMenu(mainFrame ,client).getMainMenuPanel());
                mainFrame.validate();
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        updatePanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        backButton = new JButton();
        keyTitle = new JLabel();
        keyField = new JTextField();
        marineTitle = new JLabel();
        marineTitle2 = new JLabel();
        nameTitle = new JLabel();
        nameField = new JTextField();
        nameCheck = new JCheckBox();
        xTitle = new JLabel();
        xField = new JTextField();
        xCheck = new JCheckBox();
        healthTitle = new JLabel();
        healthField = new JTextField();
        healthCheck = new JCheckBox();
        yTitle = new JLabel();
        yField = new JTextField();
        yCheck = new JCheckBox();
        heartTitle = new JLabel();
        heartField = new JTextField();
        heartCheck = new JCheckBox();
        marineTitle3 = new JLabel();
        achieveTitle = new JLabel();
        achieveField = new JTextField();
        achieveCheck = new JCheckBox();
        chapterNameTitle = new JLabel();
        chapterNameField = new JTextField();
        chapterNameCheck = new JCheckBox();
        weaponTitle = new JLabel();
        weaponBox = new JComboBox<>();
        weaponCheck = new JCheckBox();
        chapterLegionTitle = new JLabel();
        chapterLegionField = new JTextField();
        chapterLegionCheck = new JCheckBox();
        updateButton = new JButton();

        //======== updatePanel ========
        {
            updatePanel.setBackground(new Color(225, 183, 144));
            updatePanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,updatePanel. getBorder( )) )
            ; updatePanel. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            updatePanel.setLayout(new MigLayout(
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
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setForeground(Color.white);
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 20));
            updatePanel.add(currentUser, "cell 1 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 40));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            updatePanel.add(name, "cell 2 0 4 1,align center center,grow 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(Color.white);
            backButton.setForeground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setBorder(new EtchedBorder());
            updatePanel.add(backButton, "cell 6 0,align center center,grow 0 0");

            //---- keyTitle ----
            keyTitle.setText("\u041a\u043b\u044e\u0447");
            keyTitle.setForeground(new Color(40, 61, 82));
            keyTitle.setHorizontalAlignment(SwingConstants.CENTER);
            keyTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(keyTitle, "cell 1 1");

            //---- keyField ----
            keyField.setBackground(Color.white);
            keyField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(keyField, "cell 2 1");

            //---- marineTitle ----
            marineTitle.setText("\u0414\u0430\u043d\u043d\u044b\u0435 \u043e Spacemarine");
            marineTitle.setForeground(new Color(40, 61, 82));
            marineTitle.setHorizontalAlignment(SwingConstants.CENTER);
            marineTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(marineTitle, "cell 4 1 3 1");

            //---- marineTitle2 ----
            marineTitle2.setText("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b");
            marineTitle2.setForeground(new Color(40, 61, 82));
            marineTitle2.setHorizontalAlignment(SwingConstants.CENTER);
            marineTitle2.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(marineTitle2, "cell 1 2 3 1");

            //---- nameTitle ----
            nameTitle.setText("\u0418\u043c\u044f");
            nameTitle.setForeground(new Color(40, 61, 82));
            nameTitle.setHorizontalAlignment(SwingConstants.CENTER);
            nameTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(nameTitle, "cell 4 2");

            //---- nameField ----
            nameField.setBackground(Color.white);
            nameField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(nameField, "cell 5 2");

            //---- nameCheck ----
            nameCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(nameCheck, "cell 6 2");

            //---- xTitle ----
            xTitle.setText("X");
            xTitle.setForeground(new Color(40, 61, 82));
            xTitle.setHorizontalAlignment(SwingConstants.CENTER);
            xTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(xTitle, "cell 1 3");

            //---- xField ----
            xField.setBackground(Color.white);
            xField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(xField, "cell 2 3");

            //---- xCheck ----
            xCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(xCheck, "cell 3 3");

            //---- healthTitle ----
            healthTitle.setText("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435");
            healthTitle.setForeground(new Color(40, 61, 82));
            healthTitle.setHorizontalAlignment(SwingConstants.CENTER);
            healthTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(healthTitle, "cell 4 3");

            //---- healthField ----
            healthField.setBackground(Color.white);
            healthField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(healthField, "cell 5 3");

            //---- healthCheck ----
            healthCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(healthCheck, "cell 6 3");

            //---- yTitle ----
            yTitle.setText("Y");
            yTitle.setForeground(new Color(40, 61, 82));
            yTitle.setHorizontalAlignment(SwingConstants.CENTER);
            yTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(yTitle, "cell 1 4");

            //---- yField ----
            yField.setBackground(Color.white);
            yField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(yField, "cell 2 4");

            //---- yCheck ----
            yCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(yCheck, "cell 3 4");

            //---- heartTitle ----
            heartTitle.setText("\u0421\u0435\u0440\u0434\u0446\u0430");
            heartTitle.setForeground(new Color(40, 61, 82));
            heartTitle.setHorizontalAlignment(SwingConstants.CENTER);
            heartTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(heartTitle, "cell 4 4");

            //---- heartField ----
            heartField.setBackground(Color.white);
            heartField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(heartField, "cell 5 4");

            //---- heartCheck ----
            heartCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(heartCheck, "cell 6 4");

            //---- marineTitle3 ----
            marineTitle3.setText("\u0427\u0430\u0441\u0442\u044c");
            marineTitle3.setForeground(new Color(40, 61, 82));
            marineTitle3.setHorizontalAlignment(SwingConstants.CENTER);
            marineTitle3.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(marineTitle3, "cell 1 5 3 1");

            //---- achieveTitle ----
            achieveTitle.setText("\u0414\u043e\u0441\u0442\u0438\u0436\u0435\u043d\u0438\u044f");
            achieveTitle.setForeground(new Color(40, 61, 82));
            achieveTitle.setHorizontalAlignment(SwingConstants.CENTER);
            achieveTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(achieveTitle, "cell 4 5");

            //---- achieveField ----
            achieveField.setBackground(Color.white);
            achieveField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(achieveField, "cell 5 5");

            //---- achieveCheck ----
            achieveCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(achieveCheck, "cell 6 5");

            //---- chapterNameTitle ----
            chapterNameTitle.setText("\u0418\u043c\u044f");
            chapterNameTitle.setForeground(new Color(40, 61, 82));
            chapterNameTitle.setHorizontalAlignment(SwingConstants.CENTER);
            chapterNameTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(chapterNameTitle, "cell 1 6");

            //---- chapterNameField ----
            chapterNameField.setBackground(Color.white);
            chapterNameField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(chapterNameField, "cell 2 6");

            //---- chapterNameCheck ----
            chapterNameCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(chapterNameCheck, "cell 3 6");

            //---- weaponTitle ----
            weaponTitle.setText("\u041e\u0440\u0443\u0436\u0438\u0435");
            weaponTitle.setForeground(new Color(40, 61, 82));
            weaponTitle.setHorizontalAlignment(SwingConstants.CENTER);
            weaponTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(weaponTitle, "cell 4 6");

            //---- weaponBox ----
            weaponBox.setBackground(Color.white);
            weaponBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "FLAMER",
                "BOLTGUN",
                "GRENADE"
            }));
            weaponBox.setSelectedIndex(0);
            updatePanel.add(weaponBox, "cell 5 6");

            //---- weaponCheck ----
            weaponCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(weaponCheck, "cell 6 6");

            //---- chapterLegionTitle ----
            chapterLegionTitle.setText("\u041b\u0435\u0433\u0438\u043e\u043d");
            chapterLegionTitle.setForeground(new Color(40, 61, 82));
            chapterLegionTitle.setHorizontalAlignment(SwingConstants.CENTER);
            chapterLegionTitle.setFont(new Font("Arial", Font.BOLD, 14));
            updatePanel.add(chapterLegionTitle, "cell 1 7");

            //---- chapterLegionField ----
            chapterLegionField.setBackground(Color.white);
            chapterLegionField.setHorizontalAlignment(SwingConstants.CENTER);
            updatePanel.add(chapterLegionField, "cell 2 7");

            //---- chapterLegionCheck ----
            chapterLegionCheck.setBackground(new Color(225, 183, 144));
            updatePanel.add(chapterLegionCheck, "cell 3 7");

            //---- updateButton ----
            updateButton.setText("Update");
            updateButton.setBackground(new Color(40, 61, 82));
            updateButton.setFont(new Font("Arial", Font.BOLD, 14));
            updateButton.setForeground(Color.white);
            updatePanel.add(updateButton, "cell 3 8 2 1");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel updatePanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton backButton;
    private JLabel keyTitle;
    private JTextField keyField;
    private JLabel marineTitle;
    private JLabel marineTitle2;
    private JLabel nameTitle;
    private JTextField nameField;
    private JCheckBox nameCheck;
    private JLabel xTitle;
    private JTextField xField;
    private JCheckBox xCheck;
    private JLabel healthTitle;
    private JTextField healthField;
    private JCheckBox healthCheck;
    private JLabel yTitle;
    private JTextField yField;
    private JCheckBox yCheck;
    private JLabel heartTitle;
    private JTextField heartField;
    private JCheckBox heartCheck;
    private JLabel marineTitle3;
    private JLabel achieveTitle;
    private JTextField achieveField;
    private JCheckBox achieveCheck;
    private JLabel chapterNameTitle;
    private JTextField chapterNameField;
    private JCheckBox chapterNameCheck;
    private JLabel weaponTitle;
    private JComboBox<String> weaponBox;
    private JCheckBox weaponCheck;
    private JLabel chapterLegionTitle;
    private JTextField chapterLegionField;
    private JCheckBox chapterLegionCheck;
    private JButton updateButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    
    public JPanel getUpdatePanel() {
        return updatePanel;
    }
}
