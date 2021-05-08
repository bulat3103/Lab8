/*
 * Created by JFormDesigner on Sat May 01 19:58:15 MSK 2021
 */

package clientModule.forms.MainMenuForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.*;

import clientModule.App;
import clientModule.Client;
import clientModule.forms.InsertForm.Insert;
import clientModule.forms.RemoveByWeaponForm.RemoveByWeapon;
import clientModule.forms.RemoveGreaterForm.RemoveGreater;
import clientModule.forms.RemoveKeyForm.RemoveKey;
import clientModule.forms.StartMenuForm.StartMenu;
import clientModule.forms.UpdateForm.Update;
import common.utility.Request;
import common.utility.Response;
import common.utility.ResponseCode;
import common.utility.User;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class MainMenu extends JPanel {
    public MainMenu(Client client) {
        initComponents();
        this.client = client;
        signOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.send(new Request("log_out", "", client.getUser()));
                    Response fromServer = client.receive();
                    if (fromServer.getResponseCode().equals(ResponseCode.OK)) {
                        client.setUser(null);
                        App.mainFrame.setContentPane(App.startMenu.getStartMenuPanel());
                        App.mainFrame.validate();
                    }
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                } catch (ClassNotFoundException classNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                }
            }
        });
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.send(new Request("info", "", client.getUser()));
                    Response fromServer = client.receive();
                    JOptionPane.showMessageDialog(null, fromServer.getResponseBody());
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                } catch (ClassNotFoundException classNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                }
            }
        });
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.send(new Request("history", "", client.getUser()));
                    Response fromServer = client.receive();
                    JOptionPane.showMessageDialog(null, fromServer.getResponseBody());
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                } catch (ClassNotFoundException classNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                }
            }
        });
        averHeartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.send(new Request("average_of_heart_count", "", client.getUser()));
                    Response fromServer = client.receive();
                    JOptionPane.showMessageDialog(null, fromServer.getResponseBody());
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                } catch (ClassNotFoundException classNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                }
            }
        });
        sumHealthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.send(new Request("sum_of_health", "", client.getUser()));
                    Response fromServer = client.receive();
                    JOptionPane.showMessageDialog(null, fromServer.getResponseBody());
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                } catch (ClassNotFoundException classNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                }
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.send(new Request("help", "", client.getUser()));
                    Response fromServer = client.receive();
                    JOptionPane.showMessageDialog(null, fromServer.getResponseBody());
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                } catch (ClassNotFoundException classNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                }
            }
        });
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.insert.getInsertPanel());
                App.mainFrame.validate();
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.update.getUpdatePanel());
                App.mainFrame.validate();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.send(new Request("clear", "", client.getUser()));
                    Response fromServer = client.receive();
                    JOptionPane.showMessageDialog(null, fromServer.getResponseBody());
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при отправке запроса на сервер!");
                } catch (ClassNotFoundException classNotFoundException) {
                    JOptionPane.showMessageDialog(null, "Произошла ошибка при получении ответа с сервера!");
                }
            }
        });
        rmGreaterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.removeGreater.getRemoveGreaterPanel());
                App.mainFrame.validate();
            }
        });
        rmKeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.removeKey.getRemoveKeyPanel());
                App.mainFrame.validate();
            }
        });
        rmWeaponTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.removeByWeapon.getRemoveByWeaponPanel());
                App.mainFrame.validate();
            }
        });
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.show.drawTable();
                App.mainFrame.setContentPane(App.show.getShowPanel());
                App.mainFrame.validate();
            }
        });
        scriptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.script.getScriptPanel());
                App.mainFrame.validate();
            }
        });
        visualizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.visualize.startThread();
                App.mainFrame.setContentPane(App.visualize.getVisualizePanel());
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
        mainMenuPanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        signOutButton = new JButton();
        name1 = new JLabel();
        insertButton = new JButton();
        updateButton = new JButton();
        name2 = new JLabel();
        showButton = new JButton();
        sumHealthButton = new JButton();
        visualizeButton = new JButton();
        averHeartButton = new JButton();
        name3 = new JLabel();
        rmKeyButton = new JButton();
        rmWeaponTypeButton = new JButton();
        rmGreaterButton = new JButton();
        clearButton = new JButton();
        name4 = new JLabel();
        infoButton = new JButton();
        historyButton = new JButton();
        scriptButton = new JButton();
        helpButton = new JButton();

        //======== mainMenuPanel ========
        {
            mainMenuPanel.setBackground(new Color(225, 183, 144));
            mainMenuPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,mainMenuPanel. getBorder( )) ); mainMenuPanel. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            mainMenuPanel.setLayout(new MigLayout(
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
                "[25,fill]" +
                "[35,fill]" +
                "[25,fill]" +
                "[35,fill]" +
                "[25,fill]" +
                "[35,fill]" +
                "[25,fill]" +
                "[35,fill]" +
                "[35,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setForeground(Color.white);
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 20));
            mainMenuPanel.add(currentUser, "cell 1 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 40));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            mainMenuPanel.add(name, "cell 2 0 4 1,align center center,grow 0 0");

            //---- signOutButton ----
            signOutButton.setText("\u0412\u044b\u0439\u0442\u0438");
            signOutButton.setBackground(Color.white);
            signOutButton.setForeground(new Color(40, 61, 82));
            signOutButton.setFont(new Font("Arial", Font.BOLD, 12));
            signOutButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(signOutButton, "cell 6 0,align center center,grow 0 0");

            //---- name1 ----
            name1.setText("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u0435/\u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435");
            name1.setForeground(new Color(40, 61, 82));
            name1.setFont(new Font("Arial", Font.BOLD, 14));
            name1.setHorizontalAlignment(SwingConstants.CENTER);
            mainMenuPanel.add(name1, "cell 2 1 4 1");

            //---- insertButton ----
            insertButton.setText("insert");
            insertButton.setBackground(new Color(40, 61, 82));
            insertButton.setFont(new Font("Arial", Font.BOLD, 12));
            insertButton.setForeground(new Color(225, 183, 144));
            insertButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(insertButton, "cell 3 2");

            //---- updateButton ----
            updateButton.setText("update");
            updateButton.setBackground(new Color(40, 61, 82));
            updateButton.setFont(new Font("Arial", Font.BOLD, 12));
            updateButton.setForeground(new Color(225, 183, 144));
            updateButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(updateButton, "cell 4 2");

            //---- name2 ----
            name2.setText("\u0418\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f \u043e\u0431 \u043e\u0431\u044a\u0435\u043a\u0442\u0430\u0445");
            name2.setForeground(new Color(40, 61, 82));
            name2.setFont(new Font("Arial", Font.BOLD, 14));
            name2.setHorizontalAlignment(SwingConstants.CENTER);
            mainMenuPanel.add(name2, "cell 2 3 4 1");

            //---- showButton ----
            showButton.setText("show");
            showButton.setForeground(new Color(225, 183, 144));
            showButton.setBackground(new Color(40, 61, 82));
            showButton.setFont(new Font("Arial", Font.BOLD, 12));
            showButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(showButton, "cell 2 4");

            //---- sumHealthButton ----
            sumHealthButton.setText("sumHealth");
            sumHealthButton.setForeground(new Color(225, 183, 144));
            sumHealthButton.setBackground(new Color(40, 61, 82));
            sumHealthButton.setFont(new Font("Arial", Font.BOLD, 12));
            sumHealthButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(sumHealthButton, "cell 3 4");

            //---- visualizeButton ----
            visualizeButton.setText("visualize");
            visualizeButton.setForeground(new Color(225, 183, 144));
            visualizeButton.setFont(new Font("Arial", Font.BOLD, 12));
            visualizeButton.setBackground(new Color(40, 61, 82));
            visualizeButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(visualizeButton, "cell 4 4");

            //---- averHeartButton ----
            averHeartButton.setText("averHeart");
            averHeartButton.setForeground(new Color(225, 183, 144));
            averHeartButton.setBackground(new Color(40, 61, 82));
            averHeartButton.setFont(new Font("Arial", Font.BOLD, 12));
            averHeartButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(averHeartButton, "cell 5 4");

            //---- name3 ----
            name3.setText("\u0423\u0434\u0430\u043b\u0435\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432");
            name3.setForeground(new Color(40, 61, 82));
            name3.setFont(new Font("Arial", Font.BOLD, 14));
            name3.setHorizontalAlignment(SwingConstants.CENTER);
            mainMenuPanel.add(name3, "cell 2 5 4 1");

            //---- rmKeyButton ----
            rmKeyButton.setText("byKey");
            rmKeyButton.setBackground(new Color(40, 61, 82));
            rmKeyButton.setForeground(new Color(225, 183, 144));
            rmKeyButton.setFont(new Font("Arial", Font.BOLD, 12));
            rmKeyButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(rmKeyButton, "cell 2 6");

            //---- rmWeaponTypeButton ----
            rmWeaponTypeButton.setText("byWeapon");
            rmWeaponTypeButton.setBackground(new Color(40, 61, 82));
            rmWeaponTypeButton.setForeground(new Color(225, 183, 144));
            rmWeaponTypeButton.setFont(new Font("Arial", Font.BOLD, 12));
            rmWeaponTypeButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(rmWeaponTypeButton, "cell 3 6");

            //---- rmGreaterButton ----
            rmGreaterButton.setText("greater");
            rmGreaterButton.setBackground(new Color(40, 61, 82));
            rmGreaterButton.setFont(new Font("Arial", Font.BOLD, 12));
            rmGreaterButton.setForeground(new Color(225, 183, 144));
            rmGreaterButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(rmGreaterButton, "cell 4 6");

            //---- clearButton ----
            clearButton.setText("clear");
            clearButton.setBackground(new Color(40, 61, 82));
            clearButton.setFont(new Font("Arial", Font.BOLD, 12));
            clearButton.setForeground(new Color(225, 183, 144));
            clearButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(clearButton, "cell 5 6");

            //---- name4 ----
            name4.setText("\u0421\u043b\u0443\u0436\u0435\u0431\u043d\u044b\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u044b");
            name4.setForeground(new Color(40, 61, 82));
            name4.setFont(new Font("Arial", Font.BOLD, 14));
            name4.setHorizontalAlignment(SwingConstants.CENTER);
            mainMenuPanel.add(name4, "cell 2 7 4 1");

            //---- infoButton ----
            infoButton.setText("info");
            infoButton.setForeground(new Color(225, 183, 144));
            infoButton.setFont(new Font("Arial", Font.BOLD, 12));
            infoButton.setBackground(new Color(40, 61, 82));
            infoButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(infoButton, "cell 2 8");

            //---- historyButton ----
            historyButton.setText("history");
            historyButton.setForeground(new Color(225, 183, 144));
            historyButton.setFont(new Font("Arial", Font.BOLD, 12));
            historyButton.setBackground(new Color(40, 61, 82));
            historyButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(historyButton, "cell 3 8");

            //---- scriptButton ----
            scriptButton.setText("script");
            scriptButton.setBackground(new Color(40, 61, 82));
            scriptButton.setFont(new Font("Arial", Font.BOLD, 12));
            scriptButton.setForeground(new Color(225, 183, 144));
            scriptButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(scriptButton, "cell 4 8");

            //---- helpButton ----
            helpButton.setText("help");
            helpButton.setForeground(new Color(225, 183, 144));
            helpButton.setFont(new Font("Arial", Font.BOLD, 12));
            helpButton.setBackground(new Color(40, 61, 82));
            helpButton.setBorder(new EtchedBorder());
            mainMenuPanel.add(helpButton, "cell 5 8");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel mainMenuPanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton signOutButton;
    private JLabel name1;
    private JButton insertButton;
    private JButton updateButton;
    private JLabel name2;
    private JButton showButton;
    private JButton sumHealthButton;
    private JButton visualizeButton;
    private JButton averHeartButton;
    private JLabel name3;
    private JButton rmKeyButton;
    private JButton rmWeaponTypeButton;
    private JButton rmGreaterButton;
    private JButton clearButton;
    private JLabel name4;
    private JButton infoButton;
    private JButton historyButton;
    private JButton scriptButton;
    private JButton helpButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client client;


    public JPanel getMainMenuPanel() {
        return mainMenuPanel;
    }
}
