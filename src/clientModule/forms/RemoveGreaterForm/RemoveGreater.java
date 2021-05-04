/*
 * Created by JFormDesigner on Mon May 03 22:08:03 MSK 2021
 */

package clientModule.forms.RemoveGreaterForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.*;

import clientModule.App;
import clientModule.Client;
import clientModule.forms.MainMenuForm.MainMenu;
import common.data.Chapter;
import common.data.Coordinates;
import common.data.Weapon;
import common.exceptions.NotDeclaredValueException;
import common.utility.Request;
import common.utility.Response;
import common.utility.SpaceMarineLite;
import common.utility.User;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class RemoveGreater extends JPanel {
    public RemoveGreater(Client client) {
        initComponents();
        this.client = client;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.mainMenu.getMainMenuPanel());
                App.mainFrame.validate();
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder errors = new StringBuilder();
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
                        client.send(new Request("remove_greater",
                                "",
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
                App.mainFrame.setContentPane(App.mainMenu.getMainMenuPanel());
                App.mainFrame.validate();
            }
        });
    }

    public void setUser(User user) {
        this.client.setUser(user);
        this.currentUser.setText(user.getLogin());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        removeGreaterPanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        backButton = new JButton();
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
        removeButton = new JButton();

        //======== removeGreaterPanel ========
        {
            removeGreaterPanel.setBackground(new Color(225, 183, 144));
            removeGreaterPanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
            new javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
            ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
            ,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12)
            ,java.awt.Color.red),removeGreaterPanel. getBorder()));removeGreaterPanel. addPropertyChangeListener(
            new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
            removeGreaterPanel.setLayout(new MigLayout(
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
                "[35,grow,fill]" +
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setForeground(Color.white);
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 20));
            removeGreaterPanel.add(currentUser, "cell 1 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 40));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            removeGreaterPanel.add(name, "cell 2 0 3 1,align center center,grow 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(Color.white);
            backButton.setForeground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setBorder(new EtchedBorder());
            removeGreaterPanel.add(backButton, "cell 5 0,align center center,grow 0 0");

            //---- marineData ----
            marineData.setText("\u0414\u0430\u043d\u043d\u044b\u0435 \u043e SpaceMarine");
            marineData.setHorizontalAlignment(SwingConstants.CENTER);
            marineData.setFont(new Font("Arial", Font.BOLD, 14));
            marineData.setForeground(new Color(40, 61, 82));
            removeGreaterPanel.add(marineData, "cell 2 2 3 1");

            //---- nameField ----
            nameField.setBackground(Color.white);
            nameField.setHorizontalAlignment(SwingConstants.CENTER);
            nameField.setBorder(new EtchedBorder());
            nameField.setToolTipText("name");
            removeGreaterPanel.add(nameField, "cell 1 3,aligny center,grow 100 0,height 25:30:50");

            //---- healthField ----
            healthField.setHorizontalAlignment(SwingConstants.CENTER);
            healthField.setBackground(Color.white);
            healthField.setBorder(new EtchedBorder());
            healthField.setToolTipText("health");
            removeGreaterPanel.add(healthField, "cell 2 3,aligny center,grow 100 0,height 25:30:50");

            //---- heartCountField ----
            heartCountField.setHorizontalAlignment(SwingConstants.CENTER);
            heartCountField.setBackground(Color.white);
            heartCountField.setBorder(new EtchedBorder());
            heartCountField.setToolTipText("heartCount");
            removeGreaterPanel.add(heartCountField, "cell 3 3,aligny center,grow 100 0,height 25:30:50");

            //---- achieveField ----
            achieveField.setHorizontalAlignment(SwingConstants.CENTER);
            achieveField.setBackground(Color.white);
            achieveField.setBorder(new EtchedBorder());
            achieveField.setToolTipText("achievements");
            removeGreaterPanel.add(achieveField, "cell 4 3,aligny center,grow 100 0,height 25:30:50");

            //---- weaponTypeField ----
            weaponTypeField.setBackground(Color.white);
            weaponTypeField.setModel(new DefaultComboBoxModel<>(new String[] {
                "FLAMER",
                "BOLTGUN",
                "GRENADE"
            }));
            weaponTypeField.setBorder(new EtchedBorder());
            weaponTypeField.setSelectedIndex(1);
            removeGreaterPanel.add(weaponTypeField, "cell 5 3,aligny center,grow 100 0,height 25:30:50");

            //---- coordinatesData ----
            coordinatesData.setText("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b");
            coordinatesData.setHorizontalAlignment(SwingConstants.CENTER);
            coordinatesData.setFont(new Font("Arial", Font.BOLD, 14));
            coordinatesData.setForeground(new Color(40, 61, 82));
            removeGreaterPanel.add(coordinatesData, "cell 2 4 3 1");

            //---- coorX ----
            coorX.setHorizontalAlignment(SwingConstants.CENTER);
            coorX.setBackground(Color.white);
            coorX.setBorder(new EtchedBorder());
            coorX.setToolTipText("x");
            removeGreaterPanel.add(coorX, "cell 2 5,aligny center,grow 100 0,height 25:30:50");

            //---- coorY ----
            coorY.setHorizontalAlignment(SwingConstants.CENTER);
            coorY.setBackground(Color.white);
            coorY.setBorder(new EtchedBorder());
            coorY.setToolTipText("y");
            removeGreaterPanel.add(coorY, "cell 4 5,aligny center,grow 100 0,height 25:30:50");

            //---- chapterData ----
            chapterData.setText("\u0427\u0430\u0441\u0442\u044c");
            chapterData.setHorizontalAlignment(SwingConstants.CENTER);
            chapterData.setFont(new Font("Arial", Font.BOLD, 14));
            chapterData.setForeground(new Color(40, 61, 82));
            removeGreaterPanel.add(chapterData, "cell 2 6 3 1");

            //---- chapterName ----
            chapterName.setHorizontalAlignment(SwingConstants.CENTER);
            chapterName.setBackground(Color.white);
            chapterName.setBorder(new EtchedBorder());
            chapterName.setToolTipText("ChapterName");
            removeGreaterPanel.add(chapterName, "cell 2 7,aligny center,grow 100 0,height 25:30:50");

            //---- chapterLegion ----
            chapterLegion.setHorizontalAlignment(SwingConstants.CENTER);
            chapterLegion.setBackground(Color.white);
            chapterLegion.setBorder(new EtchedBorder());
            chapterLegion.setToolTipText("ChapterLegion");
            removeGreaterPanel.add(chapterLegion, "cell 4 7,aligny center,grow 100 0,height 25:30:50");

            //---- removeButton ----
            removeButton.setText("Remove");
            removeButton.setForeground(new Color(225, 183, 144));
            removeButton.setFont(new Font("Arial", Font.BOLD, 12));
            removeButton.setBackground(new Color(40, 61, 82));
            removeButton.setBorder(new EtchedBorder());
            removeGreaterPanel.add(removeButton, "cell 3 9,aligny center,grow 100 0,height 30:30:50");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel removeGreaterPanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton backButton;
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
    private JButton removeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client client;


    public JPanel getRemoveGreaterPanel() {
        return removeGreaterPanel;
    }
}
