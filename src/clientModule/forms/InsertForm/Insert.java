/*
 * Created by JFormDesigner on Sun May 02 01:01:23 MSK 2021
 */

package clientModule.forms.InsertForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.*;

import clientModule.Client;
import clientModule.forms.MainMenuForm.MainMenu;
import clientModule.forms.StartMenuForm.StartMenu;
import common.data.Chapter;
import common.data.Coordinates;
import common.data.Weapon;
import common.exceptions.NotDeclaredValueException;
import common.utility.Request;
import common.utility.Response;
import common.utility.SpaceMarineLite;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Insert extends JPanel {
    public Insert(JFrame mainFrame, Client client) {
        initComponents();
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setContentPane(new MainMenu(mainFrame ,client).getMainMenuPanel());
                mainFrame.validate();
            }
        });
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder errors = new StringBuilder();
                int key = 0;
                try {
                    key = Integer.parseInt(keyField.getText());
                    if (key <= 0) throw new NotDeclaredValueException();
                } catch (NumberFormatException exception) {
                    errors.append("Ключ должен быть числом!\n");
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Ключ должен быть больше 0!\n");
                }
                String name = null;
                try {
                    name = nameField.getText();
                    if (name.isEmpty()) throw new NotDeclaredValueException();
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Значение поля 'name' не может быть пустым!\n");
                }
                int health = 0;
                try {
                    health = Integer.parseInt(healthField.getText());
                    if (health <= 0) throw new NotDeclaredValueException();
                } catch (NumberFormatException exception) {
                    errors.append("Здоровье должно быть числом!\n");
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Здоровье должно быть больше 0!\n");
                }
                int heartCount = 0;
                try {
                    heartCount = Integer.parseInt(heartCountField.getText());
                    if (heartCount <= 0) throw new NotDeclaredValueException();
                } catch (NumberFormatException exception) {
                    errors.append("Кол-во сердец должно быть числом!\n");
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Кол-во сердец должно быть больше 0!\n");
                }
                String achieve = null;
                try {
                    achieve = achieveField.getText();
                    if (achieve.isEmpty()) throw new NotDeclaredValueException();
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Значение поля 'achievements' не может быть пустым!\n");
                }
                double x = 0;
                try {
                    x = Double.parseDouble(coorX.getText());
                    if (x <= -666) throw new NotDeclaredValueException();
                } catch (NumberFormatException exception) {
                    errors.append("Координата 'x' должна быть числом!\n");
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Координата 'x' должна быть больше -666!\n");
                }
                float y = 0;
                try {
                    y = Float.parseFloat(coorY.getText());
                    if (y <= -603) throw new NotDeclaredValueException();
                } catch (NumberFormatException exception) {
                    errors.append("Координата 'y' должна быть числом!\n");
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Координата 'y' должна быть больше -666!\n");
                }
                String chapterN = null;
                try {
                    chapterN = chapterName.getText();
                    if (chapterN.isEmpty()) throw new NotDeclaredValueException();
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Значение поля 'chapterName' не может быть пустым!\n");
                }
                String chapterL = null;
                try {
                    chapterL = chapterLegion.getText();
                    if (chapterL.isEmpty()) throw new NotDeclaredValueException();
                } catch (NotDeclaredValueException notDeclaredValueException) {
                    errors.append("Значение поля 'chapterLegion' не может быть пустым!\n");
                }
                if (errors.toString().equals("")) {
                    try {
                        client.send(new Request("insert",
                                String.valueOf(key),
                                new SpaceMarineLite(
                                        name, new Coordinates(x, y), health, heartCount, achieve, Weapon.valueOf(weaponTypeField.getItemAt(weaponTypeField.getSelectedIndex())), new Chapter(chapterN, chapterL)
                                ),
                                client.getUser()));
                        Response fromServer = client.receive();
                        JOptionPane.showMessageDialog(null, fromServer.getResponseBody());
                    } catch (IOException exception) {
                        JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                    } catch (ClassNotFoundException classNotFoundException) {
                        JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, errors.toString());
                }
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        insertPanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        backButton = new JButton();
        keyName = new JLabel();
        keyField = new JTextField();
        marineData = new JLabel();
        nameField = new JTextField();
        healthField = new JTextField();
        heartCountField = new JTextField();
        achieveField = new JTextField();
        weaponTypeField = new JComboBox<>();
        coordinatesData = new JLabel();
        coorX = new JTextField();
        coorY = new JTextField();
        chapterData = new JLabel();
        chapterName = new JTextField();
        chapterLegion = new JTextField();
        insertButton = new JButton();

        //======== insertPanel ========
        {
            insertPanel.setBackground(new Color(225, 183, 144));
            insertPanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
            .border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder
            .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.
            awt.Font.BOLD,12),java.awt.Color.red),insertPanel. getBorder()))
            ;insertPanel. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}})
            ;
            insertPanel.setLayout(new MigLayout(
                "insets 0,hidemode 3,align center center",
                // columns
                "[grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[grow,fill]",
                // rows
                "[80,grow,fill]" +
                "[25,fill]" +
                "[35,fill]" +
                "[25,fill]" +
                "[35,fill]" +
                "[25,fill]" +
                "[35,fill]" +
                "[25,fill]" +
                "[35,fill]" +
                "[35,fill]" +
                "[35,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setForeground(Color.white);
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 20));
            insertPanel.add(currentUser, "cell 1 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 40));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            insertPanel.add(name, "cell 2 0 3 1,align center center,grow 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(Color.white);
            backButton.setForeground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setBorder(new EtchedBorder());
            insertPanel.add(backButton, "cell 5 0,align center center,grow 0 0");

            //---- keyName ----
            keyName.setText("\u041a\u043b\u044e\u0447");
            keyName.setHorizontalAlignment(SwingConstants.CENTER);
            keyName.setFont(new Font("Arial", Font.BOLD, 14));
            keyName.setForeground(new Color(40, 61, 82));
            insertPanel.add(keyName, "cell 3 1");

            //---- keyField ----
            keyField.setHorizontalAlignment(SwingConstants.CENTER);
            keyField.setBackground(Color.white);
            keyField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            keyField.setBorder(new EtchedBorder());
            keyField.setToolTipText("key");
            insertPanel.add(keyField, "cell 3 2");

            //---- marineData ----
            marineData.setText("\u0414\u0430\u043d\u043d\u044b\u0435 \u043e SpaceMarine");
            marineData.setHorizontalAlignment(SwingConstants.CENTER);
            marineData.setFont(new Font("Arial", Font.BOLD, 14));
            marineData.setForeground(new Color(40, 61, 82));
            insertPanel.add(marineData, "cell 2 3 3 1");

            //---- nameField ----
            nameField.setBackground(Color.white);
            nameField.setHorizontalAlignment(SwingConstants.CENTER);
            nameField.setBorder(new EtchedBorder());
            nameField.setToolTipText("name");
            insertPanel.add(nameField, "cell 1 4");

            //---- healthField ----
            healthField.setHorizontalAlignment(SwingConstants.CENTER);
            healthField.setBackground(Color.white);
            healthField.setBorder(new EtchedBorder());
            healthField.setToolTipText("health");
            insertPanel.add(healthField, "cell 2 4");

            //---- heartCountField ----
            heartCountField.setHorizontalAlignment(SwingConstants.CENTER);
            heartCountField.setBackground(Color.white);
            heartCountField.setBorder(new EtchedBorder());
            heartCountField.setToolTipText("heartCount");
            insertPanel.add(heartCountField, "cell 3 4");

            //---- achieveField ----
            achieveField.setHorizontalAlignment(SwingConstants.CENTER);
            achieveField.setBackground(Color.white);
            achieveField.setBorder(new EtchedBorder());
            achieveField.setToolTipText("achievements");
            insertPanel.add(achieveField, "cell 4 4");

            //---- weaponTypeField ----
            weaponTypeField.setBackground(Color.white);
            weaponTypeField.setModel(new DefaultComboBoxModel<>(new String[] {
                "FLAMER",
                "BOLTGUN",
                "GRENADE"
            }));
            weaponTypeField.setBorder(new EtchedBorder());
            weaponTypeField.setSelectedIndex(1);
            insertPanel.add(weaponTypeField, "cell 5 4");

            //---- coordinatesData ----
            coordinatesData.setText("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b");
            coordinatesData.setHorizontalAlignment(SwingConstants.CENTER);
            coordinatesData.setFont(new Font("Arial", Font.BOLD, 14));
            coordinatesData.setForeground(new Color(40, 61, 82));
            insertPanel.add(coordinatesData, "cell 2 5 3 1");

            //---- coorX ----
            coorX.setHorizontalAlignment(SwingConstants.CENTER);
            coorX.setBackground(Color.white);
            coorX.setBorder(new EtchedBorder());
            coorX.setToolTipText("x");
            insertPanel.add(coorX, "cell 2 6");

            //---- coorY ----
            coorY.setHorizontalAlignment(SwingConstants.CENTER);
            coorY.setBackground(Color.white);
            coorY.setBorder(new EtchedBorder());
            coorY.setToolTipText("y");
            insertPanel.add(coorY, "cell 4 6");

            //---- chapterData ----
            chapterData.setText("\u0427\u0430\u0441\u0442\u044c");
            chapterData.setHorizontalAlignment(SwingConstants.CENTER);
            chapterData.setFont(new Font("Arial", Font.BOLD, 14));
            chapterData.setForeground(new Color(40, 61, 82));
            insertPanel.add(chapterData, "cell 2 7 3 1");

            //---- chapterName ----
            chapterName.setHorizontalAlignment(SwingConstants.CENTER);
            chapterName.setBackground(Color.white);
            chapterName.setBorder(new EtchedBorder());
            chapterName.setToolTipText("ChapterName");
            insertPanel.add(chapterName, "cell 2 8");

            //---- chapterLegion ----
            chapterLegion.setHorizontalAlignment(SwingConstants.CENTER);
            chapterLegion.setBackground(Color.white);
            chapterLegion.setBorder(new EtchedBorder());
            chapterLegion.setToolTipText("ChapterLegion");
            insertPanel.add(chapterLegion, "cell 4 8");

            //---- insertButton ----
            insertButton.setText("Insert");
            insertButton.setForeground(new Color(225, 183, 144));
            insertButton.setFont(new Font("Arial", Font.BOLD, 12));
            insertButton.setBackground(new Color(40, 61, 82));
            insertButton.setBorder(new EtchedBorder());
            insertPanel.add(insertButton, "cell 3 9");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel insertPanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton backButton;
    private JLabel keyName;
    private JTextField keyField;
    private JLabel marineData;
    private JTextField nameField;
    private JTextField healthField;
    private JTextField heartCountField;
    private JTextField achieveField;
    private JComboBox<String> weaponTypeField;
    private JLabel coordinatesData;
    private JTextField coorX;
    private JTextField coorY;
    private JLabel chapterData;
    private JTextField chapterName;
    private JTextField chapterLegion;
    private JButton insertButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JPanel getInsertPanel() {
        return insertPanel;
    }
}
