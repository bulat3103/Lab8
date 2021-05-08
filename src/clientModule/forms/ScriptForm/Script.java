/*
 * Created by JFormDesigner on Thu May 06 21:20:03 MSK 2021
 */

package clientModule.forms.ScriptForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.*;

import clientModule.App;
import clientModule.Client;
import clientModule.utility.Console;
import common.utility.Request;
import common.utility.Response;
import common.utility.User;
import net.miginfocom.swing.*;
import resources.LocaleBundle;

/**
 * @author unknown
 */
public class Script extends JPanel {
    public Script(Client client) {
        initComponents();
        this.client = client;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.mainMenu.getMainMenuPanel());
                App.mainFrame.validate();
            }
        });
        chooseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnVal = fileChooser.showOpenDialog(scriptPanel);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    String path = fileChooser.getSelectedFile().getAbsolutePath();
                    try {
                        File file = new File(path);
                        Console console = new Console(new Scanner(file), file, textPane);
                        Request request = console.interactiveMode(null, client.getUser());
                        if (request == null) {
                            textPane.setText(textPane.getText() + "Не удалось выполнить команду! Проверьте правильность ввода аргументов!\n");
                        } else {
                            try {
                                client.send(request);
                                Response fromServer = client.receive();
                                textPane.setText(textPane.getText() + fromServer.getResponseBody() + "\n");
                            } catch (IOException exception) {
                                textPane.setText(textPane.getText() + "Произошла ошибка при отправке запроса на сервер!\n");
                            } catch (ClassNotFoundException classNotFoundException) {
                                textPane.setText(textPane.getText() + "Произошла ошибка при получении ответа с сервера!\n");
                            }
                        }
                    } catch (FileNotFoundException exception) {
                        JOptionPane.showMessageDialog(null, "Не удалось найти файл!");
                    }
                }
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scriptPanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        backButton = new JButton();
        chooseFileButton = new JButton();
        scrollPane1 = new JScrollPane();
        textPane = new JTextPane();

        //======== scriptPanel ========
        {
            scriptPanel.setBackground(new Color(225, 183, 144));
            scriptPanel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
            javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax
            . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
            . awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,java . awt
            . Color .red ) ,scriptPanel. getBorder () ) ); scriptPanel. addPropertyChangeListener( new java. beans .
            PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .
            equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            scriptPanel.setLayout(new MigLayout(
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
                "[25,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[25,grow,fill]" +
                "[25,grow,fill]" +
                "[25,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setForeground(Color.white);
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 20));
            scriptPanel.add(currentUser, "cell 1 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 40));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            scriptPanel.add(name, "cell 2 0 4 1,align center center,grow 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(Color.white);
            backButton.setForeground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setBorder(new EtchedBorder());
            scriptPanel.add(backButton, "cell 6 0,align center center,grow 0 0");

            //---- chooseFileButton ----
            chooseFileButton.setText("\u0412\u044b\u0431\u0440\u0430\u0442\u044c \u0444\u0430\u0439\u043b");
            chooseFileButton.setForeground(new Color(225, 183, 144));
            chooseFileButton.setFont(new Font("Arial", Font.BOLD, 12));
            chooseFileButton.setBackground(new Color(40, 61, 82));
            scriptPanel.add(chooseFileButton, "cell 3 1 2 1,aligny center,grow 100 0,height 30:35:55");

            //======== scrollPane1 ========
            {

                //---- textPane ----
                textPane.setBackground(Color.white);
                scrollPane1.setViewportView(textPane);
            }
            scriptPanel.add(scrollPane1, "cell 2 3 4 7");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void localize() {
        backButton.setText(LocaleBundle.getCurrentBundle().getString("back_button"));
        chooseFileButton.setText(LocaleBundle.getCurrentBundle().getString("script_chooseFileButton"));
    }

    public void setUser(User user) {
        this.client.setUser(user);
        this.currentUser.setText(user.getLogin());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel scriptPanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton backButton;
    private JButton chooseFileButton;
    private JScrollPane scrollPane1;
    private JTextPane textPane;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client client;

    public JPanel getScriptPanel() {
        return scriptPanel;
    }
}
