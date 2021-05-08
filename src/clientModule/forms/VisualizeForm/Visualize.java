/*
 * Created by JFormDesigner on Wed May 05 00:38:26 MSK 2021
 */

package clientModule.forms.VisualizeForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

import clientModule.App;
import clientModule.Client;
import common.data.SpaceMarine;
import common.utility.Request;
import common.utility.Response;
import common.utility.User;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Visualize extends JPanel {
    public Visualize(Client client) {
        initComponents();
        this.client = client;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.mainMenu.getMainMenuPanel());
                App.mainFrame.validate();
            }
        });
    }

    public void startThread() {
        Thread draw = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    drawObject();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignored) {}
                }
            }
        });
        draw.start();
    }

    public void drawObject() {
        try {
            client.send(new Request("show", "", client.getUser()));
            Response fromServer = client.receive();
            TreeMap<Integer, SpaceMarine> collection = fromServer.getCollection();
            if (collection.size() == 1) {
                SpaceMarine marine = collection.get(collection.firstKey());
                JButton button = new JButton(String.valueOf(marine.getId()));
                button.setFont(new Font("Arial", Font.BOLD, 12));
                Color color = Color.decode(App.userColor);
                button.setBackground(color);
                button.setForeground(new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue()));
                button.setBorder(new EtchedBorder());
                button.setBounds(getWidth() / 2, getHeight() / 2, 30, 20);
                button.setVisible(true);
                drawSpace.add(button);
                System.out.println(drawSpace.getComponent(0));
                drawSpace.revalidate();
                return;
            }
            int maxX = -1000;
            int minX = Integer.MAX_VALUE;
            int maxY = -1000;
            int minY = Integer.MAX_VALUE;
            int weight = (int) (drawSpace.getWidth() * 0.9);
            int height = (int) (drawSpace.getHeight() * 0.9);
            for (Map.Entry<Integer, SpaceMarine> e : collection.entrySet()) {
                if (e.getValue().getCoordinates().getX() > maxX) maxX = (int) e.getValue().getCoordinates().getX();
                if (e.getValue().getCoordinates().getX() < minX) minX = (int) e.getValue().getCoordinates().getX();
                if (e.getValue().getCoordinates().getY() > maxY)
                    maxY = (int) (double) e.getValue().getCoordinates().getY();
                if (e.getValue().getCoordinates().getY() < minY)
                    minY = (int) (double) e.getValue().getCoordinates().getY();
            }
            for (Map.Entry<Integer, SpaceMarine> e : collection.entrySet()) {
                int oldX = (int) e.getValue().getCoordinates().getX();
                int oldY = (int) (double) e.getValue().getCoordinates().getY();
                int x = (int) (oldX - minX + (drawSpace.getWidth() * 0.05)) * (weight / (maxX - minX));
                int y = (int) (oldY - minY + (drawSpace.getHeight() * 0.05)) * (height / (maxY - minY));
                JButton button = new JButton();
                button.setText(String.valueOf(e.getValue().getId()));
                button.setFont(new Font("Arial", Font.BOLD, 12));
                Color color = Color.decode(App.userColor);
                button.setBackground(color);
                button.setForeground(new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue()));
                button.setBorder(new EtchedBorder());
                button.setBounds(x, y, 30, 20);
                button.setVisible(true);
                drawSpace.add(button);
                drawSpace.revalidate();
            }
        } catch (IOException | ClassNotFoundException ignored) {}
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        visualizePanel = new JPanel();
        currentUser = new JLabel();
        name = new JLabel();
        backButton = new JButton();
        drawSpace = new JPanel();

        //======== visualizePanel ========
        {
            visualizePanel.setBackground(new Color(225, 183, 144));
            visualizePanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
            (0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border
            .TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),visualizePanel. getBorder()));visualizePanel. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
            propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
            visualizePanel.setLayout(new MigLayout(
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
            visualizePanel.add(currentUser, "cell 0 0");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 36));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            visualizePanel.add(name, "cell 2 0,align center center,grow 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setForeground(Color.white);
            backButton.setBorder(new EtchedBorder());
            visualizePanel.add(backButton, "cell 4 0,align center center,grow 0 0,width 70:70:100");

            //======== drawSpace ========
            {
                drawSpace.setBackground(new Color(225, 183, 144));
                drawSpace.setLayout(null);

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
            visualizePanel.add(drawSpace, "cell 0 1 5 8");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void setUser(User user) {
        this.client.setUser(user);
        this.currentUser.setText(user.getLogin());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel visualizePanel;
    private JLabel currentUser;
    private JLabel name;
    private JButton backButton;
    private JPanel drawSpace;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client client;

    public JPanel getVisualizePanel() {
        return visualizePanel;
    }

    public JPanel getDrawSpace() {
        return drawSpace;
    }
}
